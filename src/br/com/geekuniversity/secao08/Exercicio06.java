package br.com.geekuniversity.secao08;

import java.util.Scanner;

//fazer um algoritmo que receba um codigo numero inteiro
//e um vetor de cinco posições de numeros reais. Se o codigo for zero, termine o programa.
//Se o codigo for 1, mostre o vetor na ordem direta.
//Se o codigo for 2, mostre o vetor na ordem inversa.
public class Exercicio06 {

	public static void main(String[] args) {
		float[]vetor = new float[5];
		int codigo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o código: ");
		codigo = teclado.nextInt();
		
		if(codigo != 0 && codigo <=2) {
			for (int i = 0; i < 5; i++) {
				System.out.println("Informe um numero real: ");
				vetor[i] = teclado.nextFloat();
			}
			if(codigo == 1) {
				for(int i = 0; i < 5; i++) {
					System.out.println(vetor[i]);
				}
			}
			if(codigo == 2) {
				for (int i = (vetor.length - 1); i >= 0 ; i--) {
					System.out.println(vetor[i]);
				}
			}
		}
		teclado.close();

	}

}
