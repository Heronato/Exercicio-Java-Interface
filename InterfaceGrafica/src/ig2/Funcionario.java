package ig2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCargo;
	private JTextField tfSalario;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel.setBounds(21, 28, 64, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cargo:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_1.setBounds(21, 53, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sal\u00E1rio:");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_2.setBounds(21, 78, 64, 14);
		contentPane.add(lblNewLabel_2);
		
		tfNome = new JTextField();
		tfNome.setFont(new Font("Arial", Font.PLAIN, 12));
		tfNome.setBounds(84, 25, 308, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setFont(new Font("Arial", Font.PLAIN, 12));
		tfCargo.setBounds(84, 50, 308, 20);
		contentPane.add(tfCargo);
		tfCargo.setColumns(10);
		
		tfSalario = new JTextField();
		tfSalario.setFont(new Font("Arial", Font.PLAIN, 12));
		tfSalario.setBounds(84, 78, 308, 20);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("Aumentar sal\u00E1rio");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 1.3;
				} else if (salario <= 2000) {
					sal = salario * 1.2;
				} else {
					sal = salario * 1.1;
				}
				
				tfResultado.setText("Nome: " + nome + "\n Cargo: " + cargo + "\n Novo Salário: " + sal);
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 20));
		btnNewButton.setBounds(10, 141, 205, 29);
		contentPane.add(btnNewButton);
		
		JButton btnDiminuirSalrio = new JButton("Diminuir sal\u00E1rio");
		btnDiminuirSalrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 0.9;
				} else if (salario <= 2000) {
					sal = salario * 0.8;
				} else {
					sal = salario * 0.7;
				}
				
				tfResultado.setText("Nome: " + nome + "\n Cargo: " + cargo + "\n Novo Salário: " + sal);
			}
		});
		btnDiminuirSalrio.setFont(new Font("Arial", Font.PLAIN, 20));
		btnDiminuirSalrio.setBounds(219, 141, 205, 29);
		contentPane.add(btnDiminuirSalrio);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Arial", Font.PLAIN, 14));
		tfResultado.setBounds(10, 191, 414, 59);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
	}

}
