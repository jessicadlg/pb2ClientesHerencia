package PACKAGE;


public class ClienteTri	 extends Cliente {
			private String codigoDeArea;
			private String telefono;
			private String codigoDecodificador;
			private String EMail;
			
			
				
			public ClienteTri(Integer numero, String nombre, String codigoDeArea,String telefono, 
					String codigoDecodificador, String EMail) {
				super(numero, nombre);
				this.codigoDeArea=codigoDeArea;
				this.telefono=telefono;
				this.codigoDecodificador = codigoDecodificador;
				this.EMail =EMail ;
			}



			public String getCodigoDeArea() {
				return codigoDeArea;
			}



			public void setCodigoDeArea(String codigoDeArea) {
				this.codigoDeArea = codigoDeArea;
			}



			public String getTelefono() {
				return telefono;
			}



			public void setTelefono(String telefono) {
				this.telefono = telefono;
			}



			public String getCodigoDecodificador() {
				return codigoDecodificador;
			}



			public void setCodigoDecodificador(String codigoDecodificador) {
				this.codigoDecodificador = codigoDecodificador;
			}



			public String getEMail() {
				return EMail;
			}



			public void setEMail(String eMail) {
				EMail = eMail;
			}

		}