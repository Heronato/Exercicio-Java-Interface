package model;

import javax.swing.JOptionPane;

public class Loja {

	public static void main(String[] args) {
		
		String nome, autor;
		double preco;
		int faixas, minutos, op;
	
	
	    for(;;) {
	    	op = Integer.parseInt(JOptionPane.showInputDialog(
	    			"---CADASTRO DOS PRODUTOS---\n"
	    			+ "--- 1 CD \n"
	    			+ "--- 2 DVD \n"
	    			+ "--- 3 Livro \n"
	    			+ "--- 4 Finalizar"));
	    	
	    	if (op == 1) {
	    		nome = JOptionPane.showInputDialog("Nome do CD: ");
	    		preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do CD: "));
	    		faixas = Integer.parseInt(JOptionPane.showInputDialog("Faixas do CD: "));
	    		CD cd = new CD(nome, preco, faixas);
	    		cd.Imprime();
	    	} else if (op == 2) {
	    		nome = JOptionPane.showInputDialog("Nome do filme: ");
	    		preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do filme: "));
	    		minutos = Integer.parseInt(JOptionPane.showInputDialog("Duração em minutos: "));
	    		DVD dvd = new DVD(nome, preco, minutos);
	    		dvd.Imprime();
	    	} else if (op == 3) {
	    		nome = JOptionPane.showInputDialog("Nome do livro: ");
	    		autor = JOptionPane.showInputDialog("Nome do autor: ");
	    		preco = Double.parseDouble(JOptionPane.showInputDialog("Preço do livro: "));
	    		Livro liv = new Livro(nome, preco, autor);
	    		liv.Imprime();
	    	} else if (op == 4) {
	    		JOptionPane.showMessageDialog(null, "Finalizando...");
	    		break;
	    	} else {
	    		JOptionPane.showConfirmDialog(null, "!Opção Inválida!");
	    	}
	    }
    }

}
