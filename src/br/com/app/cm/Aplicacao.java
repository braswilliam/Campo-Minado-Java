package br.com.app.cm;

import br.com.app.cm.modelo.Tabuleiro;
import br.com.app.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		

		
	}

}
