package br.com.buscape.exame.enums;

/**
 * @author Danilo Valente
 * Classe que representa direções.
 */
public enum DirecaoEnum {
	
	 NORTE("NORTE")
	,SUL("SUL")
	,LESTE("LESTE")
	,OESTE("OESTE")
	,GIRAR_ESQUERDA("L")
	,GIRAR_DIREITA("R")
	,MOVER("M")
	,SUBIR("U")
	,DESCER("D");
	 
	private String direcao;
	
	private DirecaoEnum(String direcao){
		this.direcao = direcao;
	}

	public String getDirecao() {
		return direcao;
	}
	

}
