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
		System.out.println("O dispositivo é um periférico (s/n)?");
		this.setResposta(input.next().charAt(0));

		if (this.getResposta() == 's') {
			System.out.println("Ele movimenta o cursor pela tela do computador (s/n)?");
			this.setResposta(input.next().charAt(0));

			if (this.getResposta() == 's') {
				System.out.println("Ele se chama 'rato'?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo é um MOUSE! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
			if (this.getResposta() == 'n') {
				System.out.println("Você enxerga coisas através dele (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo é um MONITOR! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
			if (this.getResposta() == 'n') {
				System.out.println("Você utiliza-o para digitar (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("O dispositvo é um TECLADO! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
				if (this.getResposta() == 'n') {
					System.out.println("Ele é importante para vídeo chamadas (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Ele é capaz de tirar fotos e gravar vídeos (s/n)?");
						this.setResposta(input.next().charAt(0));

						if (this.getResposta() == 's') {
							System.out.println("O dispositvo é uma WEBCAM! Deseja continuar jogando (s/n)?");
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
		System.out.println("É um tipo de memória (s/n)?");
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
						System.out.println("É um HD (hard disk)! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					} else {
						System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("É um tipo de memória não volátil (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("Utiliza chips para armazenar dados (s/n)?");
						this.setResposta(input.next().charAt(0));
					}
					if (this.getResposta() == 's') {
						System.out.println("São mais velozes que HDs (s/n)?");
						this.setResposta(input.next().charAt(0));

						if (this.getResposta() == 's') {
							System.out.println("É o SDD (Solid States Drives)! Deseja continuar jogando (s/n)?");
							this.setContinuar(input.next().charAt(0));
						}
					}
				}
			} else {
				System.out.println("Você pode expandir este tipo de memória (s/n)?");
				this.setResposta(input.next().charAt(0));

				if (this.getResposta() == 's') {
					System.out.println("Ela perde seus dados se não houver energia elétrica, isto é, uma memória volátil (s/n)?");
					this.setResposta(input.next().charAt(0));

					if (this.getResposta() == 's') {
						System.out.println("É a memória RAM! Deseja continuar jogando (s/n)?");
						this.setContinuar(input.next().charAt(0));
					}
				} else {
					System.out.println("Estou confuso... Deseja continuar tentando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		}
	}
	
	public void hardwaresAuxiliares() { // - Ele resfria o hardware? Ele é uma espécie de ventilador?	É importante limpa-lo?
		System.out.println("Este aparelho resfria o hardware (s/n)?");
		this.setResposta(input.next().charAt(0));
		
		if (this.getResposta() == 's') {
			System.out.println("É uma espécie de ventilador (s/n)?");
			this.setResposta(input.next().charAt(0));
			
			if (this.getResposta() == 's') {
				System.out.println("É importante limpa-lo (s/n)?");
				this.setResposta(input.next().charAt(0));
				
				if (this.getResposta() == 's') {
					System.out.println("É o COOLER! Deseja continuar jogando (s/n)?");
					this.setContinuar(input.next().charAt(0));
				}
			}
		} else {
			System.out.println("A função ");
		}
	}

	public void verificaRespostas() {
		do {
			
			this.verificaPeriferico();
			this.verificaMemoria();
			

		} while (this.getContinuar() == 's');
	}
}