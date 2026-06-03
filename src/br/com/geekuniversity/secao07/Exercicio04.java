package br.com.geekuniversity.secao07;

import java.util.Scanner;

//Construir um algoritmo que leia 10 valores inteiros e positivos e: encontre o maior valor
//encontre o menor valor e calcule a media dos numeros lidos.
public class Exercicio04 {

	public static void main(String[] args) {
	 	//variaveis
		int valor, maior = -999,menor = 999, soma = 0;
		float media;
		Scanner teclado = new Scanner(System.in);
		//processamento
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			valor = teclado.nextInt();
			if(valor >= 0) {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
				soma = soma + valor;
			}else {
			 	i--;
			}
	}
	media = soma/10;
			
			
	System.out.println("Maior: " + maior);
	System.out.println("Menor: " + menor);
	System.out.println("Média: " + media);
	teclado.close();
		
			
			
			
		}

	}
