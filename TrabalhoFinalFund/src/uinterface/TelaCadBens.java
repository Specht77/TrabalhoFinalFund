package uinterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class TelaCadBens {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadBens window = new TelaCadBens();
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
	public TelaCadBens() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 20));
		frame.setBounds(100, 100, 625, 554);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCadastroDeBens = new JLabel("Cadastro de Bens");
		lblCadastroDeBens.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblCadastroDeBens.setBounds(182, 13, 235, 31);
		frame.getContentPane().add(lblCadastroDeBens);
		
		JLabel lblDescricaoBreve = new JLabel("Descri\u00E7\u00E3o Breve");
		lblDescricaoBreve.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescricaoBreve.setBounds(12, 60, 143, 25);
		frame.getContentPane().add(lblDescricaoBreve);
		
		JTextArea txtADescrBrev = new JTextArea();
		txtADescrBrev.setFont(new Font("Monospaced", Font.PLAIN, 15));
		txtADescrBrev.setBounds(12, 97, 532, 74);
		frame.getContentPane().add(txtADescrBrev);
		
		JLabel lblDescricaoCompleta = new JLabel("Descri\u00E7\u00E3o Completa");
		lblDescricaoCompleta.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblDescricaoCompleta.setBounds(12, 184, 183, 25);
		frame.getContentPane().add(lblDescricaoCompleta);
		
		JTextArea TxtADescComp = new JTextArea();
		TxtADescComp.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TxtADescComp.setBounds(12, 222, 532, 127);
		frame.getContentPane().add(TxtADescComp);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCategoria.setBounds(12, 362, 176, 31);
		frame.getContentPane().add(lblCategoria);
		
		JComboBox CmbBoxCateg = new JComboBox();
		CmbBoxCateg.setFont(new Font("Tahoma", Font.PLAIN, 15));
		CmbBoxCateg.setBounds(12, 406, 532, 22);
		frame.getContentPane().add(CmbBoxCateg);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConfirmar.setBounds(12, 469, 143, 25);
		frame.getContentPane().add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelar.setBounds(401, 469, 143, 25);
		frame.getContentPane().add(btnCancelar);
	}
}
