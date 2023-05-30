package cloneExercicios;

import java.util.Scanner;

public class ExercicioDOWhile {

	public static void main(String[] args) {
	 
		Scanner leia = new Scanner(System.in);
				int num, soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				soma = soma + num;
			}

	     } while (num != 0);
		System.out.println("A soma dos números positivos é: " + soma);

}
}
