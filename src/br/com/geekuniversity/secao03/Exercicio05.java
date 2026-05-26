package br.com.geekuniversity.secao03;

import java.util.Scanner;

//Fazer um algoritmo que converta metros para centimetros.
public class Exercicio05 {

	public static void main(String[] args) {
	//declaracao de variaveis
	int metros, centimetros;
	Scanner xuxa = new Scanner(System.in);
	//entrada
	System.out.println("Informe o valor em metros: ");
	metros = xuxa.nextInt();
	//processamento
	centimetros = ( metros * 100);
	//saida
	System.out.println(metros + "metros em centimetros é " + centimetros);
	
	xuxa.close();
	}

}
