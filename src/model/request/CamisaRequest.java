package model.request;

public class CamisaRequest {
	private boolean mangaCorta;
	private boolean cuelloMao;
	private boolean mangaSeleccionada = true;
	private boolean cuelloSeleccionado = true;

	public CamisaRequest() {
	}

	public CamisaRequest(boolean mangaCorta, boolean cuelloMao) {
		super();
		this.mangaCorta = mangaCorta;
		this.cuelloMao = cuelloMao;
	}

	public boolean isMangaCorta() {
		return mangaCorta;
	}

	public void setMangaCorta(boolean mangaCorta) {
		this.mangaCorta = mangaCorta;
	}

	public boolean isCuelloMao() {
		return cuelloMao;
	}

	public void setCuelloMao(boolean cuelloMao) {
		this.cuelloMao = cuelloMao;
	}

	public boolean isMangaSeleccionada() {
		return mangaSeleccionada;
	}

	public void setMangaSeleccionada(boolean mangaSeleccionada) {
		this.mangaSeleccionada = mangaSeleccionada;
	}

	public boolean isCuelloSeleccionado() {
		return cuelloSeleccionado;
	}

	public void setCuelloSeleccionado(boolean cuelloSeleccionado) {
		this.cuelloSeleccionado = cuelloSeleccionado;
	}
}
