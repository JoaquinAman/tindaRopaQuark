package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.VendedorController;
import exceptions.NoNumericException;
import exceptions.PrendaException;
import exceptions.PriceAmountException;
import exceptions.SpecificationNotSelectedException;
import exceptions.StockException;
import model.Cotizacion;
import model.TiendaDeRopa;
import model.Vendedor;
import model.request.CamisaRequest;
import model.request.PantalonRequest;
import model.request.PrendaRequest;

public class Marco extends JFrame {

	private Lamina_JLabel lamina_Informacion;
	private Lamina_BotonesRadio lamina_tipo_prenda, lamina_calidad_prenda, lamina_precio, lamina_cantidad,
			lamina_manga_corta, lamina_cuello_mao, lamina_pantalon_chupin;
	private Lamina_BotonesCheck lamina_historial_cotizacion;

	public Marco(TiendaDeRopa tiendaDeRopa, Vendedor vendedor) {

		setTitle("Cotizador Express");

		setBounds(200, 100, 900, 450);

		JPanel lamina_cuadricula = new JPanel();

		lamina_cuadricula.setLayout(new GridLayout(2, 3));

		lamina_Informacion = new Lamina_JLabel("Informacion",
				new String[] { tiendaDeRopa.getNombre(), tiendaDeRopa.getDireccion(),
						vendedor.getName() + " " + vendedor.getApellido(),
						Integer.toString(vendedor.getCodigoVendedor()) });

		lamina_tipo_prenda = new Lamina_BotonesRadio("Tipo de Prenda", new String[] {

				"", "Camisa", "Pantalon",

		});

		lamina_manga_corta = new Lamina_BotonesRadio("Manga de Camisa", new String[] {

				"", "Manga corta", "Manga larga"

		});

		lamina_cuello_mao = new Lamina_BotonesRadio("Cuello de Camisa", new String[] {

				"", "Cuello mao", "Cuello comun"

		});

		lamina_pantalon_chupin = new Lamina_BotonesRadio("Tipo de Pantalon", new String[] {

				"", "Pantalon comun", "Pantalon chupin"

		});

		lamina_calidad_prenda = new Lamina_BotonesRadio("Calidad de Prenda", new String[] {

				"", "Standard", "Premium" });

		lamina_precio = new Lamina_BotonesRadio("Precio unitario");

		lamina_cantidad = new Lamina_BotonesRadio("Cantidad unidades");

		lamina_historial_cotizacion = new Lamina_BotonesCheck("Historial de Cotizaciones");

		setLayout(new BorderLayout());

		lamina_cuadricula.add(lamina_Informacion);

		lamina_cuadricula.add(lamina_tipo_prenda);

		lamina_cuadricula.add(lamina_manga_corta);

		lamina_cuadricula.add(lamina_cuello_mao);

		lamina_cuadricula.add(lamina_pantalon_chupin);

		lamina_cuadricula.add(lamina_calidad_prenda);

		lamina_cuadricula.add(lamina_precio);

		lamina_cuadricula.add(lamina_cantidad);

		lamina_cuadricula.add(lamina_historial_cotizacion);

		JPanel lamina_mostrar = new JPanel();

		JButton boton_cotizar = new JButton("Cotizar");

		boton_cotizar.addActionListener(new AccionMostrar());

		lamina_mostrar.add(boton_cotizar);

		add(lamina_mostrar, BorderLayout.SOUTH);

		add(lamina_cuadricula, BorderLayout.CENTER);
	}

	public Lamina_JLabel getLamina_Informacion() {
		return lamina_Informacion;
	}

	public void setLamina_Informacion(Lamina_JLabel lamina_Informacion) {
		this.lamina_Informacion = lamina_Informacion;
	}

	public Lamina_BotonesRadio getLamina_tipo_prenda() {
		return lamina_tipo_prenda;
	}

	public void setLamina_tipo_prenda(Lamina_BotonesRadio lamina_tipo_prenda) {
		this.lamina_tipo_prenda = lamina_tipo_prenda;
	}

	public Lamina_BotonesRadio getLamina_calidad_prenda() {
		return lamina_calidad_prenda;
	}

	public void setLamina_calidad_prenda(Lamina_BotonesRadio lamina_calidad_prenda) {
		this.lamina_calidad_prenda = lamina_calidad_prenda;
	}

	public Lamina_BotonesRadio getLamina_precio() {
		return lamina_precio;
	}

	public void setLamina_precio(Lamina_BotonesRadio lamina_precio) {
		this.lamina_precio = lamina_precio;
	}

	public Lamina_BotonesRadio getLamina_cantidad() {
		return lamina_cantidad;
	}

	public void setLamina_cantidad(Lamina_BotonesRadio lamina_cantidad) {
		this.lamina_cantidad = lamina_cantidad;
	}

	public Lamina_BotonesRadio getLamina_manga_corta() {
		return lamina_manga_corta;
	}

	public void setLamina_manga_corta(Lamina_BotonesRadio lamina_manga_corta) {
		this.lamina_manga_corta = lamina_manga_corta;
	}

	public Lamina_BotonesRadio getLamina_cuello_mao() {
		return lamina_cuello_mao;
	}

	public void setLamina_cuello_mao(Lamina_BotonesRadio lamina_cuello_mao) {
		this.lamina_cuello_mao = lamina_cuello_mao;
	}

	public Lamina_BotonesRadio getLamina_pantalon_chupin() {
		return lamina_pantalon_chupin;
	}

	public void setLamina_pantalon_chupin(Lamina_BotonesRadio lamina_pantalon_chupin) {
		this.lamina_pantalon_chupin = lamina_pantalon_chupin;
	}

	public Lamina_BotonesCheck getLamina_historial_cotizacion() {
		return lamina_historial_cotizacion;
	}

	public void setLamina_historial_cotizacion(Lamina_BotonesCheck lamina_historial_cotizacion) {
		this.lamina_historial_cotizacion = lamina_historial_cotizacion;
	}

	public void recibeMain(TiendaDeRopa tiendaDeRopa, Cotizacion cotizacion, VendedorController vendedorController,
			PrendaRequest prendaRequest, CamisaRequest camisaRequest, PantalonRequest pantalonRequest,
			Vendedor vendedor, ArrayList<String[]> sublistaCamisas, ArrayList<String[]> sublistaPantalones) {
		this.tiendaDeRopa = tiendaDeRopa;
		this.cotizacion = cotizacion;
		this.vendedorController = vendedorController;
		this.prendaRequest = prendaRequest;
		this.camisaRequest = camisaRequest;
		this.pantalonRequest = pantalonRequest;
		this.vendedor = vendedor;

		this.sublistaCamisas = sublistaCamisas;
		this.sublistaPantalones = sublistaPantalones;

	}

	TiendaDeRopa tiendaDeRopa;
	Cotizacion cotizacion;
	VendedorController vendedorController;

	PrendaRequest prendaRequest;
	CamisaRequest camisaRequest;
	PantalonRequest pantalonRequest;
	Vendedor vendedor;

	ArrayList<String[]> sublistaCamisas;
	ArrayList<String[]> sublistaPantalones;

	int precioUnitario, cantidadUnidadesCotizadas;

	// -------------------------------------------------------
	private class AccionMostrar implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub

			Date date = new Date();
			Instant instant = date.toInstant();
			LocalDateTime ldt = instant.atOffset(ZoneOffset.UTC).toLocalDateTime();
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("'dia: 'yyyy-MM-dd 'hora:' HH:mm:ss");
			String fechaHora = ldt.format(fmt);

			if (getLamina_tipo_prenda().dameSeleccion().equals("Camisa")) {

				if (getLamina_calidad_prenda().dameSeleccion().equals("Standard")) {
					prendaRequest.setStandard(true);
				} else if (getLamina_calidad_prenda().dameSeleccion().equals("Premium")) {
					prendaRequest.setStandard(false);
				} else {
					prendaRequest.setCalidadSeleccionada(false);
				}

				if (getLamina_manga_corta().dameSeleccion().equals("Manga corta")) {
					camisaRequest.setMangaCorta(true);
				} else if (getLamina_manga_corta().dameSeleccion().equals("Manga larga")) {
					camisaRequest.setMangaCorta(false);
				} else {
					camisaRequest.setMangaSeleccionada(false);
				}

				if (getLamina_cuello_mao().dameSeleccion().equals("Cuello mao")) {
					camisaRequest.setCuelloMao(true);
				} else if (getLamina_cuello_mao().dameSeleccion().equals("Cuello mao")) {
					camisaRequest.setCuelloMao(false);
				} else {
					camisaRequest.setCuelloSeleccionado(false);
				}
				try {

					vendedorController.cotizacionCamisa(cotizacion.getId(), fechaHora, vendedor.getCodigoVendedor(),
							prendaRequest, camisaRequest, sublistaCamisas, lamina_pantalon_chupin, lamina_precio,
							lamina_cantidad, cotizacion, tiendaDeRopa);

				} catch (PrendaException | StockException | SpecificationNotSelectedException | NumberFormatException
						| PriceAmountException | NoNumericException e1) {

					System.out.println(e1.getMessage());
				}

				getLamina_tipo_prenda().getBotonVacio().setSelected(true);
				getLamina_manga_corta().getBotonVacio().setSelected(true);
				getLamina_cuello_mao().getBotonVacio().setSelected(true);
				getLamina_pantalon_chupin().getBotonVacio().setSelected(true);
				getLamina_calidad_prenda().getBotonVacio().setSelected(true);
				getLamina_cantidad().getText().setText("");
				getLamina_precio().getText().setText("");
			}

			if (getLamina_tipo_prenda().dameSeleccion().equals("Pantalon")) {

				if (getLamina_calidad_prenda().dameSeleccion().equals("Standard")) {
					prendaRequest.setStandard(true);
				} else if (getLamina_calidad_prenda().dameSeleccion().equals("Premium")) {
					prendaRequest.setStandard(false);
				} else {
					prendaRequest.setCalidadSeleccionada(false);
				}

				if (getLamina_pantalon_chupin().dameSeleccion().equals("Pantalon comun")) {
					pantalonRequest.setComun(true);
				} else if (getLamina_pantalon_chupin().dameSeleccion().equals("Pantalon chupin")) {
					pantalonRequest.setComun(false);
				} else {
					pantalonRequest.setTipoSeleccionado(false);
				}
				VendedorController vendedorController = new VendedorController();

				try {

					vendedorController.cotizacionPantalon(cotizacion.getId(), fechaHora, vendedor.getCodigoVendedor(),
							prendaRequest, pantalonRequest, sublistaPantalones, lamina_manga_corta, lamina_precio,
							lamina_cantidad, cotizacion, tiendaDeRopa);

				} catch (PrendaException | StockException | SpecificationNotSelectedException | NumberFormatException
						| PriceAmountException | NoNumericException e2) {

					System.out.println(e2.getMessage());
				}

				getLamina_tipo_prenda().getBotonVacio().setSelected(true);
				getLamina_manga_corta().getBotonVacio().setSelected(true);
				getLamina_cuello_mao().getBotonVacio().setSelected(true);
				getLamina_pantalon_chupin().getBotonVacio().setSelected(true);
				getLamina_calidad_prenda().getBotonVacio().setSelected(true);
				getLamina_cantidad().getText().setText("");
				getLamina_precio().getText().setText("");
			}

			if (lamina_historial_cotizacion.getBot().isSelected()) {

				VendedorController VendedorController = new VendedorController();

				VendedorController.ImprimeHistorialTodo(vendedor, sublistaCamisas, sublistaPantalones);

				getLamina_historial_cotizacion().getBot().setSelected(false);
			}
		}
	}
}
