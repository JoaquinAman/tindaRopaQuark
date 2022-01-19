package service.abstraction;

import model.request.CamisaRequest;
import model.request.PantalonRequest;
import model.request.PrendaRequest;

public interface ICotizacion {
	public float cotizarCamisa(CamisaRequest camisaRequest, PrendaRequest prendaRequest, int cantidadUnidadesCotizadas,
			float precioUnitario);

	public float cotizarPantalon(PantalonRequest pantalonRequest, PrendaRequest prendaRequest,
			int cantidadUnidadesCotizadas, float precioUnitario);
}
