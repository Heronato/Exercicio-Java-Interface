package ig;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	private JButton Subtrair;
	private JButton Dividir;
	private JButton Multiplicar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero 1:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(23, 26, 75, 14);
		contentPane.add(lblNewLabel);
		
		tfNum1 = new JTextField();
		tfNum1.setFont(new Font("Arial", Font.PLAIN, 11));
		tfNum1.setBounds(96, 24, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_1.setBounds(23, 58, 75, 14);
		contentPane.add(lblNewLabel_1);
		
		tfNum2 = new JTextField();
		tfNum2.setFont(new Font("Arial", Font.PLAIN, 11));
		tfNum2.setBounds(96, 56, 86, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel_2.setBounds(23, 167, 75, 14);
		contentPane.add(lblNewLabel_2);
		
		tfResultado = new JTextField();
		tfResultado.setFont(new Font("Arial", Font.PLAIN, 11));
		tfResultado.setBounds(96, 164, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton Somar = new JButton("Somar");
		Somar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 + num2;
				
				tfResultado.setText("" + resultado);
			}
		});
		Somar.setFont(new Font("Arial", Font.PLAIN, 11));
		Somar.setBounds(224, 85, 86, 23);
		contentPane.add(Somar);
		
		Subtrair = new JButton("Subtrair");
		Subtrair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 - num2;
				
				tfResultado.setText("" + resultado);
			}
		});
		Subtrair.setFont(new Font("Arial", Font.PLAIN, 11));
		Subtrair.setBounds(323, 85, 86, 23);
		contentPane.add(Subtrair);
		
		Dividir = new JButton("Dividir");
		Dividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				if (num2 <= 0) {
					tfResultado.setText("ERRO");
				} else { 
					resultado = num1 / num2;
					tfResultado.setText("" + resultado);
				}
			}
		});
		Dividir.setFont(new Font("Arial", Font.PLAIN, 11));
		Dividir.setBounds(323, 119, 86, 23);
		contentPane.add(Dividir);
		
		Multiplicar = new JButton("Multiplicar");
		Multiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 * num2;
				
				tfResultado.setText("" + resultado);
			}
		});
		Multiplicar.setFont(new Font("Arial", Font.PLAIN, 11));
		Multiplicar.setBounds(224, 119, 86, 23);
		contentPane.add(Multiplicar);
	}
}
