package collectionQueueStack;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class AtividadeQueue {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcoes;
		String nomeCliente, chamaCliente;

		do {
			System.out.println("\t*******************************");
			System.out.println("\t*       MENU PRINCIPAL       *");
			System.out.println("\t*******************************\t");
			System.out.println("\t1 - Adicionar Cliente na Fila.");
			System.out.println("\t2 - Listar todos os Clientes.");
			System.out.println("\t3 - Retirar Cliente da Fila.");
			System.out.println("\t0 - Sair.");
			System.out.println("\t*******************************\t");
			System.out.println("\t               *\t          ");
			System.out.print("\nEntre com a opção desejada: \n");
			opcoes = ler.nextInt();
			ler.nextLine();

			switch (opcoes) {
			case 1:
				System.out.println("Digite o nome: "); {
				nomeCliente = ler.nextLine();
				fila.add(nomeCliente);
				System.out.println("Cliente Adicionado!\n");
			}
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nA fila está vazia.");
				} else {
					System.out.println("\nClientes na fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("A fila está vazia.");
				} else {
					chamaCliente = fila.poll();
					System.out.println("\nO Cliente " + chamaCliente + " foi chamado!. \nClientes na fila: ");
					for (String cliente : fila) {
						System.out.println(cliente);
					}
				}
				break;
			case 0:
				System.out.println("Programa Finalizado!.");
				break;
			default:
				System.out.println(
						"\nOcorreu um erro! \n\nDigite um número válido. \n\nAperte \"ENTER\" para voltar ao MENU. \n");
				ler.nextLine();
				break;
			}

		} while (opcoes != 0);

	}
}
