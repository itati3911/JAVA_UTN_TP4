	package principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Trabajo Practico N° 4");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Grupo N° 7");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		contentPane.add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{230, 115, 0};
		gbl_panel.rowHeights = new int[]{68, 53, 53, 53, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnEjercicio1 = new JButton("Ejercicio 1");
		btnEjercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio1 ventana1 = new Ejercicio1();
				ventana1.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnEjercicio1 = new GridBagConstraints();
		gbc_btnEjercicio1.fill = GridBagConstraints.BOTH;
		gbc_btnEjercicio1.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio1.gridx = 1;
		gbc_btnEjercicio1.gridy = 1;
		panel.add(btnEjercicio1, gbc_btnEjercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Ejercicio2 ventana2 = new Ejercicio2();
				ventana2.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnEjercicio2 = new GridBagConstraints();
		gbc_btnEjercicio2.fill = GridBagConstraints.BOTH;
		gbc_btnEjercicio2.insets = new Insets(0, 0, 5, 0);
		gbc_btnEjercicio2.gridx = 1;
		gbc_btnEjercicio2.gridy = 2;
		panel.add(btnEjercicio2, gbc_btnEjercicio2);
		
		JButton bntEjercicio3 = new JButton("Ejercicio 3");
		bntEjercicio3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				Ejercicio3 ventanta3 = new Ejercicio3();
				ventanta3.setVisible(true);
			}
		});
		GridBagConstraints gbc_bntEjercicio3 = new GridBagConstraints();
		gbc_bntEjercicio3.fill = GridBagConstraints.BOTH;
		gbc_bntEjercicio3.gridx = 1;
		gbc_bntEjercicio3.gridy = 3;
		panel.add(bntEjercicio3, gbc_bntEjercicio3);
	}
}
