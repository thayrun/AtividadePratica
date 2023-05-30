package collectionListSet;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class CollectionSet {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		Integer lerNum;

		System.out.println("Digite 10 valores inteiros NÃO repetidos: ");
		for (int roda = 0; roda < 10; roda++) {
			lerNum = leia.nextInt();
			numeros.add(lerNum);
		}

		System.out.println("Listar dados do Set: ");

		for (Integer num : numeros) {
			System.out.println(num);
		}
	}
}