package uinterface;

import java.awt.EventQueue;

import persistance.*;
import business.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
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
		frame.setBounds(100, 100, 662, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVisualizarLeilao = new JLabel("Visualizar Leil\u00E3o em Andamento");
		lblVisualizarLeilao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVisualizarLeilao.setBounds(116, 13, 395, 31);
		frame.getContentPane().add(lblVisualizarLeilao);
		
		JLabel lblLeilao = new JLabel("Leil\u00E3o:");
		lblLeilao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeilao.setBounds(30, 76, 104, 16);
		frame.getContentPane().add(lblLeilao);
		
		JRadioButton rdbtnFechado = new JRadioButton("Fechado");
		rdbtnFechado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnFechado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnFechado.setBounds(135, 72, 127, 25);
		frame.getContentPane().add(rdbtnFechado);
		
		JRadioButton rdbtnAberto = new JRadioButton("Aberto");
		rdbtnAberto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnAberto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAberto.setBounds(295, 72, 127, 25);
		frame.getContentPane().add(rdbtnAberto);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnFechado);
		group.add(rdbtnAberto);
		
		JLabel lblLance = new JLabel("Lance:");
		lblLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLance.setBounds(30, 117, 71, 16);
		frame.getContentPane().add(lblLance);
		
		JRadioButton rdbtnDemanda = new JRadioButton("Demanda");
		rdbtnDemanda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnDemanda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDemanda.setBounds(135, 116, 127, 25);
		frame.getContentPane().add(rdbtnDemanda);
		
		JRadioButton rdbtnOferta = new JRadioButton("Oferta");
		rdbtnOferta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		rdbtnOferta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOferta.setBounds(295, 119, 127, 25);
		frame.getContentPane().add(rdbtnOferta);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtnDemanda);
		group1.add(rdbtnOferta);
		
		JLabel lblLeiloesEmAndamento = new JLabel("Leil\u00F5es em Andamento:");
		lblLeiloesEmAndamento.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeiloesEmAndamento.setBounds(30, 208, 232, 16);
		frame.getContentPane().add(lblLeiloesEmAndamento);
		
		JTextArea txtLeilaoAndamento = new JTextArea();
		txtLeilaoAndamento.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLeilaoAndamento.setBounds(30, 237, 561, 107);
		frame.getContentPane().add(txtLeilaoAndamento);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaVisuLeilao visualizarLeilao = new TelaVisuLeilao();				
				frame.dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(437, 357, 154, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(30, 357, 154, 25);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnPesquisar.setBounds(30, 170, 154, 25);
		frame.getContentPane().add(btnPesquisar);
		
		frame.setVisible(true);
	}
}
