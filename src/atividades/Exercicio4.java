package atividades;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	   float num1;
	   float num2;
	   float num3;
	   float num4;
	   float dif;     // pra calcular a diferença
	   
	   Scanner leia = new Scanner(System.in);
	   
	   System.out.println("Digite o número 1: ");
	   num1 = leia.nextFloat();
	   
	   System.out.println("Digite o número 2: ");
	   num2 = leia.nextFloat();
	   
	   System.out.println("Digite o número 3: ");
	   num3 = leia.nextFloat();
	   
	   System.out.println("Digite o número 4: ");
	   num4 = leia.nextFloat();
	   
	   dif = (num1 * num2) - (num3 * num4);
	   
	   System.out.println("Diferença " + dif);

	   
	}

}
