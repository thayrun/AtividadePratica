package atividadesLacosRepeat;

import java.util.Scanner;

public class Rascunho {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String continua = "s";
		int age, gen, categ;
		int backEnd = 0, womanFront = 0, menMobile40 = 0, fsWoman30 = 0;
//		int womanAge = 0, menAge = 0;

		while (continua.equalsIgnoreCase("S")) {

			System.out.println("Digite sua idade: ");
			age = leia.nextInt();

			System.out.println("Digite genero: \n1 - Masculino \n2 - Feminino \n3 - Outros");
			gen = leia.nextInt();

			System.out.println("Digite a categoria: \n1 - Backend \n2 - Frontend \n3 - Mobile \n4 - FullStack ");
			categ = leia.nextInt();

			if (categ == 1) {
				backEnd++;
			} else if (categ == 2 && gen == 2) {
				womanFront++;
			} else if (categ == 3 && gen == 1 && age > 40) {
				menMobile40++;
			} else if (categ == 4 && gen == 2 && age < 30) {
				fsWoman30++;
			}

			System.out.println("Deseja continuar? \nDigite(S)im ou (N)ão: ");
			continua = leia.next();

		}

		System.out.println("Total de pessoas desenvolvedoras Backend: " + backEnd);
		System.out.println("Total de mulheres desenvolvedoras Frontend: " + womanFront);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + menMobile40);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fsWoman30);

	}

}
