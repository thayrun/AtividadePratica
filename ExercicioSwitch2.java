package atividadesLacosCond;

import java.util.Scanner;

public class ExercicioSwitch2 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		String nome, cargo;
		int codigoC; // codigo do colaborador no switch
		float salarioAtual, reajuste, novoSalario;

		System.out.println("Digite o nome do colaborador: ");
		nome = ler.nextLine();

		System.out.println("Cargo: ");
		codigoC = ler.nextInt();

		System.out.println("Salário R$: ");
		salarioAtual = ler.nextFloat();

		switch (codigoC) {
		case 1:
			cargo = "Gerente";
			reajuste = 0.1f;
			break;
		case 2:
			cargo = "Vendedor";
			reajuste = 0.07f;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09f;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06f;
			break;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05f;
			break;
		case 6:
			cargo = "Técnico de TI";
			reajuste = 0.08f;
			break;
			default:
				System.out.println("Cargo inválido!.");
				return;                                            // tava dando erro sem return
		}
	
		
	           novoSalario = salarioAtual + (reajuste * salarioAtual);
        
	           System.out.println("Nome do colaborador: " + nome);
	           System.out.println("Cargo: " + cargo);
		       System.out.println("Salário: R$ " + salarioAtual);
		       System.out.println("Novo Salário: R$ " + novoSalario);
	}

}
