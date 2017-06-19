package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
		JButton btnCadastrarUsurio = new JButton("Cadastrar Usu\u00E1rio");
		btnCadastrarUsurio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnCadastrarUsurio.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCadastrarUsurio.setBounds(70, 76, 300, 45);
		frame.getContentPane().add(btnCadastrarUsurio);
		
		JButton btnCadastrarLeilo = new JButton("Cadastrar Leil\u00E3o");
		btnCadastrarLeilo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastrarLeilo.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCadastrarLeilo.setBounds(70, 167, 300, 45);
		frame.getContentPane().add(btnCadastrarLeilo);
		
		JButton btnCadastrarBens = new JButton("Cadastrar Bens");
		btnCadastrarBens.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCadastrarBens.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnCadastrarBens.setBounds(70, 260, 300, 45);
		frame.getContentPane().add(btnCadastrarBens);
		
		JButton btnVisualizarLeiles = new JButton("Visualizar Leil\u00F5es");
		btnVisualizarLeiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVisualizarLeiles.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnVisualizarLeiles.setBounds(70, 347, 300, 45);
		frame.getContentPane().add(btnVisualizarLeiles);
	}
}
