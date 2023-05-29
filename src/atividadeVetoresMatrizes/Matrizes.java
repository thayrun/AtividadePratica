package atividadeVetoresMatrizes;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double nota[][] = new double[10][4];
		double media[] = new double[10];
		double soma;

		// para ler as notas dos participantes - IN.
		for (int indiceLinha = 0; indiceLinha < 10; indiceLinha++) {
			System.out.println("Digite a nota do participante: " + (indiceLinha + 1));
			for (int indiceColuna = 0; indiceColuna < 4; indiceColuna++) {
				System.out.println("Nota do bimestre [" + (indiceColuna + 1) + "]: ");
				nota[indiceLinha][indiceColuna] = ler.nextDouble();

			}
                 System.out.println();     // para dar espaço entre os laços.
		}

		// para calcular as médias.
		for (int indiceLinha = 0; indiceLinha < 10; indiceLinha++) {
			soma = 0;
			for (int indiceColuna = 0; indiceColuna < 4; indiceColuna++) {
				soma += nota[indiceLinha][indiceColuna];
			}

			media[indiceLinha] = soma / 4;
		}
         
		// Saída - OUT.
		System.out.println("Médias dos participantes: ");
		for (int indiceLinha = 0; indiceLinha < 10; indiceLinha++) {
			System.out.printf("[Participante " + (indiceLinha + 1) + "]: [%.1f] %n", media[indiceLinha]);

		}
	}

}
