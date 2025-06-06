package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio1 frame = new Ejercicio1();
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
	public Ejercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(138, 52, 68, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(216, 49, 172, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(138, 83, 68, 14);
		contentPane.add(lblApellido);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(138, 114, 68, 14);
		contentPane.add(lblTelefono);
		
		JLabel lblFecha = new JLabel("Fecha Nac.:");
		lblFecha.setBounds(138, 145, 68, 14);
		contentPane.add(lblFecha);
		
		textField_1 = new JTextField();
		textField_1.setBounds(216, 80, 172, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(216, 111, 172, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(216, 142, 172, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(299, 173, 89, 23);
		contentPane.add(btnMostrar);
		
		JLabel lblDatos = new JLabel("Los datos ingresados fueron:");
		lblDatos.setBounds(138, 202, 250, 14);
		contentPane.add(lblDatos);
	}
}
