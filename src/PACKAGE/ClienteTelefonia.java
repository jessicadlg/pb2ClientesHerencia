package PACKAGE;


public class ClienteTelefonia extends Cliente{
	
	private String telefono;
	private String codigoDeArea;
	
	public ClienteTelefonia(Integer numero, String nombre, String codigoDeArea,String telefono) {
		super(numero, nombre);
	this.telefono=telefono;
	this.codigoDeArea=codigoDeArea;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCodigoDeArea() {
		return codigoDeArea;
	}

	public void setCodigoDeArea(String codigoDeArea) {
		this.codigoDeArea = codigoDeArea;
	}

}
