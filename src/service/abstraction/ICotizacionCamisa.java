package service.abstraction;

import java.util.ArrayList;

import model.request.CamisaRequest;
import model.request.PrendaRequest;

public interface ICotizacionCamisa {
	public void cotizacionCamisa(int nroIdentificacion, String fechaHora, int codigoVendedor,
			PrendaRequest prendaRequest, CamisaRequest camisaRequest, int cantidadUnidadesCotizadas, int precioUnitario,
			ArrayList<String[]> sublistaCamisas);
}
