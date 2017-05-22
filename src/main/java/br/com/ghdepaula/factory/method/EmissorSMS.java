package br.com.ghdepaula.factory.method;

public class EmissorSMS implements Emissor {

	@Override
	public void envia(String message) {
		System.out.println("Enviando mensagem SMS: ");
		System.out.println(message);
	}

}
