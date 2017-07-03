package uinterface;

import java.awt.EventQueue;

import persistance.*;
import business.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLeilaoAndamento {

	private JFrame frame;
	private JTextField textDtInicial;
	private JTextField textHrInicial;
	private JTextField textDtFinal;
	private JTextField textHrFinal;
	private JTextField textUsu;
	private JTextField textVlInicial;
	private JTextField textUtmLance;
	private JTextField textLance;
	private JTextField textCod;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLeilaoAndamento window = new TelaLeilaoAndamento();
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
	public TelaLeilaoAndamento() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 595, 519);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLeilaoEmAndamento = new JLabel("Leil\u00E3o em Andamento");
		lblLeilaoEmAndamento.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLeilaoEmAndamento.setBounds(155, 13, 289, 31);
		frame.getContentPane().add(lblLeilaoEmAndamento);
		
		JLabel lblCod = new JLabel("Cod:");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCod.setBounds(42, 58, 57, 25);
		frame.getContentPane().add(lblCod);
		
		JLabel lblDataIncial = new JLabel("Data Incial:");
		lblDataIncial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataIncial.setBounds(42, 96, 104, 31);
		frame.getContentPane().add(lblDataIncial);
		
		JLabel lblHoraInicial = new JLabel("Hora Inicial:");
		lblHoraInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoraInicial.setBounds(312, 103, 123, 16);
		frame.getContentPane().add(lblHoraInicial);
		
		JLabel lblDataFinal = new JLabel("Data Final:");
		lblDataFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataFinal.setBounds(42, 140, 104, 16);
		frame.getContentPane().add(lblDataFinal);
		
		textCod = new JTextField();
		textCod.setEditable(false);
		textCod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textCod.setBounds(90, 61, 116, 22);
		frame.getContentPane().add(textCod);
		textCod.setColumns(10);
		
		textDtInicial = new JTextField();
		textDtInicial.setEditable(false);
		textDtInicial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDtInicial.setBounds(155, 102, 116, 22);
		frame.getContentPane().add(textDtInicial);
		textDtInicial.setColumns(10);
		
		textHrInicial = new JTextField();
		textHrInicial.setEditable(false);
		textHrInicial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textHrInicial.setBounds(425, 102, 116, 22);
		frame.getContentPane().add(textHrInicial);
		textHrInicial.setColumns(10);
		
		textDtFinal = new JTextField();
		textDtFinal.setEditable(false);
		textDtFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textDtFinal.setBounds(155, 139, 116, 22);
		frame.getContentPane().add(textDtFinal);
		textDtFinal.setColumns(10);
		
		JLabel lblHoraFinal = new JLabel("Hora Final:");
		lblHoraFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoraFinal.setBounds(312, 140, 104, 16);
		frame.getContentPane().add(lblHoraFinal);
		
		textHrFinal = new JTextField();
		textHrFinal.setEditable(false);
		textHrFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textHrFinal.setBounds(425, 139, 116, 22);
		frame.getContentPane().add(textHrFinal);
		textHrFinal.setColumns(10);
		
		JLabel lblLotes = new JLabel("Lotes em andamento:");
		lblLotes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLotes.setBounds(42, 169, 229, 16);
		frame.getContentPane().add(lblLotes);
		
		JTextArea textLote = new JTextArea();
		textLote.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textLote.setBounds(42, 198, 229, 84);
		frame.getContentPane().add(textLote);
		
		JLabel lblUsaurio = new JLabel("Usu\u00E1rio:");
		lblUsaurio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsaurio.setBounds(42, 295, 81, 16);
		frame.getContentPane().add(lblUsaurio);
		
		textUsu = new JTextField();
		textUsu.setEditable(false);
		textUsu.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUsu.setBounds(121, 294, 204, 22);
		frame.getContentPane().add(textUsu);
		textUsu.setColumns(10);
		
		JButton btnCancelarLeilao = new JButton("Cancelar Leil\u00E3o");
		btnCancelarLeilao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*realizar uma validação com if para verificar se o usúario é o dono do leilão*/
			}
		});
		btnCancelarLeilao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarLeilao.setBounds(347, 295, 194, 25);
		frame.getContentPane().add(btnCancelarLeilao);
		
		JLabel lblValorInicial = new JLabel("Valor inicial:");
		lblValorInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValorInicial.setBounds(42, 324, 116, 16);
		frame.getContentPane().add(lblValorInicial);
		
		textVlInicial = new JTextField();
		textVlInicial.setEditable(false);
		textVlInicial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textVlInicial.setBounds(155, 324, 116, 22);
		frame.getContentPane().add(textVlInicial);
		textVlInicial.setColumns(10);
		
		JLabel lblltimoLance = new JLabel("\u00DAltimo Lance:");
		lblltimoLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblltimoLance.setBounds(283, 327, 133, 16);
		frame.getContentPane().add(lblltimoLance);
		
		textUtmLance = new JTextField();
		textUtmLance.setEditable(false);
		textUtmLance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textUtmLance.setBounds(412, 324, 129, 22);
		frame.getContentPane().add(textUtmLance);
		textUtmLance.setColumns(10);
		
		JLabel lblDarLance = new JLabel("Dar lance:");
		lblDarLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDarLance.setBounds(42, 354, 104, 16);
		frame.getContentPane().add(lblDarLance);
		
		textLance = new JTextField();
		textLance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textLance.setBounds(138, 353, 116, 22);
		frame.getContentPane().add(textLance);
		textLance.setColumns(10);
		
		JButton btnConfirmarLance = new JButton("Confirmar lance");
		btnConfirmarLance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*Verificar se o usuario pode dar lance, se ele for o dono do leilão não há anecessidade*/
			}
		});
		btnConfirmarLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmarLance.setBounds(265, 353, 194, 25);
		frame.getContentPane().add(btnConfirmarLance);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(42, 416, 166, 25);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaMenu menu = new TelaMenu();				
				frame.dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(375, 416, 166, 25);
		frame.getContentPane().add(btnCancelar);
		
		JTextArea txtLance = new JTextArea();
		txtLance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtLance.setName("txtLoteEsco");
		txtLance.setBounds(312, 198, 229, 83);
		frame.getContentPane().add(txtLance);
		
		JLabel lblLotesEscolhidos = new JLabel("Lances dados:");
		lblLotesEscolhidos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLotesEscolhidos.setBounds(312, 169, 181, 16);
		frame.getContentPane().add(lblLotesEscolhidos);
		
		frame.setVisible(true);
	}
}
