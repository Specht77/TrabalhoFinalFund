package uinterface;

import java.awt.EventQueue;

import persistance.*;
import business.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadUsu {

	private static final String String = null;
	private JFrame frame;
	private JTextField TxtNome;
	private JTextField TxtCPF;
	private JTextField TxtEmail;

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
	 * @throws CadastroDAOException 
	 */
	public TelaCadUsu() throws CadastroDAOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws CadastroDAOException 
	 */
	private void initialize() throws CadastroDAOException {
		
		Usuario user = new Usuario(null, 0, null);
		
		UsuarioFachada usuFac = new UsuarioFachada();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 573, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNome.setBounds(23, 103, 71, 16);
		frame.getContentPane().add(lblNome);
		
		JLabel lblCadastroDeUsaurio = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastroDeUsaurio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCadastroDeUsaurio.setBounds(149, 26, 243, 31);
		frame.getContentPane().add(lblCadastroDeUsaurio);
		
		TxtNome = new JTextField();
		TxtNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNome.setText(null);
			}
		});
		TxtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TxtNome.setBounds(95, 100, 376, 22);
		frame.getContentPane().add(TxtNome);
		TxtNome.setColumns(10);
		
		JLabel lblCPFCNPJ = new JLabel("CPF / CNPJ:");
		lblCPFCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCPFCNPJ.setBounds(23, 158, 119, 16);
		frame.getContentPane().add(lblCPFCNPJ);
		
		TxtCPF = new JTextField();
		TxtCPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCPFCNPJ.setText(null);
			}
		});
		TxtCPF.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TxtCPF.setBounds(130, 155, 341, 22);
		frame.getContentPane().add(TxtCPF);
		TxtCPF.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(23, 204, 71, 22);
		frame.getContentPane().add(lblEmail);
		
		TxtEmail = new JTextField();
		TxtEmail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblEmail.setText(null);
			}
		});
		TxtEmail.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TxtEmail.setBounds(95, 207, 376, 22);
		frame.getContentPane().add(TxtEmail);
		TxtEmail.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int cpf = Integer.parseInt(TxtCPF.getText());
				try {
					usuFac.adicionarUsuario(TxtNome.getText(), cpf, TxtEmail.getText());
				} catch (CadastroDAOException e1) {
					e1.getMessage();
				}
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(45, 301, 125, 25);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu menu = new TelaMenu();				
				frame.dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(352, 301, 119, 25);
		frame.getContentPane().add(btnCancelar);
		
		frame.setVisible(true);
	}



}
