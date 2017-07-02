package uinterface;

import java.awt.EventQueue;

import uinterface.TelaCadBens;
import uinterface.TelaCadLeilao;
import uinterface.TelaCadUsu;
import uinterface.TelaVisuLeilao;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class TelaMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaMenu window = new TelaMenu();
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
	public TelaMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 470, 508);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnCadastrarUsuario = new JButton("Cadastrar Usu\u00E1rio");
		btnCadastrarUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadUsu cadastroUsuario = new TelaCadUsu();
				
				frame.dispose();
			}


		});
		btnCadastrarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCadastrarUsuario.setBounds(70, 76, 300, 45);
		frame.getContentPane().add(btnCadastrarUsuario);
		
		JButton btnCadastrarLeilao = new JButton("Cadastrar Leil\u00E3o");
		btnCadastrarLeilao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadLeilao cadastrarLeilao = new TelaCadLeilao();
				
				frame.dispose();
			}
		});
		btnCadastrarLeilao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCadastrarLeilao.setBounds(70, 167, 300, 45);
		frame.getContentPane().add(btnCadastrarLeilao);
		
		JButton btnCadastrarBens = new JButton("Cadastrar Bens");
		btnCadastrarBens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadBens cadastroBens = new TelaCadBens();
				
				frame.dispose();
			}
		});
		btnCadastrarBens.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCadastrarBens.setBounds(70, 260, 300, 45);
		frame.getContentPane().add(btnCadastrarBens);
		
		JButton btnVisualizarLeiloes = new JButton("Visualizar Leil\u00F5es");
		btnVisualizarLeiloes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisuLeilao visualizarLeiloes = new TelaVisuLeilao();
				
				frame.dispose();	
			}
		});
		btnVisualizarLeiloes.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVisualizarLeiloes.setBounds(70, 347, 300, 45);
		frame.getContentPane().add(btnVisualizarLeiloes);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblMenu.setBounds(169, 13, 109, 36);
		frame.getContentPane().add(lblMenu);
		
		frame.setVisible(true);
	}
}
