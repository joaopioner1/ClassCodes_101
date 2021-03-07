package projeto_integrador;

public class MainClass_JogoAdivinhacao {

	public static void main(String[] args) {
		// Autor: João Vítor Souza Pioner e Juliano de Lima | Data: 01/03/2021

		/*
		 * Este game é um projeto integrador o qual envolve a disciplina de programação e Introdução a info.
		 * O jogo se parece com o Akinator, porém é uma versão "didática" do mesmo. Aqui, você irá escolher (mentalmente) 
		 * uma peça aleatória de computador e, se assim desejar, tentar achá-la digitando apenas SIM ou NÃO para às 
		 * questões que irão ser mostradas em sua tela (console).
		 * 
		 * Respostas(peças) disponiveís: mouse, monitor, teclado, memória RAM, HD, Placa
		 * mãe, estabilizador, cooler, WebCam, processador, SSD, Placa de vídeo.
		 * 
		 * Aproveite a jogatina!
		 */
		
		VerificaRespotas vf = new VerificaRespotas(); //Instanciei a classe
		
		vf.verificaRespostas(); //Método que executa o game
		
	}
}
