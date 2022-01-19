package model;

public class Pantalon extends Prenda {
	private boolean comun;

	public Pantalon() {
	}

	public Pantalon(boolean comun) {
		super();
		this.comun = comun;
	}

	public boolean isComun() {
		return comun;
	}

	public void setComun(boolean comun) {
		this.comun = comun;
	}
}
