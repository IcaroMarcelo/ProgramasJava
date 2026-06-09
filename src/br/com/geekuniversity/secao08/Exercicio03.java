package br.com.geekuniversity.secao08;
//fazer um programa que carregue um vetor com 10 numeros inteiros.
// mostre o vetor na ordem inversa a que foi digitado.
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		//variaveis
		int[] vetor = new int[10];
		Scanner teclado = new Scanner(System.in);
	    //processamento
		for (int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor[i] = teclado.nextInt();
		}
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.println(vetor[i]);
		}
		teclado.close();

	}

}
