package br.com.geekuniversity.secao06;

import java.util.Scanner;

//ler quatro numeros, calcular o quadrado, 
//se o valor resultante do quadrado do terceiro for >= 1000, 
//imprima-o e finalize; Caso contrario, imprima os valores lidos e seus respectivos quadrados.
public class Exercicio07 {

	public static void main(String[] args) {
		//variaveis
		int n1,n2,n3,n4,q1,q2,q3,q4;
		Scanner teclado = new Scanner(System.in);
		//entrada
		System.out.println("Informe o numero 1: ");
		n1 = teclado.nextInt();
		System.out.println("Informe o numero 2: ");
		n2 = teclado.nextInt();
		System.out.println("Informe o numero 3: ");
		n3 = teclado.nextInt();
		System.out.println("Informe o numero 4: ");
		n4 = teclado.nextInt();
		//processamento
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		
		if(q3 >=1000) {
			System.out.println(q3);
		}else{
			System.out.printf("n1: %d Quadrado: &d\n", n1, q1);
			System.out.printf("n2: %d Quadrado: &d\n", n2, q2);
			System.out.printf("n3: %d Quadrado: &d\n", n3, q3);
			System.out.printf("n4: %d Quadrado: &d\n", n4, q4);
		}
		teclado.close();
 	}

}
