package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLeilaoFinalizado {

	private JFrame frame;
	private JTextField txtCod;
	private JTextField txtDTInicial;
	private JTextField tctHRInicial;
	private JTextField txtFTFinal;
	private JTextField txtHRFinal;
	private JTextField txtUsuario;
	private JTextField txtValorInicial;
	private JTextField txtUltimoLance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLeilaoFinalizado window = new TelaLeilaoFinalizado();
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
	public TelaLeilaoFinalizado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 576, 479);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLeiloesFinalizados = new JLabel("Leil\u00F5es Finalizados");
		lblLeiloesFinalizados.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLeiloesFinalizados.setBounds(182, 0, 248, 50);
		frame.getContentPane().add(lblLeiloesFinalizados);
		
		JLabel lblNewLabel = new JLabel("Cod:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(23, 62, 56, 16);
		frame.getContentPane().add(lblNewLabel);
		
		txtCod = new JTextField();
		txtCod.setEditable(false);
		txtCod.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtCod.setBounds(76, 62, 116, 22);
		frame.getContentPane().add(txtCod);
		txtCod.setColumns(10);
		
		JLabel lblDataInicial = new JLabel("Data Inicial:");
		lblDataInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDataInicial.setBounds(23, 107, 109, 16);
		frame.getContentPane().add(lblDataInicial);
		
		txtDTInicial = new JTextField();
		txtDTInicial.setEditable(false);
		txtDTInicial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDTInicial.setBounds(144, 107, 116, 22);
		frame.getContentPane().add(txtDTInicial);
		txtDTInicial.setColumns(10);
		
		JLabel lblHoraInicial = new JLabel("Hora Inicial:");
		lblHoraInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoraInicial.setBounds(300, 110, 116, 16);
		frame.getContentPane().add(lblHoraInicial);
		
		tctHRInicial = new JTextField();
		tctHRInicial.setEditable(false);
		tctHRInicial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tctHRInicial.setBounds(416, 106, 116, 22);
		frame.getContentPane().add(tctHRInicial);
		tctHRInicial.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Data Final:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(23, 147, 109, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtFTFinal = new JTextField();
		txtFTFinal.setEditable(false);
		txtFTFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtFTFinal.setBounds(144, 142, 116, 22);
		frame.getContentPane().add(txtFTFinal);
		txtFTFinal.setColumns(10);
		
		JLabel lblHoraFinal = new JLabel("Hora Final:");
		lblHoraFinal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblHoraFinal.setBounds(300, 147, 119, 16);
		frame.getContentPane().add(lblHoraFinal);
		
		txtHRFinal = new JTextField();
		txtHRFinal.setEditable(false);
		txtHRFinal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtHRFinal.setBounds(416, 146, 116, 22);
		frame.getContentPane().add(txtHRFinal);
		txtHRFinal.setColumns(10);
		
		JLabel lblBens = new JLabel("Bens:");
		lblBens.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBens.setBounds(23, 183, 56, 16);
		frame.getContentPane().add(lblBens);
		
		JTextArea txtBens = new JTextArea();
		txtBens.setEditable(false);
		txtBens.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtBens.setBounds(23, 212, 509, 88);
		frame.getContentPane().add(txtBens);
		
		JLabel lblUsaurio = new JLabel("Usu\u00E1rio:");
		lblUsaurio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUsaurio.setBounds(23, 313, 74, 16);
		frame.getContentPane().add(lblUsaurio);
		
		txtUsuario = new JTextField();
		txtUsuario.setEditable(false);
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUsuario.setBounds(100, 312, 160, 22);
		frame.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblValorInicial = new JLabel("Valor Inicial:");
		lblValorInicial.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblValorInicial.setBounds(23, 342, 116, 16);
		frame.getContentPane().add(lblValorInicial);
		
		txtValorInicial = new JTextField();
		txtValorInicial.setEditable(false);
		txtValorInicial.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtValorInicial.setBounds(144, 342, 116, 22);
		frame.getContentPane().add(txtValorInicial);
		txtValorInicial.setColumns(10);
		
		JLabel lblltimoLance = new JLabel("\u00DAltimo Lance:");
		lblltimoLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblltimoLance.setBounds(278, 345, 123, 16);
		frame.getContentPane().add(lblltimoLance);
		
		txtUltimoLance = new JTextField();	
		txtUltimoLance.setEditable(false);
		txtUltimoLance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtUltimoLance.setBounds(416, 342, 116, 22);
		frame.getContentPane().add(txtUltimoLance);
		txtUltimoLance.setColumns(10);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(372, 390, 160, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(23, 390, 160, 25);
		frame.getContentPane().add(btnConfirmar);
		
		frame.setVisible(true);
	}

}
