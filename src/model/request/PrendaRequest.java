package model.request;

public class PrendaRequest {
	private boolean standard;
	private int precioUnitario;
	private int cantidadUnidadesEnStock;
	private boolean calidadSeleccionada = true;

	public PrendaRequest() {
	}

	public PrendaRequest(boolean standard, int precioUnitario, int cantidadUnidadesEnStock) {
		super();
		this.standard = standard;
		this.precioUnitario = precioUnitario;
		this.cantidadUnidadesEnStock = cantidadUnidadesEnStock;
	}

	public boolean isStandard() {
		return standard;
	}

	public void setStandard(boolean stantard) {
		this.standard = stantard;
	}

	public int getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public int getCantidadUnidadesEnStock() {
		return cantidadUnidadesEnStock;
	}

	public void setCantidadUnidadesEnStock(int cantidadUnidadesEnStock) {
		this.cantidadUnidadesEnStock = cantidadUnidadesEnStock;
	}

	public boolean isCalidadSeleccionada() {
		return calidadSeleccionada;
	}

	public void setCalidadSeleccionada(boolean calidadSeleccionada) {
		this.calidadSeleccionada = calidadSeleccionada;
	}
}
