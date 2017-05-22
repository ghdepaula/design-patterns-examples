package br.com.ghdepaula.factory.method;

public class EmissorMain {
	
	public static void main(String[] args) {
		
		Emissor ems1 = new EmissorEmail();
		ems1.envia("Mensagem ghdepaula via email....");
		
		Emissor ems2 = new EmissorSMS();
		ems2.envia("Mensagem ghdepaula via SMS....");
		
	}

}
