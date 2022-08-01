package cinema;

import javax.swing.JOptionPane;

public class VIP extends Ingresso{
	
	private double vVIP;
	
	public VIP() {
		
	}

	public VIP(double valor) {
		super(valor);
	}

	public double getvVIP() {
		return vVIP;
	}

	public void setvVIP(double vVIP) {
		this.vVIP = vVIP;
	}
	
	public double valorVIP() {
		return getValor() + 7;
	}
	
	public void Imprime() {
		JOptionPane.showConfirmDialog(null, "Ingresso VIP \n" + "Valor: R$" + valorVIP());
	}
	
}
