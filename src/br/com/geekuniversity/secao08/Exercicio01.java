package br.com.geekuniversity.secao08;
//fazer um algoritmo que carregue um vetor de 5 elementos inteiros
//em seguida armazenar em um vetor apenas os numeros pares maiores que 0.
//no final deve mostrar os elementos do vetor na tela.
import java.util.ArrayList;

public class Exercicio01 {

	public static void main(String[] args) {
		//variaveis
		ArrayList<Integer> vetor = new ArrayList<Integer>();
		ArrayList<Integer> pares = new ArrayList<Integer>();
		//processamento
		for (int i = 0; i < 5; i++) {
			vetor.add(i);
			if(i % 2 == 0) {
				if(i > 0) {
					pares.add(i);
				}
			}
		}
		
		for(Integer n : pares) {
			System.out.println(n);
		}
		//saida

	}

}
