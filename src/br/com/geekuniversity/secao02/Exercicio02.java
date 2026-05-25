package br.com.geekuniversity.secao02;

import java.util.Scanner;

//fazer um algoritmo para somar dois números e multiplicar o resultado pelo primeiro numero.

public class Exercicio02 {

	public static void main(String[] args) { 
		//variaveis
		int num1,num2,soma,multiplicacao;
		Scanner teclado = new Scanner(System.in);
		
		//entradas
		System.out.println("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		System.out.println("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		
		//Processamento
		soma = num1 + num2;
		multiplicacao = soma * num1;
		
		//Saída
		System.out.println("O resultado da multiplicação é " + multiplicacao);
		
		teclado.close();

	}

}
