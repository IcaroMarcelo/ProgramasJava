package br.com.geekuniversity.secao06;

import java.util.Scanner;
//elaborar um algoritmo que leia um numero. Se positivo armazena em 'a'. se for negativo em 'b'. No final mostrar
// o resultado.
public class Exercicio02 {

	public static void main(String[] args) {
		//variaveis
		int numero, a, b;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		//processamento
		if(numero > 0) {
			a = numero;
			System.out.println(a);
		}else {
			b = numero;
			System.out.println(b);
		}
		teclado.close();

	}

}
