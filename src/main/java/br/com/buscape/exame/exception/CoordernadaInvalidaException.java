package br.com.buscape.exame.exception;

public class CoordernadaInvalidaException extends Exception{

	private static final long serialVersionUID = 7973392025667792579L;
	
	public CoordernadaInvalidaException(){}
	
	public CoordernadaInvalidaException(String message){
       super(message);
    }

}
