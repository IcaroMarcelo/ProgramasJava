package br.com.geekuniversity.secao07;

import java.util.Scanner;

//fazer um programa que leia o nome do usuario e a sua senha e não aceite a senha igual ao nome de usuario,
//mostrando uma mensagem de erro e voltando a pedir as informações.
public class Exercicio05 {

	public static void main(String[] args) {
		String  nome,senha;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		nome = teclado.next();
		System.out.println("Informe a senha: ");
		senha = teclado.next();
		while(senha.equals(nome)) {
			System.out.println("Senha nao pode ser igual ao nome");
			System.out.println("Informe o nome");
			nome = teclado.next();
			System.out.println("Informe a senha");
			senha = teclado.next();
		}
		teclado.close();

	}

}
