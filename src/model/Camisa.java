package model;

public class Camisa extends Prenda {
	private boolean mangaCorta;
	private boolean cuelloMao;

	public Camisa() {
	}

	public Camisa(boolean mangaCorta, boolean cuelloMao) {
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
}
