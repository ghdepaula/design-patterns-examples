package br.com.ghdepaula.factory.method;

public class EmissorFactory {

	public static final int SMS = 0;
	public static final int EMAIL = 1;
	public static final int JMS = 2;

	public Emissor create(int tipoDeEmissor) {
		if (tipoDeEmissor == EmissorFactory.SMS) {
			return new EmissorSMS();
		} else if (tipoDeEmissor == EmissorFactory.EMAIL) {
			return new EmissorEmail();
		} else {
			throw new IllegalArgumentException(" Tipo de emissor não suportado ");
		}
	}
	
}
