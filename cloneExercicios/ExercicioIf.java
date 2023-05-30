package cloneExercicios;

import java.util.Scanner;

public class ExercicioIf {

	public static void main(String[] args) {
		
		int numA, numB, numC, comp;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o número A: ");
		numA = leia.nextInt();
		
		System.out.println("Digite o número B: ");
		numB = leia.nextInt();
		
		System.out.println("Digite o número C: ");
		numC = leia.nextInt();
		
		comp = numA + numB;
		System.out.println(numA + " + " + numB + " = " + comp);
		
		if(comp > numC) {
			System.out.println("A soma de A + B é MAIOR do que C.");
		}
		else if(comp < numC){
			System.out.println("A soma de A + B é MENOR do que C.");
		}
		else{
			System.out.println("A soma de A + B é IGUAL a C");
		}

	}

}
