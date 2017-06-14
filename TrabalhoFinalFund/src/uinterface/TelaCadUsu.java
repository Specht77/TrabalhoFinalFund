package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadUsu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadUsu window = new TelaCadUsu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCadUsu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(23, 103, 71, 16);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCadastroDeUsurio = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastroDeUsurio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCadastroDeUsurio.setBounds(149, 26, 243, 31);
		frame.getContentPane().add(lblCadastroDeUsurio);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(95, 100, 376, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCPFCNPJ = new JLabel("CPF / CNPJ:");
		lblCPFCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCPFCNPJ.setBounds(23, 158, 119, 16);
		frame.getContentPane().add(lblCPFCNPJ);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setBounds(130, 155, 341, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(23, 204, 71, 22);
		frame.getContentPane().add(lblEmail);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 207, 376, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(45, 301, 125, 25);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(352, 301, 119, 25);
		frame.getContentPane().add(btnCancelar);
	}
}
