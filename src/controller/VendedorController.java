package controller;

import java.util.ArrayList;

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
import service.VendedorImpl;
import view.Lamina_BotonesRadio;

public class VendedorController {

	private VendedorImpl vendedorImpl = new VendedorImpl();

	public void cotizacionCamisa(int nroIdentificacion, String fechaHora, int codigoVendedor,
			PrendaRequest prendaRequest, CamisaRequest camisaRequest, ArrayList<String[]> sublistaCamisas,
			Lamina_BotonesRadio lamina_pantalon_chupin, Lamina_BotonesRadio lamina_precio,
			Lamina_BotonesRadio lamina_cantidad, Cotizacion cotizacion, TiendaDeRopa tiendaDeRopa)
			throws PrendaException, StockException, SpecificationNotSelectedException, NumberFormatException,
			PriceAmountException, NoNumericException {

		if (lamina_pantalon_chupin.dameSeleccion().equals("Pantalon chupin")
				|| lamina_pantalon_chupin.dameSeleccion().equals("Pantalon comun")) {
			throw new PrendaException();
		}

		if ((lamina_precio.getText().getText().equals("")) || lamina_cantidad.getText().getText().equals("")) {
			throw new PriceAmountException();
		}

		boolean precioEsNumero = isNumeric(lamina_precio.getText().getText());
		boolean cantidadEsNumero = isNumeric(lamina_cantidad.getText().getText());
		int cantidad = 0;
		int precio = 0;
		if (cantidadEsNumero) {
			cantidad = Integer.parseInt(lamina_cantidad.getText().getText());
			precio = Integer.parseInt(lamina_precio.getText().getText());
			if (cantidad > tiendaDeRopa.getCamisasParaVender().size()) {
				throw new StockException();
			}
		}

		if (!precioEsNumero || !cantidadEsNumero) {
			throw new NoNumericException();
		}

		if (!prendaRequest.isCalidadSeleccionada() || !camisaRequest.isMangaSeleccionada()
				|| !camisaRequest.isCuelloSeleccionado()) {
			throw new SpecificationNotSelectedException();
		}

		vendedorImpl.cotizacionCamisa(nroIdentificacion, fechaHora, codigoVendedor, prendaRequest, camisaRequest,
				cantidad, precio, sublistaCamisas);
	}

	public void cotizacionPantalon(int nroIdentificacion, String fechaHora, int codigoVendedor,
			PrendaRequest prendaRequest, PantalonRequest pantalonRequest,

			ArrayList<String[]> sublistaPantalones, Lamina_BotonesRadio lamina_manga_corta,
			Lamina_BotonesRadio lamina_precio, Lamina_BotonesRadio lamina_cantidad, Cotizacion cotizacion,
			TiendaDeRopa tiendaDeRopa) throws PrendaException, StockException, SpecificationNotSelectedException,
			NumberFormatException, PriceAmountException, NoNumericException {

		if (lamina_manga_corta.dameSeleccion().equals("Manga corta")
				|| lamina_manga_corta.dameSeleccion().equals("Manga larga"))
			throw new PrendaException();

		if ((lamina_precio.getText().getText().equals("")) || lamina_cantidad.getText().getText().equals("")) {
			throw new PriceAmountException();
		}
		boolean precioEsNumero = isNumeric(lamina_precio.getText().getText());
		boolean cantidadEsNumero = isNumeric(lamina_cantidad.getText().getText());
		int cantidad = 0;
		int precio = 0;
		if (cantidadEsNumero) {
			cantidad = Integer.parseInt(lamina_cantidad.getText().getText());
			precio = Integer.parseInt(lamina_precio.getText().getText());
			if (cantidad > tiendaDeRopa.getPantalonesParaVender().size()) {
				throw new StockException();
			}
		}

		if (!precioEsNumero || !cantidadEsNumero) {
			throw new NoNumericException();
		}

		if (!prendaRequest.isCalidadSeleccionada() || !pantalonRequest.isTipoSeleccionado()) {
			throw new SpecificationNotSelectedException();
		}

		vendedorImpl.cotizacionPantalon(nroIdentificacion, fechaHora, codigoVendedor, prendaRequest, pantalonRequest,
				cantidad, precio, sublistaPantalones);
	}

	public static boolean isNumeric(String str) {
		try {
			Double.parseDouble(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public void ImprimeHistorialTodo(Vendedor vendedor, ArrayList<String[]> sublistaCamisas,
			ArrayList<String[]> sublistaPantalones) {

		vendedorImpl.imprimeHistorialTodo(sublistaCamisas, sublistaPantalones);
	}

	public VendedorController() {
	}

	public VendedorController(VendedorImpl vendedorImpl) {
		super();
		this.vendedorImpl = vendedorImpl;
	}

	public VendedorImpl getVendedorImpl() {
		return vendedorImpl;
	}

	public void setVendedorImpl(VendedorImpl vendedorImpl) {
		this.vendedorImpl = vendedorImpl;
	}

}