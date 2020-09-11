package PACKAGE;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Empresa {
	private String nombre;

	private Set<Cliente> clientes;

	public Empresa(String nombre) {
		this.nombre = nombre;
		clientes = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarCliente(Cliente cliente) {
		
		this.clientes.add(cliente);
	}

	public Integer getCantidadAbonados() {
		return clientes.size();
	}

	public boolean habilitarPremium(Premium futbol, Cliente celeste) throws NoEsClienteConCableException {
		if (futbol.equals(Premium.FUTBOL)) {
		List<ClienteCable>listaCable=new ArrayList<ClienteCable>();
		for (Cliente cliente : clientes) {
			if(cliente instanceof ClienteCable)
		 return listaCable.add((ClienteCable) celeste);
		}
			throw new NoEsClienteConCableException();
		}
		return false;
	}	
}
