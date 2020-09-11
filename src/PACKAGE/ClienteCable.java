package PACKAGE;

public class ClienteCable  extends Cliente {
	private String codigoDecodificador;

	public ClienteCable(Integer numero, String nombre, String codigoDecodificador) {
		super(numero, nombre );
	this.codigoDecodificador=codigoDecodificador;
	}

	public String getCodigoDecodificador() {
		return codigoDecodificador;
	}

	public void setCodigoDecodificador(String codigoDecodificador) {
		this.codigoDecodificador = codigoDecodificador;
	}

}
