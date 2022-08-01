package cinema;

import javax.swing.JOptionPane;

public class Bilheteria {

	public static void main(String[] args) {
		double valor;
		int op;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor padrão do ingresso: "));
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual ingresso você deseja? \n"
					+ "1 - normal \n"
					+ "2 - VIP \n"
					+ "3 - Camarote Inferior \n"
					+ "4 - Camarote Superior \n"
					+ "5 - Sair"));
		
		    if (op == 1) {
			    Normal normal = new Normal(valor);
			    normal.Imprime();
		    } else if (op == 2) {
			    VIP vip = new VIP(valor);
			    vip.Imprime();
		    } else if (op == 3) {
			    CamaroteInferior ci = new CamaroteInferior(valor);
			    ci.Imprime();
		    } else if (op == 4) {
			    CamaroteSuperior cs = new CamaroteSuperior(valor);
			    cs.Imprime();
		    } else if (op == 5) {
			    JOptionPane.showConfirmDialog(null, "Finalizando..");
			    break;
		    } else {
			    JOptionPane.showConfirmDialog(null, "Opção Inválida!");
		    }
		    
	    } 
		
   }

}
