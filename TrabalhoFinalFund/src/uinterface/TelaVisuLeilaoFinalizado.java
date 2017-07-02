package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class TelaVisuLeilaoFinalizado {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVisuLeilaoFinalizado window = new TelaVisuLeilaoFinalizado();
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
	public TelaVisuLeilaoFinalizado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 554, 384);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVisualizarLeilesFinalizados = new JLabel("Visualizar Leil\u00F5es Finalizados");
		lblVisualizarLeilesFinalizados.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblVisualizarLeilesFinalizados.setBounds(110, 13, 338, 31);
		frame.getContentPane().add(lblVisualizarLeilesFinalizados);
		
		JLabel lblLance = new JLabel("Lance:");
		lblLance.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLance.setBounds(36, 111, 67, 16);
		frame.getContentPane().add(lblLance);
		
		JLabel lblLeilao = new JLabel("Leil\u00E3o:");
		lblLeilao.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLeilao.setBounds(36, 74, 67, 16);
		frame.getContentPane().add(lblLeilao);
		
		JRadioButton rdbtnAberto = new JRadioButton("Aberto");
		rdbtnAberto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnAberto.setBounds(284, 70, 127, 25);
		frame.getContentPane().add(rdbtnAberto);
		
		JRadioButton rdbtnFechado = new JRadioButton("Fechado");
		rdbtnFechado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnFechado.setBounds(110, 70, 127, 25);
		frame.getContentPane().add(rdbtnFechado);
		
		JRadioButton rdbtnDemanda = new JRadioButton("Demanda");
		rdbtnDemanda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnDemanda.setBounds(110, 107, 127, 25);
		frame.getContentPane().add(rdbtnDemanda);
		
		JRadioButton rdbtnOferta = new JRadioButton("Oferta");
		rdbtnOferta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rdbtnOferta.setBounds(284, 107, 127, 25);
		frame.getContentPane().add(rdbtnOferta);
		
		JLabel lblVisualizarLeiloes = new JLabel("Visualizar leil\u00F5es:");
		lblVisualizarLeiloes.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblVisualizarLeiloes.setBounds(36, 152, 176, 16);
		frame.getContentPane().add(lblVisualizarLeiloes);
		
		JTextArea txtVisuLeilao = new JTextArea();
		txtVisuLeilao.setBounds(36, 181, 462, 91);
		frame.getContentPane().add(txtVisuLeilao);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(34, 285, 150, 25);
		frame.getContentPane().add(btnCancelar);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(350, 285, 148, 25);
		frame.getContentPane().add(btnConfirmar);
		
	}

}
