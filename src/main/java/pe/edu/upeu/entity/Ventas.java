package pe.edu.upeu.entity;

public class Ventas {
	private int idventa;
	private String fecha;
	private String tipodoc;
	private String numdoc;
	private int idpersona;
	private int idusuario;
	public Ventas() {
		super();
	}
	public Ventas(int idventa, String fecha, String tipodoc, String numdoc, int idpersona, int idusuario) {
		super();
		this.idventa = idventa;
		this.fecha = fecha;
		this.tipodoc = tipodoc;
		this.numdoc = numdoc;
		this.idpersona = idpersona;
		this.idusuario = idusuario;
	}
	public int getIdventa() {
		return idventa;
	}
	public void setIdventa(int idventa) {
		this.idventa = idventa;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTipodoc() {
		return tipodoc;
	}
	public void setTipodoc(String tipodoc) {
		this.tipodoc = tipodoc;
	}
	public String getNumdoc() {
		return numdoc;
	}
	public void setNumdoc(String numdoc) {
		this.numdoc = numdoc;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	
}
