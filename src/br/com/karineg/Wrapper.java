package br.com.karineg;

import java.util.Scanner;

public class Wrapper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro: ");
		int valorPrimitivo = scanner.nextInt();
		
		// Vai fazer a conversão do tipo primitivo "int" para o Wrapper "Inteiro"
		Integer valorWrapper = Integer.valueOf(valorPrimitivo);
		
		System.out.println("Valor Primitivo: " + valorPrimitivo);
		System.out.println("Valor Wrapper: " +valorWrapper);
	}

}
