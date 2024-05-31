package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Instalacao_teste {

	private JFrame frmPrimeirosPassos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instalacao_teste window = new Instalacao_teste();
					window.frmPrimeirosPassos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Instalacao_teste() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeirosPassos = new JFrame();
		frmPrimeirosPassos.setTitle("Primeiros passos");
		frmPrimeirosPassos.setBounds(100, 100, 990, 572);
		frmPrimeirosPassos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimeirosPassos.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Instalação e teste");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 60));
		lblNewLabel.setBounds(70, 47, 810, 86);
		frmPrimeirosPassos.getContentPane().add(lblNewLabel);
	}
}
