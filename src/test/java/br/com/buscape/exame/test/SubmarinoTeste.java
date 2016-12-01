package br.com.buscape.exame.test;

import br.com.buscape.exame.controller.SubmarinoController;
import br.com.buscape.exame.exception.CoordernadaInvalidaException;

public class SubmarinoTeste {

	public static void main(String[]args) throws CoordernadaInvalidaException{
	
		SubmarinoController controller = new SubmarinoController();
		controller.atualizarCoordernadas("LMRDDMMUU");  
		controller.exibirCoordenadasAtuais();
	
		/**
		 * LMRDDMMUU = 0 2 0 NORTE
		 * RMMLMMMDDLL = 2 3 -2 SUL
		 */
		
	}
	
}
