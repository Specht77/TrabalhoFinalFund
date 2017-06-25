package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaVisuLeilaoAndamento {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisuLeilaoAndamento window = new TelaVisuLeilaoAndamento();
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
	public TelaVisuLeilaoAndamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 662, 412);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVisualizarLeiloEm = new JLabel("Visualizar Leil\u00E3o em Andamento");
		lblVisualizarLeiloEm.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVisualizarLeiloEm.setBounds(116, 13, 395, 31);
		frame.getContentPane().add(lblVisualizarLeiloEm);
		
		JLabel lblLeiles = new JLabel("Leil\u00F5es:");
		lblLeiles.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeiles.setBounds(30, 76, 104, 16);
		frame.getContentPane().add(lblLeiles);
		
		JRadioButton rdbtnFechado = new JRadioButton("Fechado");
		rdbtnFechado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnFechado.setBounds(135, 72, 127, 25);
		frame.getContentPane().add(rdbtnFechado);
		
		JRadioButton rdbtnAberto = new JRadioButton("Aberto");
		rdbtnAberto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAberto.setBounds(295, 72, 127, 25);
		frame.getContentPane().add(rdbtnAberto);
		
		JLabel lblLance = new JLabel("Lance:");
		lblLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLance.setBounds(30, 117, 71, 16);
		frame.getContentPane().add(lblLance);
		
		JRadioButton rdbtnDemanda = new JRadioButton("Demanda");
		rdbtnDemanda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDemanda.setBounds(135, 116, 127, 25);
		frame.getContentPane().add(rdbtnDemanda);
		
		JRadioButton rdbtnOferta = new JRadioButton("Oferta");
		rdbtnOferta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOferta.setBounds(295, 119, 127, 25);
		frame.getContentPane().add(rdbtnOferta);
		
		JLabel lblLeilesEmAndamento = new JLabel("Leil\u00F5es em Andamento:");
		lblLeilesEmAndamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeilesEmAndamento.setBounds(30, 157, 232, 16);
		frame.getContentPane().add(lblLeilesEmAndamento);
		
		JTextArea txtLeilaoAndamento = new JTextArea();
		txtLeilaoAndamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLeilaoAndamento.setBounds(30, 186, 561, 107);
		frame.getContentPane().add(txtLeilaoAndamento);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(30, 306, 154, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(437, 306, 154, 25);
		frame.getContentPane().add(btnConfirmar);
	}
}