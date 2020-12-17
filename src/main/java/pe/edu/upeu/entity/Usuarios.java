package pe.edu.upeu.entity;

public class Usuarios {
	private int idusuario;
	private String nomuser;
	private String password;
	private int estado;
	private int idpersona;
	public Usuarios() {
		super();
	}
	public Usuarios(int idusuario, String nomuser, String password, int estado, int idpersona) {
		super();
		this.idusuario = idusuario;
		this.nomuser = nomuser;
		this.password = password;
		this.estado = estado;
		this.idpersona = idpersona;
	}
	public int getIdusuario() {
		return idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}
	public String getNomuser() {
		return nomuser;
	}
	public void setNomuser(String nomuser) {
		this.nomuser = nomuser;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(int idpersona) {
		this.idpersona = idpersona;
	}
	
}
