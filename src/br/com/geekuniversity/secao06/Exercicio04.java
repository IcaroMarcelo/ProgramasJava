 package br.com.geekuniversity.secao06;

import java.util.Scanner;

//Tendo como dados de entrada a altura e sexo de uma pessoa, construa um algoritmo que calcule seu peso ideal,
//Utilizando as seguintes formulas: homem: (72.7 * altura) - 58; mulheres (62.1 * altura) - 44.7
public class Exercicio04 {

	public static void main(String[] args) {
		//variaveis
		float altura, pesoIdeal;
		char sexo;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe sua altura");
		altura = teclado.nextFloat();
		System.out.println("Informe seu sexo m/f");
    	sexo = teclado.next().charAt(0);//apenas a primeira letra palavra.
		//processamento
    	if(sexo == 'm' ) {
    		pesoIdeal = (float)(72.7 * altura) - 58;
    		System.out.printf("Seu peso ideal é %.2f",pesoIdeal);
    	}else if(sexo == 'f') {
    		pesoIdeal = (float) (62.1 * altura) - (float)44.7;
    		System.out.printf("Seu peso ideal é %.2f",pesoIdeal );
    	}else if(sexo != 'm' && sexo != 'f') {
    		System.out.println("Sexo nao encontrado");
    		teclado.close();
    	}
		

	}

}
