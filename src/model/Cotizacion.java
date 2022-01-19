package model;

import java.util.Date;

public class Cotizacion {

	private int id;
	private Date fechaHora;
	private int codigoVendedor;
	private Prenda prendaCotizada;
	private int cantidadUnidadesCotizadas;
	private int rtoCotizacion;

	public Cotizacion() {
	}

	public Cotizacion(int id, Date fechaHora, int codigoVendedor, Prenda prendaCotizada, int cantidadUnidadesCotizadas,
			int rtoCotizacion) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.codigoVendedor = codigoVendedor;
		this.prendaCotizada = prendaCotizada;
		this.cantidadUnidadesCotizadas = cantidadUnidadesCotizadas;
		this.rtoCotizacion = rtoCotizacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public int getCodigoVendedor() {
		return codigoVendedor;
	}

	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}

	public Prenda getPrendaCotizada() {
		return prendaCotizada;
	}

	public void setPrendaCotizada(Prenda prendaCotizada) {
		this.prendaCotizada = prendaCotizada;
	}

	public int getCantidadUnidadesCotizadas() {
		return cantidadUnidadesCotizadas;
	}

	public void setCantidadUnidadesCotizadas(int cantidadUnidadesCotizadas) {
		this.cantidadUnidadesCotizadas = cantidadUnidadesCotizadas;
	}

	public int getRtoCotizacion() {
		return rtoCotizacion;
	}

	public void setRtoCotizacion(int rtoCotizacion) {
		this.rtoCotizacion = rtoCotizacion;
	}
}