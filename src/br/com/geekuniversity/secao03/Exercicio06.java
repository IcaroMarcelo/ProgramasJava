package br.com.geekuniversity.secao03;

import java.util.Scanner;

//fazer um algoritmo que pergunte o quanto voce ganha por hora e o
// numero de horas trabalhadas no mes. Calcule e mostre o total do seu salario no referido mes.
public class Exercicio06 {

	public static void main(String[] args) {
		//declaracao de variaveis
	    float valor_hora, salario;
	    int hora_trabalhada;
	    Scanner teclado = new Scanner(System.in);
		//entrada
	    System.out.println("Qual o valor voce ganha por hora");
	    valor_hora = teclado.nextFloat();
	    
	    System.out.println("Quanta horas voce trabalhou neste mes?");
	    hora_trabalhada = teclado.nextInt();
		//processamento
	    salario = (hora_trabalhada * valor_hora);
		//saida
	    System.out.println("Neste mes voce vai receber R$" + salario);
	    
	    teclado.close();

	}

}
