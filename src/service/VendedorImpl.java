package service;

import java.util.ArrayList;
import java.util.Arrays;

import model.request.CamisaRequest;
import model.request.PantalonRequest;
import model.request.PrendaRequest;
import service.abstraction.ICotizacionCamisa;
import service.abstraction.ICotizacionPantalon;
import service.abstraction.IImprimirHistorial;

public class VendedorImpl implements ICotizacionCamisa, ICotizacionPantalon, IImprimirHistorial {

	@Override
	public void cotizacionCamisa(int nroIdentificacion, String fechaHora, int codigoVendedor,
			PrendaRequest prendaRequest, CamisaRequest camisaRequest, int cantidadUnidadesCotizadas, int precioUnitario,
			ArrayList<String[]> sublistaCamisas) {
		CotizacionImpl cotizacionImpl = new CotizacionImpl();
		float RtoCalculoCotizacionCamisa = cotizacionImpl.cotizarCamisa(camisaRequest, prendaRequest,
				cantidadUnidadesCotizadas, precioUnitario);

		String manga;
		if (camisaRequest.isMangaCorta())
			manga = "Manga Corta";
		else
			manga = "Manga Larga";

		String cuello;
		if (camisaRequest.isCuelloMao())
			cuello = "Cuello Mao";
		else
			cuello = "Cuello Comun";

		String tipoPrenda;
		if (prendaRequest.isStandard())
			tipoPrenda = "Standard";
		else
			tipoPrenda = "Premium";

		String arrayCamisa[] = new String[6];

		arrayCamisa[0] = fechaHora;
		arrayCamisa[1] = manga;
		arrayCamisa[2] = cuello;
		arrayCamisa[3] = tipoPrenda;
		arrayCamisa[4] = "Rto calculo cotizacion: " + Float.toString(RtoCalculoCotizacionCamisa);
		arrayCamisa[5] = "Cantidad a cotizar: " + Integer.toString(cantidadUnidadesCotizadas);

		sublistaCamisas.add(arrayCamisa);

	}

	@Override
	public void cotizacionPantalon(int nroIdentificacion, String fechaHora, int codigoVendedor,
			PrendaRequest prendaRequest, PantalonRequest pantalonRequest, int cantidadUnidadesCotizadas,
			int precioUnitario, ArrayList<String[]> sublistaPantalones) {
		CotizacionImpl cotizacionImpl = new CotizacionImpl();
		float RtoCalculoCotizacionPantalon = cotizacionImpl.cotizarPantalon(pantalonRequest, prendaRequest,
				cantidadUnidadesCotizadas, precioUnitario);

		String tipoPantalon;
		if (pantalonRequest.isComun())
			tipoPantalon = "Pantalon Comun";
		else
			tipoPantalon = "Pantalon Chupin";

		String tipoPrenda;
		if (prendaRequest.isStandard())
			tipoPrenda = "Standard";
		else
			tipoPrenda = "Premium";

		String arrayPantalon[] = new String[5];

		arrayPantalon[0] = fechaHora;
		arrayPantalon[1] = tipoPantalon;
		arrayPantalon[2] = tipoPrenda;
		arrayPantalon[3] = "Rto calculo cotizacion: " + Float.toString(RtoCalculoCotizacionPantalon);
		arrayPantalon[4] = "Cantidad a cotizar: " + Integer.toString(cantidadUnidadesCotizadas);

		sublistaPantalones.add(arrayPantalon);

	}

	@Override
	public void imprimeHistorialTodo(ArrayList<String[]> sublistaCamisas, ArrayList<String[]> sublistaPantalones) {
		if ((sublistaCamisas.size() == 0) && (sublistaPantalones.size() == 0)) {
			System.out.println("Aun no hay prendas cotizadas.");
		}

		if (sublistaCamisas.size() > 0) {
			System.out.println("Historial de CAMISAS");

			for (String[] str : sublistaCamisas) {
				System.out.println(Arrays.toString(str));
			}
		}
		System.out.println();
		if (sublistaPantalones.size() > 0) {
			System.out.println("Historial de PANTALONES");

			for (String[] str1 : sublistaPantalones) {
				System.out.println(Arrays.toString(str1));
			}
		}
	}

}
