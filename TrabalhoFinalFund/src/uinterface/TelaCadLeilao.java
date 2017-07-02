package uinterface;

import java.awt.EventQueue;

import persistance.*;
import business.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadLeilao {

	private JFrame frame;
	private JTextField textData;
	private JTextField textHora;
	private JTextField TxtDtFinal;
	private JTextField txtHrFinal;

	private JTextField txtBens;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadLeilao window = new TelaCadLeilao();
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
	public TelaCadLeilao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 690, 484);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastroLeilao = new JLabel("Cadastro de Leil\u00E3o");
		lblCadastroLeilao.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCadastroLeilao.setBounds(216, 13, 278, 40);
		frame.getContentPane().add(lblCadastroLeilao);
		
		JLabel lblBens = new JLabel("Bens:");
		lblBens.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBens.setBounds(29, 60, 56, 16);
		frame.getContentPane().add(lblBens);
		
		JLabel lblNatureza = new JLabel("Natureza:");
		lblNatureza.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNatureza.setBounds(29, 208, 105, 25);
		frame.getContentPane().add(lblNatureza);
		
		JRadioButton rdbtnOferta = new JRadioButton("Oferta");
		rdbtnOferta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOferta.setBounds(142, 208, 127, 25);
		frame.getContentPane().add(rdbtnOferta);
		
		JRadioButton rdbtnDemanda = new JRadioButton("Demanda");
		rdbtnDemanda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDemanda.setBounds(294, 208, 127, 25);
		frame.getContentPane().add(rdbtnDemanda);
		
		JList listBens = new JList();
		listBens.setFont(new Font("Tahoma", Font.PLAIN, 15));
		listBens.setBounds(29, 89, 611, 106);
		frame.getContentPane().add(listBens);
		
		JLabel lblData = new JLabel("Data Inicio:");
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblData.setBounds(29, 306, 105, 16);
		frame.getContentPane().add(lblData);
		
		textData = new JTextField();
		textData.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textData.setBounds(142, 305, 132, 23);
		frame.getContentPane().add(textData);
		textData.setColumns(10);
		
		JLabel lblHora = new JLabel("Hora Inicio:");
		lblHora.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHora.setBounds(294, 306, 105, 16);
		frame.getContentPane().add(lblHora);
		
		textHora = new JTextField();
		textHora.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textHora.setText("");
		textHora.setBounds(411, 304, 132, 25);
		frame.getContentPane().add(textHora);
		textHora.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu telamenu = new telamenu();
				
				frame.dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(468, 383, 172, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(33, 383, 172, 25);
		frame.getContentPane().add(btnConfirmar);
		
		JLabel lblLances = new JLabel("Lances:");
		lblLances.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLances.setBounds(29, 253, 95, 18);
		frame.getContentPane().add(lblLances);
		
		JRadioButton rdbtnAbertos = new JRadioButton("Abertos");
		rdbtnAbertos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAbertos.setBounds(142, 250, 127, 25);
		frame.getContentPane().add(rdbtnAbertos);
		
		JRadioButton rdbtnFechado = new JRadioButton("Fechado");
		rdbtnFechado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnFechado.setBounds(294, 250, 127, 25);
		frame.getContentPane().add(rdbtnFechado);
		
		JLabel lblDataFinal = new JLabel("Data Final:");
		lblDataFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataFinal.setBounds(29, 335, 105, 16);
		frame.getContentPane().add(lblDataFinal);
		
		TxtDtFinal = new JTextField();
		TxtDtFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TxtDtFinal.setBounds(142, 335, 132, 22);
		frame.getContentPane().add(TxtDtFinal);
		TxtDtFinal.setColumns(10);
		
		JLabel lblHoraFinal = new JLabel("Hora Final:");
		lblHoraFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoraFinal.setBounds(294, 338, 105, 16);
		frame.getContentPane().add(lblHoraFinal);
		
		txtHrFinal = new JTextField();
		txtHrFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtHrFinal.setBounds(411, 334, 132, 22);
		frame.getContentPane().add(txtHrFinal);
		txtHrFinal.setColumns(10);

		
		txtBens = new JTextField();
		txtBens.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBens.setBounds(84, 60, 190, 22);
		frame.getContentPane().add(txtBens);
		txtBens.setColumns(10);
		
		JButton button = new JButton("+");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(294, 56, 56, 25);
		frame.getContentPane().add(button);
		
		frame.setVisible(true);
	}
}
