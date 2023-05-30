package atividadeVetoresMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, posicao;
		int numerosVet[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = ler.nextInt();

		posicao = Arrays.binarySearch(numerosVet, numero);  

		for (int num = 0; num < numerosVet.length; num++) {
			if (numerosVet[num] == numero) {
				posicao = num;
			}
		}
		if (posicao >= 0) {
			System.out.println("O número " + numero + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + numero + " não foi encontrado!");
		}
	}

}
