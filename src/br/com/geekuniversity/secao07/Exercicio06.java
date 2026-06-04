package br.com.geekuniversity.secao07;

import java.util.Scanner;

//Desenvolver um gerador de tabuada,capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10. 
//O usuario deve informar de qual numero ele deseja ver a tabuada.
public class Exercicio06 {

	public static void main(String[] args) {
		//variaveis
		int numero;
		Scanner teclado = new Scanner (System.in);
	    //entrada
		System.out.println("Informe um numero please: ");
		numero = teclado.nextInt();
		//processamento
		while(numero < 1 || numero > 10) {
			System.out.println("Numero deve ser entre 1 e 10.");
			System.out.println("Informe um numero");
			numero = teclado.nextInt();
		}
		System.out.printf("Tabuada de %d \n" , numero);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", numero, i, (numero * i));
		} 
		teclado.close();
		
	}

}
