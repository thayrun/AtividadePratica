package atividades;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
	
		float SalarioB;
		float Noturno;
		float Extra;
		float Desconto;
		float SalarioL;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o Salário Bruto: ");
		SalarioB = leia.nextFloat();
		
		System.out.println("Digite o Adicional Noturno: ");
		Noturno = leia.nextFloat();
		
		System.out.println("Digite as Horas Extras: ");
		Extra = leia.nextFloat();
		
		System.out.println("Digite os Descontos: ");
		Desconto = leia.nextFloat();
		
		SalarioL = SalarioB + Noturno + (Extra * 5) - Desconto;
		
		System.out.printf("Salário Líquido: %.2f",SalarioL);
		
		

	}

}
