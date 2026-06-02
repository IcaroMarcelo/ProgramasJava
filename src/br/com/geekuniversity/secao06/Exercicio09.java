package br.com.geekuniversity.secao06;

import java.util.Scanner;

//fazer um algoritmo que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos
//de empresa.
public class Exercicio09 {

	public static void main(String[] args) {
		//variaveis
		float p;
		Scanner teclado = new Scanner (System.in);
		//entrada
		System.out.println("Por favor me diga o indice de poluição, por favor: ");
		p = teclado.nextFloat();
		//processamento
		if(p >= 0.3 && p < 0.4) {
			System.out.println("Grupo 1, suspender atividades por favor.\n");
		}else if(p >= 0.4 && p < 0.5) {
			System.out.println("Grupo 1 e grupo 2, suspender atividades por favor.\n");
		}else if(p >= 0.5) {
			System.out.println("Todos os grupos terao que suspender atividades.\n");
		}else {
			System.out.println("Niveis aceitaveis.\n");
		}
		teclado.close();
		

	}

}
