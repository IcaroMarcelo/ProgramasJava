package br.com.geekuniversity.secao07;

import java.util.Scanner;

//concerto de mouses.
public class Exercicio07 {

	public static void main(String[] args) {
	int id,quant = 0, esfera = 0, limpeza = 0, troca_cabo = 0, quebrado = 0, defeito;
	float perc_esfera,perc_limpeza,perc_cabo,perc_quebrado;
	Scanner teclado = new Scanner(System.in);
	
	
	System.out.println("Digite o id do mouse: ");
	id = teclado.nextInt();
	
	while(id != 0) {
		System.out.println("Identifique o defeito:");
		System.out.println("1 = necessita da esfera.");
		System.out.println("2 = necessita da limpeza.");
		System.out.println("3 = necessita troca do cabo ou conector.");
		System.out.println("4 = quebrado ou inutilizado.");
		System.out.println("Digite o defeito");
		defeito = teclado.nextInt();
		if(defeito == 1) {
			esfera = esfera + 1;
		}else if(defeito == 2) {
			limpeza = limpeza + 1;
		}else if(defeito == 3) {
			troca_cabo = troca_cabo + 1;
		}else if(defeito == 4) {
			quebrado = quebrado + 1;
		}
		quant = quant + 1;
		System.out.println("Digite o id do mouse: ");
		id = teclado.nextInt();
	}
	if(quant == 0) {
		System.out.println("Nenhum mouse foi cadastrado.");
	}else {
	perc_esfera = ((float)esfera * (float)100.00) / (float)quant;
	perc_limpeza = ((float)limpeza * (float)100.00) / (float)quant;
	perc_cabo = ((float)troca_cabo * (float)100.00) / (float)quant;
	perc_quebrado = ((float)quebrado * (float)100.00) / (float)quant;
	System.out.printf("Quantidades de mouses %d\n ",quant);
	System.out.println("Situção\t \t\t \tQuantidade  \t Percentual");
	System.out.printf("1 = necessita da esfera  \t\t\t%d  \t\t %.2f%% \n" ,esfera ,perc_esfera);
	System.out.printf("2 = necessita da limpeza  \t\t\t%d  \t\t %.2f%% \n" ,limpeza , perc_limpeza);
	System.out.printf("3 = necessita de troca do cabo ou conector  \t\t\t%d  \t\t %.2f%% \n" ,troca_cabo , perc_cabo);
	System.out.printf("4 = quebrado ou inutilizado  \t\t\t%d  \t\t %.2f%% \n" ,quebrado , perc_quebrado);
	}
	teclado.close();
	
	}

}
