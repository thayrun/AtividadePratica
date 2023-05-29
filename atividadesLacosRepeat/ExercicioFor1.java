package atividadesLacosRepeat;

import java.util.Scanner;

public class ExercicioFor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num1, num2, contador, mult = 0;

		System.out.println("Digite um número: ");
		num1 = leia.nextInt();
		System.out.println("Digite outro número: ");
		num2 = leia.nextInt();
		if (num1 < num2) {                                        // <- verificação se o primeiro número é menor que o segundo.
			System.out.println("Intervalo Válido!.");
		} else {
			System.out.println("Intervalo Inválido!.");
		}
		
		// quando o contador for menor ou igual ao num2 o laço continua.
		for (contador = num1; contador <= num2; contador++) {
			if (contador % 3 == 0 && contador % 5 == 0) {                        // <- Se o número for divisivel por 3 ou 5.
				System.out.println(contador + " é múltiplo de 3 e 5.");
			}
		}

	}

}
