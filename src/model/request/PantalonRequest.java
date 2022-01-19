package model.request;

public class PantalonRequest {
	private boolean comun;
	private boolean tipoSeleccionado = true;

	public PantalonRequest() {
	}

	public PantalonRequest(boolean comun) {
		super();
		this.comun = comun;
	}

	public boolean isComun() {
		return comun;
	}

	public void setComun(boolean comun) {
		this.comun = comun;
	}

	public boolean isTipoSeleccionado() {
		return tipoSeleccionado;
	}

	public void setTipoSeleccionado(boolean tipoSeleccionado) {
		this.tipoSeleccionado = tipoSeleccionado;
	}
}
