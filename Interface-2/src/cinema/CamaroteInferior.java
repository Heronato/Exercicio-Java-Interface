package cinema;

import javax.swing.JOptionPane;

public class CamaroteInferior extends VIP{
	
	public CamaroteInferior() {
		
	}

	public CamaroteInferior(double valor) {
		super(valor);
	}
	
	public double valorCI() {
		return getValor() + 9;
	}
	
	public void Imprime() {
		JOptionPane.showConfirmDialog(null, "Ingresso no Camarote Inferior \n" + "Valor: R$" + valorCI());
	}
}
