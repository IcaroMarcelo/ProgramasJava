package br.com.geekuniversity.secao06;

import java.util.Scanner;
//fazer um algoritmo que leia os seguintes algoritmos "c" and "n" sendo codigo e numero de horas trabalhadas de
//um operario.Calcular o salário sabendo que ele ganha 10 reais por hora. se o numero passar de 50 calcular o excesso de pagamento armazenando-o
//na variavel "e". caso ao contrario zerar tal variavel. A hora excedente de trabalho vale 20 reais. no final, imprimir o salario total e salario excedente.
public class Exercicio06 {

	public static void main(String[] args) {
		//variaveis
		int c;
 		float n, e = 0, salario, valor_hora = (float) 10.00;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe o código: ");
		c = teclado.nextInt();
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();
		//processamento
		if(n > 50) {
		    e = (n - 50) * 20;
		    salario = (50 * valor_hora) + e;
		} else {
		    salario = n * valor_hora;
		}

		System.out.printf("Código do operário: %d\n", c);
		System.out.printf("Salário Total: R$ %.2f\n", salario);
		System.out.printf("Salário Excedente: R$ %.2f\n", e);
		teclado.close();
		}
		
	}


