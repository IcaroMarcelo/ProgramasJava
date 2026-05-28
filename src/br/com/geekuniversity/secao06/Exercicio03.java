package br.com.geekuniversity.secao06;

import java.util.Scanner;
//ler um numero e verificar se ele é par ou impar. Quando for par armazenar  em p, e se for impar armazenar em i.
//exibir p e i no final do processamento.
public class Exercicio03 {

	public static void main(String[] args) {
		//variaveis
		int numero, p = 0, i = 0;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe um numero: ");
		numero = teclado.nextInt();
		//processamento
		if ( numero % 2 == 0) {
			p = numero;
		}else {
			i = numero;
		}
		System.out.println(p);
		System.out.println(i);
		teclado.close();
		//saida
	}

}
