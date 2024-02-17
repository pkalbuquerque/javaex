package Questao01;

import java.io.IOException;
//Pedro Krubniki Albuquerque
public class EArquivoOrigemIncorreto extends IOException{

	private static final long serialVersionUID = 1L;
	
	public EArquivoOrigemIncorreto(String mensagem) {
		super(mensagem);
	}
	
}
