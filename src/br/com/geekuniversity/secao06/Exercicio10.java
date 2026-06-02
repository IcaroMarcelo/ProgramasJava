package br.com.geekuniversity.secao06;

import java.util.Scanner;

//Elaborar um algoritmo que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//infantil -a = 5 a 7 anos,infantil-b= 8 a 11 anos,juvenil-a= 12 a 13 anos,juvenil-b = 14 a 17 anos,
//adultos = 18 anos pra cima
public class Exercicio10 {

	public static void main(String[] args) {
		//variaveis
		int idade;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Quero sua idade por favor.");
		idade = teclado.nextInt();
		//processamento
		if(idade >= 5 && idade <= 7) {
			System.out.printf("Infantil A \n", idade);
		}else if(idade >= 8 && idade <= 11) {
			System.out.printf("Infantil B \n", idade);
		}else if(idade >= 12 && idade <= 13) {
			System.out.printf("Juvenil A \n", idade);
		}else if(idade >= 14 && idade <= 17) {
			System.out.printf("Juvenil B \n", idade);
		}else if(idade >= 18) {
			System.out.printf("Adulto \n", idade);
		}
		teclado.close();
		//saida

	}

}
