package collectionListSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<String>();

		System.out.println("Digite 5 Cores Diferentes: ");
		for (int conta = 0; conta < 5; conta++) {
			String cor = leia.nextLine();
			cores.add(cor);
		}

		System.out.println("\nLista das Cores Escolhidas: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);

		System.out.println("\nAs Cores Escolhidas em Forma Crescente: ");
		for (String cor : cores) {
			System.out.println(cor);
		}

	}

}
