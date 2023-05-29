package atividadesLacosCond;

import java.util.Scanner;

public class ExercicioIf2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
        int numero;
        System.out.println("Digite um número: ");
        numero = leia.nextInt();
        
        if ((numero > 0) && (numero % 2 == 0)){
		System.out.println("O Número " + numero + " é par e positivo!.");
        }
        else if ((numero > 0) && (numero % 2 != 0)) {
        System.out.println("O Número " + numero + " é impar e positivo!.");
        }
        else if ((numero < 0) && (numero % 2 == 0)) {
        	System.out.println("O Número " + numero + " é par e negativo!.");
        }
        else {
        	System.out.println("O Número " + numero + " é impar e negativo!.");
        }
	}
}


