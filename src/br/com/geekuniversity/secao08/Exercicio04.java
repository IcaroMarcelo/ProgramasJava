package br.com.geekuniversity.secao08;
//escrever um algoritmo que leia e mostre um vetor de 20 elementos inteiros
//mostre a soma de todos os elementos.
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		//variaveis
		int[] vetor = new int[20];
		int soma = 0;
		Scanner teclado = new Scanner(System.in);
	    //entrada
		for (int i = 0; i < 20; i++) {
			System.out.printf("informe o valor para o vetor %d/20\n", (i + 1));
			vetor[i] = teclado.nextInt();
			soma = soma+vetor[i];
		}
		System.out.printf("A soma é´%d", soma);
		teclado.close();
		//processamento
		//saida
	}

}
