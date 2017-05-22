package br.com.ghdepaula.factory.method;

public class EmissorEmail implements Emissor {

	@Override
	public void envia(String message) {
		System.out.println("Envia mensagem email: ");
		System.out.println(message);
	}

}
