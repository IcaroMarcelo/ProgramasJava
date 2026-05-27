package br.com.geekuniversity.secao06;

import java.util.Scanner;

//Ler uma variavel numerica n e imprimi-la somente se a mesma for maior que 100, caso contrário imprimi-la com o valor 0
public class Exercicio01 {

	public static void main(String[] args) {
		//variaveis
		int n;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe um numero: ");
		n = teclado.nextInt();
		//processamento
		if(n > 100) {
			System.out.println(n);
		}else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
		//saida
	}

}	