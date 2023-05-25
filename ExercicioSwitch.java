package atividadesLacosCond;

import java.util.Scanner;

public class ExercicioSwitch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		int codigo, quant;
		double vTotal = 0.0;
		String nomeProd = "";
		
       System.out.println("Código do Produto: ");
       codigo = leia.nextInt();
       
       System.out.println("Quantidade: ");
       quant = leia.nextInt();
       
       switch(codigo) {
       case 1:
    	   vTotal = quant * 10.00;
    	   nomeProd = "Cachorro Quente";
    	   break;
       case 2:
    	   vTotal = quant * 15.00;
    	   nomeProd = "X-Salada";
    	   break;
       case 3:
    	   vTotal = quant * 18.00;
    	   nomeProd = "X-Bacon";
    	   break;
       case 4:
    	   vTotal = quant * 12.00;
    	   nomeProd = "Bauru";
    	   break;
       case 5:
    	   vTotal = quant * 8.00;
    	   nomeProd = "Refrigerante";
    	   break;
       case 6:
    	   vTotal = quant * 13.00;
    	   nomeProd = "Suco de laranja";
    	   break;
    	   default:
    		   System.out.println("Código inválido.");
        }
       
       System.out.println("Produto: " + nomeProd);
       System.out.println("Valor total: R$: " + vTotal);

	}

}
