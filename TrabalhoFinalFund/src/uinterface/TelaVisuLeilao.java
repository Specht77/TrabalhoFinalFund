package uinterface;

import java.awt.EventQueue;

import uinterface.TelaVisuLeilaoFinalizado;
import uinterface.TelaVisuLeilaoAndamento;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVisuLeilao {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisuLeilao window = new TelaVisuLeilao();
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
	public TelaVisuLeilao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 388, 259);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLeiles = new JLabel("Leil\u00F5es");
		lblLeiles.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLeiles.setBounds(139, 13, 130, 31);
		frame.getContentPane().add(lblLeiles);
		
		JButton btnLeiloEmAndamento = new JButton("Leil\u00F5es em Andamento");
		btnLeiloEmAndamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisuLeilaoAndamento leilaoAndamento = new TelaVisuLeilaoAndamento();
				
				frame.dispose();
			}
		});
		btnLeiloEmAndamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLeiloEmAndamento.setBounds(57, 73, 257, 25);
		frame.getContentPane().add(btnLeiloEmAndamento);
		
		JButton btnLeilesFinalizados = new JButton("Leil\u00F5es Finalizados");
		btnLeilesFinalizados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisuLeilaoFinalizado visualizarFinalizado = new TelaVisuLeilaoFinalizado();
				
				frame.dispose();
			}
		});
		btnLeilesFinalizados.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnLeilesFinalizados.setBounds(57, 134, 257, 25);
		frame.getContentPane().add(btnLeilesFinalizados);
		
		frame.setVisible(true);
	}

}
