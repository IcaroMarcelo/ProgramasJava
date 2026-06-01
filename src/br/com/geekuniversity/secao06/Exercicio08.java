package br.com.geekuniversity.secao06;

import java.util.Scanner;

//fazer um algoritmo que leia um numero inteiro e 
//mostre uma mensagem indicando se o numero é impar ou par, e se é positivo ou negativo.
public class Exercicio08 {

	public static void main(String[] args) {
	int n1;
	Scanner teclado = new Scanner(System.in);

	System.out.println("me da um numero por favor");
	n1 = teclado.nextInt();
	
	if(n1 % 2 == 0) {
		System.out.printf("Numero par.\n", n1);
	}else{
		System.out.printf("Numero impar.\n", n1);
	}
	if(n1 > 0) {
		System.out.printf("Numero positivo.\n", n1);
	}else {
		System.out.printf("Numero negativo.\n", n1);
	}
	teclado.close();
	}
}
