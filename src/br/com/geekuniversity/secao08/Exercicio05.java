package br.com.geekuniversity.secao08;

import java.util.Scanner;

//fazer um programa que carregue um vetor com 10 numeros inteiros.
//calcular e mostrar os numeros superiores a 50 e suas respectivas posições.
//Mostrar mensagem	se não existir nenhum numero nesta condição.
public class Exercicio05 {

	public static void main(String[] args) {
	 	//variaveis
		int[] vetor = new int[10];
		boolean tem_maior_50 = false;
		Scanner teclado = new Scanner(System.in);
	    //entrada
		for(int i = 0; i < 10; i++) {
			System.out.printf("Informe o valor para o vetor %d/10\n");
			vetor[i] = teclado.nextInt();
		}
		for(int i = 0; i < 10; i++) {
			if(vetor[i] > 50) {
				System.out.printf("O numero %d está na posição %d\n", vetor[i], i);
				tem_maior_50 = true;
			}
		}
		if(!tem_maior_50) {
			System.out.println("Não existe nenhum número maior que 50");
		}
		teclado.close();
	
	
	 

	}

}
