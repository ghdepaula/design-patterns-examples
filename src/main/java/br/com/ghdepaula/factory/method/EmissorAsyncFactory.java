package br.com.ghdepaula.factory.method;

public class EmissorAsyncFactory extends EmissorFactory {
	
	public Emissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorFactory.SMS) {
			return new EmissorAsyncSMS();
		} else if (tipoDeEmissor == EmissorFactory.EMAIL) {
			return new EmissorAsyncEmail();
		} else if (tipoDeEmissor == EmissorFactory.JMS) {
			return new EmissorAsyncJMS();
		} else {
			throw new IllegalArgumentException(" Tipo de emissor não suportado ");
		}
	}
	
}
