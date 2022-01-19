package service.abstraction;

import java.util.ArrayList;

import model.request.PantalonRequest;
import model.request.PrendaRequest;

public interface ICotizacionPantalon {
	public void cotizacionPantalon(int nroIdentificacion, String fechaHora, int codigoVendedor,
			PrendaRequest prendaRequest, PantalonRequest pantalonRequest, int cantidadUnidadesCotizadas,
			int precioUnitario, ArrayList<String[]> sublistaPantalones);
}
