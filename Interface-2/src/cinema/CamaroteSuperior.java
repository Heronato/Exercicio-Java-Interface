package cinema;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends VIP{
	
	CamaroteSuperior() {
		
	}

	public CamaroteSuperior(double valor) {
		super(valor);
	}
	
	public double ValorCS() {
		return getValor() + 11;
	}
	
	public void Imprime() {
		JOptionPane.showConfirmDialog(null, "Ingresso no Camarote Superior \n" + "Valor: R$" + ValorCS());
	}

}
