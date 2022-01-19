package service;

import model.request.CamisaRequest;
import model.request.PantalonRequest;
import model.request.PrendaRequest;
import service.abstraction.ICotizacion;

public class CotizacionImpl implements ICotizacion {

	@Override
	public float cotizarCamisa(CamisaRequest camisaRequest, PrendaRequest prendaRequest, int cantidadUnidadesCotizadas,
			float precioUnitario) {
		boolean isMangaCorta = camisaRequest.isMangaCorta();
		boolean isCuelloMao = camisaRequest.isCuelloMao();
		boolean isStandard = prendaRequest.isStandard();

		// RN 3
		if (isMangaCorta && isCuelloMao) {
			precioUnitario -= precioUnitario / 10;

			precioUnitario += (precioUnitario * 3) / 100;

		} else {
			// RN 1
			if (isMangaCorta) {

				precioUnitario -= precioUnitario / 10;

			}

			// RN 2
			if (isCuelloMao) {

				precioUnitario += (precioUnitario * 3) / 100;

			}
		}
		// RN 5
		if (!isStandard) {

			precioUnitario += (precioUnitario * 30) / 100;

		}
		float RtoCalculoDeCotizacionCamisa = cantidadUnidadesCotizadas * precioUnitario;
		return RtoCalculoDeCotizacionCamisa;
	}

	@Override
	public float cotizarPantalon(PantalonRequest pantalonRequest, PrendaRequest prendaRequest,
			int cantidadUnidadesCotizadas, float precioUnitario) {
		boolean isComun = pantalonRequest.isComun();
		boolean isStandard = prendaRequest.isStandard();

		// RN 4
		if (!isComun) {

			precioUnitario -= (precioUnitario * 12) / 100;

		}

		// RN 5
		if (!isStandard) {

			precioUnitario += (precioUnitario * 30) / 100;

		}
		float RtoCalculoDeCotizacionPantalon = cantidadUnidadesCotizadas * precioUnitario;

		return RtoCalculoDeCotizacionPantalon;

	}

}
