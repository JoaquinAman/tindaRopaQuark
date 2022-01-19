package model;

public class Prenda {
	private boolean standard;
	private int precioUnitario;
	private int cantidadUnidadesEnStock;

	public Prenda() {
	}

	public Prenda(boolean standard, int precioUnitario, int cantidadUnidadesEnStock) {
		super();
		this.standard = standard;
		this.precioUnitario = precioUnitario;
		this.cantidadUnidadesEnStock = cantidadUnidadesEnStock;
	}

	public boolean isStandard() {
		return standard;
	}

	public void setStandard(boolean standard) {
		this.standard = standard;
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
}
