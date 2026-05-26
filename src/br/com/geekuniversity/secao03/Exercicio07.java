package br.com.geekuniversity.secao03;

import java.util.Scanner;

//tendo como dados de entrada a altura de uma pessoa, fazer um algoritmo que calcula seu peso ideal,
//com a seguinte formula: (72.7 * altura) - 58
public class Exercicio07 {

	public static void main(String[] args) {
		//declaracao de variaveis
		float altura, peso_ideal;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();
		//processamento
		peso_ideal = (float) (altura * 72.7) - 58; //cast
		//saida
		System.out.printf("Seu peso ideal seria %.2f ",peso_ideal);
		teclado.close();
	}

}
