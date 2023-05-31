package collectionQueueStack;

import java.util.Scanner;
import java.util.Stack;

public class AtividadeStack {

	public static void main(String[] args) {
		Stack<String> livrosPilha = new Stack<String>();
		Scanner ler = new Scanner (System.in);
		int opcoes = -1;
		String nomeLivro, retiraLivro;
		
	while(opcoes != 0) {
		System.out.println("\t*******************************");
		System.out.println("\t*       MENU PRINCIPAL       *");
		System.out.println("\t*******************************\t");
		System.out.println("\t1 - Adicionar Livro na Pilha.");
		System.out.println("\t2 - Listar todos os Livros.");
		System.out.println("\t3 - Retirar Livros da Pilha");
		System.out.println("\t0 - Sair.");
		System.out.println("\t*******************************\t");
		System.out.println("\t               *\t          ");
		System.out.print("\nEntre com a opção desejada: \n");
		opcoes = ler.nextInt();
		ler.nextLine();
		
		switch(opcoes) {
		case 1:
			System.out.println("Digite o nome do Livro: ");
			nomeLivro = ler.nextLine();
			livrosPilha.push(nomeLivro);
			System.out.println("Livro Adicionado!\n");
			break;
		case 2:
			if(livrosPilha.isEmpty()) {
				System.out.println("A pilha está vazia!.");
			}else {
				System.out.println("\nLivros na pilha: ");
				for(String livros : livrosPilha) {
					System.out.println(livros);
				}
			}
			break;
		case 3:
			if(livrosPilha.isEmpty()) {
				System.out.println("\nA pilha está vazia.");
			}else {
			   retiraLivro = livrosPilha.pop();
			   System.out.println("\nLivro retirado: " + retiraLivro);
			}
			break;
		case 0:
			System.out.println("Programa finalizado.");
			break;
		default:
			System.out.println(
					"\nOcorreu um erro! \n\nDigite um número válido. \n\nAperte \"ENTER\" para voltar ao MENU. \n");
			ler.nextLine();
			break;
		}
		
	}
	}

}
