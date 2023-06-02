package lojadeGames;

import p_utilidade.Cores;

public class TestaGame {

	public static void main(String[] args) {
        // Instanciar os produtos
        Produtos produto1 = new Produtos("Watch Dogs - Legion", "PC      ", 249.99, 3, "Ubisoft");
        Produtos produto2 = new Produtos("Hell Let Loose     ", "Xbox S X", 213.99, 5, "Team17 ");

        // Exibe o visualizar
        produto1.visualizar();
        produto2.visualizar();
    }
}
