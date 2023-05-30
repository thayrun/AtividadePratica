package atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
		float novo;
		
		Scanner leia = new Scanner (System.in);
	   
		System.out.println("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		abono = leia.nextFloat();
		
	    novo = salario + abono;
	    
	    System.out.printf("Seu novo salário foi atualizado para %.2f", novo);

	}

}
