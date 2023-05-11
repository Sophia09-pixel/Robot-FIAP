package pasta;

import java.util.Scanner;

public class cleitin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		String passo;
		int potencia = 0, distancia = 0, bateria = 0, bateriaFinal = 0;

		System.out.println("Bem vindo a pista do robo :D !");
		System.out.println("Faça o robo passar pela pista, chegar no trofeu e completar o desafio :)");
		System.out.println("");

		System.out.println("Digite a potencia da bateria do robo:");
		bateria = entrada.nextInt(); 
		while (bateria < 34) {
			System.out.println("Bateria Insuficiente para completar o desafio:");
			System.out.println("Digite novamente: ");
			bateria = entrada.nextInt();
		}
		System.out.println("Voce tem "+bateria+" de bateria para concluir o desafio.");

		System.out.println("Digite o 1° movimento para começar:(frente/trás/direita/esquerda)");
		passo = entrada.next();
		while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
			System.out.println("Digite um movimento válido:");
			passo = entrada.next();
		}

		System.out.println("Digite a distancia: ");
		distancia = entrada.nextInt();
		potencia += distancia * 1;
		
		if(passo.equalsIgnoreCase("frente")&& distancia == 3) {
			System.out.println("Boa! Voce passou pela 1° parte <3");
			System.out.println("Digite o 2° movimento:");
			passo = entrada.next();
			while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
				System.out.println("Digite um movimento válido:");
				passo = entrada.next();
			}
			System.out.println("Digite a distancia:");
			distancia = entrada.nextInt();
			potencia += distancia * 1;
			if(passo.equalsIgnoreCase("esquerda")&& distancia == 7) {
				System.out.println("Boa! Voce passou pela 2° parte <3");
				System.out.println("Digite o 3° movimento:");
				passo = entrada.next();
				while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
					System.out.println("Digite um movimento válido:");
					passo = entrada.next();
				}
				System.out.println("Digite a distancia:");
				distancia = entrada.nextInt();
				potencia += distancia * 1;
				if(passo.equalsIgnoreCase("direita")&& distancia ==7) {
					System.out.println("Boa! Voce passou pela 3° parte <3");
					System.out.println("Digite o 4° movimento:");
					passo = entrada.next();
					while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
						System.out.println("Digite um movimento válido:");
						passo = entrada.next();
					}
					System.out.println("Digite a distancia:");
					distancia = entrada.nextInt();
					potencia += distancia * 1;
					if(passo.equalsIgnoreCase("direita")&& distancia ==4) {
						System.out.println("Boa! Voce passou pela 4° parte <3");
						System.out.println("Digite o 5° movimento:");
						passo = entrada.next();
						while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
							System.out.println("Digite um movimento válido:");
							passo = entrada.next();
						}
						System.out.println("Digite a distancia:");
						distancia = entrada.nextInt();
						potencia += distancia * 1;
						
						if(passo.equals("esquerda")&& distancia ==6) {
							System.out.println("Boa! Voce passou pela 5° parte <3");
							System.out.println("Digite o 6° movimento:");
							passo = entrada.next();
							while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
								System.out.println("Digite um movimento válido:");
								passo = entrada.next();
							}
							System.out.println("Digite a distancia:");
							distancia = entrada.nextInt();
							potencia += distancia * 1;
							if(passo.equalsIgnoreCase("direita")&&distancia==3) {
								System.out.println("Boa! Voce passou pela 6° parte <3");
								System.out.println("Digite o 7° movimento:");
								passo = entrada.next();
								while(!(passo.equalsIgnoreCase("frente")||(passo.equalsIgnoreCase("trás"))||(passo.equalsIgnoreCase("direita"))||(passo.equalsIgnoreCase("esquerda")))) {
									System.out.println("Digite um movimento válido:");
									passo = entrada.next();
								}
								System.out.println("Digite a distancia:");
								distancia = entrada.nextInt();
								potencia += distancia * 1;
								if(passo.equalsIgnoreCase("esquerda")&& distancia ==4) {
									System.out.println("PARABÉNS VOCE CONSEGUIU COMPLETAR O DESAFIO!!!!");
									System.out.println("O troféu é todo seu <3");
								}
							}else {
								System.out.println("Movimento Inválido!");
								System.out.println("O Robo bateu e Explodiu :( ");
							}
						}else {
							System.out.println("Movimento Inválido!");
							System.out.println("O Robo bateu e Explodiu :( ");
						}
						
					}else {
						System.out.println("Movimento Inválido!");
						System.out.println("O Robo bateu e Explodiu :( ");
					}
				}else {
					System.out.println("Movimento Inválido!");
					System.out.println("O Robo bateu e Explodiu :( ");
				}
			}else {
				System.out.println("Movimento Inválido!");
				System.out.println("O Robo bateu e Explodiu :( ");
			}
		}else {
			System.out.println("Movimento Inválido!");
			System.out.println("O Robo bateu e Explodiu :( ");
		}
		
		System.out.println("Potencia Total Usada:"+potencia);
		bateriaFinal = bateria - potencia;
		System.out.println("Sobrou "+bateriaFinal+" de bateria.");

}
	}
