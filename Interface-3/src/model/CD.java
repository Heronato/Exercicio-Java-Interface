package model;

import javax.swing.JOptionPane;

public class CD extends Produto{
	
	private int faixas;
	
	public CD() {
		
	}

	public CD(String nome, double preco, int faixas) {
		super(nome, preco);
		this.faixas = faixas;
	}

	public int getFaixas() {
		return faixas;
	}

	public void setFaixas(int faixas) {
		this.faixas = faixas;
	}
	
	public void Imprime() {
		JOptionPane.showConfirmDialog(null, "CDs \n" + "CD: " + getNome() + "\n Pre�o: R$" + getPreco() + "\n Faixas: " + getFaixas());
	}
}
