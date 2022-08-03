package ig3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Livraria extends JFrame {

	private JPanel contentPane;
	private JTextField tfLivros;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Livraria frame = new Livraria();
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
	public Livraria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox cb1 = new JCheckBox("R$ 10");
		cb1.setFont(new Font("Arial", Font.PLAIN, 12));
		cb1.setBounds(222, 51, 97, 23);
		contentPane.add(cb1);
		
		JCheckBox cb2 = new JCheckBox("R$ 20");
		cb2.setFont(new Font("Arial", Font.PLAIN, 12));
		cb2.setBounds(222, 77, 97, 23);
		contentPane.add(cb2);
		
		JCheckBox cb3 = new JCheckBox("R$ 30");
		cb3.setFont(new Font("Arial", Font.PLAIN, 12));
		cb3.setBounds(222, 103, 97, 23);
		contentPane.add(cb3);
		
		tfLivros = new JTextField();
		tfLivros.setBounds(31, 51, 125, 20);
		contentPane.add(tfLivros);
		tfLivros.setColumns(10);
		
		JRadioButton rb1 = new JRadioButton("Sim - R$ 5,00");
		rb1.setFont(new Font("Arial", Font.PLAIN, 11));
		rb1.setBounds(31, 107, 109, 23);
		contentPane.add(rb1);
		
		JRadioButton rb2 = new JRadioButton("N\u00E3o ");
		rb2.setFont(new Font("Arial", Font.PLAIN, 11));
		rb2.setBounds(31, 133, 109, 23);
		contentPane.add(rb2);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(29, 176, 379, 63);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Quantidade de livros:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel.setBounds(31, 23, 125, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pre\u00E7o dos livros:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(212, 27, 97, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Embrulhar presente?");
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(31, 86, 125, 14);
		contentPane.add(lblNewLabel_2);
	}
}
