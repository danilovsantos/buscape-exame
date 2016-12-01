package br.com.buscape.exame.controller;

import br.com.buscape.exame.enums.DirecaoEnum;
import br.com.buscape.exame.exception.CoordernadaInvalidaException;

public class SubmarinoController {


	private int x = 0;
	private int y = 0;
	private int z = 0;
	private String direcao = "NORTE";

	public SubmarinoController(){}

	
	/**
	 * Atualiza coordenadas x,y,z e direção conforme
	 * comando informado.
	 * @param comando
	 * @throws CoordernadaInvalidaException 
	 */
	
	public void atualizarCoordernadas(String comando) throws CoordernadaInvalidaException{

		for(Character cmd : comando.toCharArray()){

			String com = cmd.toString();
			
			if(DirecaoEnum.SUBIR.getDirecao().equals(com)){
				this.z += 1;
			}else

			if(DirecaoEnum.DESCER.getDirecao().equals(com)){
				this.z -= 1;
			}else

			if(DirecaoEnum.MOVER.getDirecao().equals(com)){
				
				if(direcao.equals(DirecaoEnum.NORTE.getDirecao())){
					this.y += 1;
				}else
				
				if(direcao.equals(DirecaoEnum.LESTE.getDirecao())){
					this.x += 1;
				}
				
			}else

			if(DirecaoEnum.GIRAR_ESQUERDA.getDirecao().equals(com)){
				this.girar(DirecaoEnum.GIRAR_ESQUERDA.getDirecao());
			}else

			if(DirecaoEnum.GIRAR_DIREITA.getDirecao().equals(com)){
				this.girar(DirecaoEnum.GIRAR_DIREITA.getDirecao());
			}else{
				throw new CoordernadaInvalidaException("Coordernada "+com+" inválida!");
			}

		}

	}

	
	
	/**
	 * Gira conforme o sentido informado.
	 * @param sentido
	 */
	
	private void girar(String sentido){

		if(direcao.equals(DirecaoEnum.NORTE.getDirecao())){

			if(sentido.equals(DirecaoEnum.GIRAR_ESQUERDA.getDirecao())){
				this.direcao = DirecaoEnum.OESTE.getDirecao();
			}

			if(sentido.equals(DirecaoEnum.GIRAR_DIREITA.getDirecao())){
				this.direcao = DirecaoEnum.LESTE.getDirecao();
			}

		}else

		if(direcao.equals(DirecaoEnum.SUL.getDirecao())){

			if(sentido.equals(DirecaoEnum.GIRAR_ESQUERDA.getDirecao())){
				this.direcao = DirecaoEnum.LESTE.getDirecao();
			}

			if(sentido.equals(DirecaoEnum.GIRAR_DIREITA.getDirecao())){
				this.direcao = DirecaoEnum.OESTE.getDirecao();
			}

		}else
		
		if(direcao.equals(DirecaoEnum.LESTE.getDirecao())){

			if(sentido.equals(DirecaoEnum.GIRAR_ESQUERDA.getDirecao())){
				this.direcao = DirecaoEnum.NORTE.getDirecao();
			}

			if(sentido.equals(DirecaoEnum.GIRAR_DIREITA.getDirecao())){
				this.direcao = DirecaoEnum.SUL.getDirecao();
			}

		}else
		
		if(direcao.equals(DirecaoEnum.OESTE.getDirecao())){

			if(sentido.equals(DirecaoEnum.GIRAR_ESQUERDA.getDirecao())){
				this.direcao = DirecaoEnum.SUL.getDirecao();
			}

			if(sentido.equals(DirecaoEnum.GIRAR_DIREITA.getDirecao())){
				this.direcao = DirecaoEnum.NORTE.getDirecao();
			}

		}
		
	}

	
	/**
	 * Exibe coordenadas atuais.
	 */
	
	public void exibirCoordenadasAtuais(){
		System.out.println(this.x+" "+this.y+" "+this.z+" "+this.direcao);
	}



}
