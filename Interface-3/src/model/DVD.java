package model;

import javax.swing.JOptionPane;

public class DVD extends Produto{
	
	private int minutos;
	
	public DVD() {
		
	}

	public DVD(String nome, double preco, int minutos) {
		super(nome, preco);
		this.minutos = minutos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	
	public void Imprime() {
		JOptionPane.showConfirmDialog(null, "DVD: \n" + "Filme: " + getNome() + "\n Pre?o: R$" + getPreco() + "\n Dura??o: " + getMinutos());

	}

}
