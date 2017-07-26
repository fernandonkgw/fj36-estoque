package br.com.caelum.estoque.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class RegistraERodaService {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		
		LocateRegistry.createRegistry(1099);
		Naming.rebind("/estoque", new EstoqueService());
		System.out.println("Estoque registrando e rodando");
	}
}
