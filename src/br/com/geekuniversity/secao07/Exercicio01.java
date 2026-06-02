package br.com.geekuniversity.secao07;

import java.util.Scanner;

//fazer um algoritmo que determine o maior entre N numeros. A condicao de parada é a entrada de um valor 0,ou seja,
//o algoritmo deve ficar calculando o maior até que a entrada seja igual a 0(ZERO).
//SISTEMA DE REPETIÇÃO
public class Exercicio01 {

	public static void main(String[] args) {
		//variaveis
		int n, maior = 0;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe um numero: ");
		n = teclado.nextInt();
		//processamento
		while(n != 0) {
			if (n > maior) {
				maior = n;
			}
			System.out.println("Informe um numero: ");
			n = teclado.nextInt();
			
		}
		System.out.printf("O maior numero é %d", maior);
		teclado.close();
		//saida
	 

	}

}
