package lojadeGames;

import p_utilidade.Cores;

// ATRIBUTOS
public class Produtos {
	private String nomedojogo;
	private String plataforma;
	private double valor;
	private int estoque;
	private String fabricante;

	// CONSTRUTOR
	public Produtos(String nomedojogo, String plataforma, double valor, int estoque, String fabricante) {
		this.nomedojogo = nomedojogo;
		this.plataforma = plataforma;
		this.valor = valor;
		this.estoque = estoque;
		this.fabricante = fabricante;
	}

	public String getNomedojogo() {
		return nomedojogo;
	}

	public void setNomedojogo(String nomedojogo) {
		this.nomedojogo = nomedojogo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	// VISUALIZAR
	public void visualizar() {
	System.out.println(Cores.TEXT_WHITE + "Nome do Game: " + Cores.TEXT_CYAN + nomedojogo);
    System.out.println(Cores.TEXT_WHITE + "Plataforma: " + Cores.TEXT_CYAN + plataforma + "             ");
    System.out.println(Cores.TEXT_WHITE + "Preço " + Cores.TEXT_GREEN + "R$: " + valor + "                 ");
    if (estoque <= 5) {
        System.out.print(Cores.TEXT_WHITE + "Estoque: " + Cores.TEXT_RED);
    } else {
        System.out.print(Cores.TEXT_WHITE + "Estoque: " + Cores.TEXT_YELLOW);
    }
    System.out.println(estoque + "                       ");
    System.out.println(Cores.TEXT_WHITE + "Fabricante: " + Cores.TEXT_CYAN + fabricante + "              ");
    System.out.println(Cores.TEXT_WHITE + "-*--------*---------*--------*---");
}
}
