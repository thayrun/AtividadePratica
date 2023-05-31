package collectionListSet;

import java.util.*;

public class TesteCollection {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Digite 10 valores inteiros não repetidos:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Valor " + i + ": ");
            int valor = ler.nextInt();
            numeros.add(valor);
        }

        System.out.println("Elementos da Collection Set:");

        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            int elemento = iterator.next();
            System.out.println(elemento);
        }
    }


	}


