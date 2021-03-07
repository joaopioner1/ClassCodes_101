package projeto_integrador;

import java.util.Scanner;

public class VerificaRespotas {

	Scanner input = new Scanner(System.in);

	private char resposta;
	private char continuar;

	public char getContinuar() {
		return continuar;
	}

	public void setContinuar(char continuar) {
		this.continuar = continuar;
	}

	public char getResposta() {
		return resposta;
	}

	public void setResposta(char resposta) {
		this.resposta = resposta;
	}

	public void verificaPeriferico() {
		System.out.println("O dispositivo eh um periférico (s/n)?");
		this.setResposta(input.next().charAt(0));

		if (this.getResposta() == 's') {
			System.out.println("Ele movimenta o cursor pela tela do computador (s/n)?");
			this.setResposta(input.next().charAt(0));

			if (this.getResposta() == 's') {
				System.out.println("Ele se chama 'rato'?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo eh um MOUSE! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
			if (this.getResposta() == 'n') {
				System.out.println("Você enxerga coisas através dele (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo eh um MONITOR! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
			if (this.getResposta() == 'n') {
				System.out.println("Você utiliza-o para digitar (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo eh um TECLADO! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
				if (this.getResposta() == 'n') {
					System.out.println("Ele eh importante para vídeo chamadas (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Ele eh capaz de tirar fotos e gravar vídeos (s/n)?");
						this.setResposta(input.next().charAt(0));

						if (this.getResposta() == 's') {
							System.out.println("O dispositvo eh uma WEBCAM! Deseja continuar jogando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						} else {
							System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						}
					}
				}
			}
		}
	}

	public void verificaMemoria() {
		System.out.println("Eh um tipo de memória (s/n)?");
		this.setResposta(input.next().charAt(0));

		if (this.getResposta() == 's') {
			System.out.println("Após o desligamento do computador os dados permancem (s/n)?");
			this.setResposta(input.next().charAt(0));

			if (this.getResposta() == 's') {
				System.out.println("Ela(e) tem processamento mais lento quando comparado(a) ao SSD (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("Utiliza um disco magnético para armazenar os arquivos (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Eh um HD (hard disk)! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					} else {
						System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("Eh um tipo de memória não volátil (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Utiliza chips para armazenar dados (s/n)?");
						this.setResposta(input.next().charAt(0));
					}
					if (this.getResposta() == 's') {
						System.out.println("São mais velozes que HDs (s/n)?");
						this.setResposta(input.next().charAt(0));

						if (this.getResposta() == 's') {
							System.out.println("Eh o SDD (Solid States Drives)! Deseja continuar jogando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						}
					}
				}
			} else {
				System.out.println("Você pode expandir este tipo de memória (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("Ela perde seus dados se não houver energia elétrica, isto eh, uma memória volátil (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Eh a memória RAM! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		}
	}
	
	public void verificaHardwareAux() {
		System.out.println("Este aparelho resfria o hardware (s/n)?");
		this.setResposta(input.next().charAt(0));
		
		if (this.getResposta() == 's') {
			System.out.println("Eh uma espécie de ventilador (s/n)?");
			this.setResposta(input.next().charAt(0));
			
			if (this.getResposta() == 's') {
				System.out.println("Eh importante limpa-lo (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("Eh o COOLER! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			} else {
				System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
				this.setContinuar(input.next().charAt(0));
			}
		} if (this.getResposta() == 'n')  {
			System.out.println("A função do aparelho é proteger o computador (s/n)?");
			this.setResposta(input.next().charAt(0));
			
			if (this.getResposta() == 's') {
				System.out.println("O aparelho corrigi a tensão da rede elétrica (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("Em casos extremos, eles queimam para \"salvar\" o PC (s/n)?");
					this.setResposta(input.next().charAt(0));
					
					if (this.getResposta() == 's') {
						System.out.println("Eh o ESTABILIZADOR! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			} else {
				System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
				this.setContinuar(input.next().charAt(0));
			}
		} else {
			System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
			this.setContinuar(input.next().charAt(0));
		}
	}
	
	public void pecasEssenciais() {
		System.out.println("Eh um peça indispensável para gamers (s/n)?");
		this.setResposta(input.next().charAt(0));
		
		if (this.getResposta() == 's') {
			System.out.println("Eh responsável por gerar imagens na tela (s/n)?");
			this.setResposta(input.next().charAt(0));
			
			if (this.getResposta() == 's') {
				System.out.println("Podem ser Offboard ou Onboard (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("A peça eh PLACA DE VIDEO! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		} if (this.getResposta() == 'n') {
			System.out.println("Ele eh considerado uma máquina de calcular (s/n)?");
			this.setResposta(input.next().charAt(0));
			
			if (this.getResposta() == 's') {
				System.out.println("A sua função eh acelerar, endereçar, resolver ou preparar dados (s/n)?");
			}
		}
	}
	
	public void verificaRespostas() { // Metodo que mantem o game rodando
		do { // Laco de repeticao, repete os metodos ate o usuario mandar parar
			
			this.verificaPeriferico();
			this.verificaMemoria();
			this.verificaHardwareAux();
			
			
		} while (this.getContinuar() == 's');
	}
}