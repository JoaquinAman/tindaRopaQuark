package model;

public class Vendedor {
	private String name;
	private String apellido;
	private int codigoVendedor;

	public Vendedor() {
	}

	public Vendedor(String name, String apellido, int codigoVendedor) {
		super();
		this.name = name;
		this.apellido = apellido;
		this.codigoVendedor = codigoVendedor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

}
