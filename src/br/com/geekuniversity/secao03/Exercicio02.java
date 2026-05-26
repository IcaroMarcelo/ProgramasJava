package br.com.geekuniversity.secao03;

import java.util.Scanner;

//fazer um algoritmo para "calcular o estoque médio de uma peça", sendo que:
// estoque medio = (quantidade_minima + quantidade_maxima) / 2
public class Exercicio02 {

	public static void main(String[] args) {
		//declaracao de variaveis
		int quantidade_minima, quantidade_maxima;
		float estoque_medio;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe a quantidade mínima: ");
		quantidade_minima = teclado.nextInt();
		
		System.out.println("Informe a quantidade maxima: ");
		quantidade_maxima = teclado.nextInt();
		//processamento
		estoque_medio = (quantidade_minima + quantidade_maxima) / 2; 

		//saida
		System.out.println("O estoque médio é: " + estoque_medio);
		
		teclado.close();

	}

}
