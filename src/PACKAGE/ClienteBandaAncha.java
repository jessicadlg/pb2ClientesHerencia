package PACKAGE;


public class ClienteBandaAncha extends Cliente {
private String EMail;
	
	public ClienteBandaAncha(Integer numero, String nombre, String EMail) {
		super(numero, nombre);
		this.EMail=EMail;	
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}
	
	

}
