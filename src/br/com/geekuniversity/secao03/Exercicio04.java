package br.com.geekuniversity.secao03;

import java.util.Scanner;
//Fazer um algoritmo que peça dois numeros para o usuario e imprimir a soma.
public class Exercicio04 {
	public static void main(String[] args) {
		//declaracao de variaveis
		int num1,num2,soma;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		//processamento
		soma = (num1 + num2);
		//saida
		System.out.println("A soma é " + soma);
		
		teclado.close();
	}
	

}
