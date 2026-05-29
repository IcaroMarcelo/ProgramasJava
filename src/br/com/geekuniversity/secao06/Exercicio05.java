package br.com.geekuniversity.secao06;

import java.util.Scanner;

//fazer um algoritmo que leia a variavel 'p' (peso de peixes) e verifique se há excesso. se houver
//gravar na variavel 'e' (excesso) e na variavel 'm' o valor da multa que joão deverá pagar.
//caso contrario mostrar tais variáveis com o conteúdo 'zero'. 
public class Exercicio05 {

	public static void main(String[] args) {
		//variaveis
		float p,m;
		String e = "excesso";
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe o peso dos peixes");
		p = teclado.nextFloat();		
		//processamento
		if(p > 50) {
			m = (float)(p-50) * (float) 4.00;
			//saida
			System.out.printf("Voce devera pagar R$ %.2f em multas", m);
		}else {
			m = 0;
			e = "0";
			//saida
			System.out.println("Multas: " + m);
			System.out.println("Excesso: " + e);
		}
		teclado.close();		
		//saida
	 

	}

}
