package br.com.geekuniversity.secao07;
//Elaborar um programa que gera e escreve os numeros ímpares dos números entre 100 e 200.
public class Exercicio03 {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++)
			if (i % 2 != 0) {
				System.out.println("Impar:" + i);
		}
	

	}

}
