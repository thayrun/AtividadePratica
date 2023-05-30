package atividades;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float Nota1;
		float Nota2;
		float Nota3;
		float Nota4;
		float calcmedia;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primeira Nota: ");
		Nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda Nota: ");
		Nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira Nota: ");
		Nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta Nota: ");
		Nota4 = leia.nextFloat();
		
		calcmedia = (Nota1 + Nota2 + Nota3 + Nota4) /4;
		
		System.out.printf("Média Final: %.1f", calcmedia);

		
	}

}
