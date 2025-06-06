package principal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	
	private JTextField txtPromedio;
	private JTextField txtCondicion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		
		setBackground(SystemColor.windowText);
		setForeground(SystemColor.windowText);
		setTitle("Ejercicio2");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 513, 389);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.menu);
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "", TitledBorder.LEADING, TitledBorder.TOP, null, SystemColor.desktop));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setForeground(SystemColor.desktop);
		btnSalir.setBackground(UIManager.getColor("Button.focus"));
		btnSalir.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnSalir.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        dispose();
		    }
		});
		btnSalir.setBounds(370, 165, 104, 23);
		contentPane.add(btnSalir);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "Notas Estudiante", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(32, 11, 308, 201);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNota1 = new JTextField();
		txtNota1.setBounds(145, 27, 106, 20);
		panel.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.setBounds(145, 75, 106, 20);
		panel.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.setBounds(145, 114, 106, 20);
		panel.add(txtNota3);
		txtNota3.setColumns(10);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setBounds(25, 30, 46, 14);
		panel.add(lblNota1);
		
		JLabel lblNota2 = new JLabel("Nota 2:");
		lblNota2.setBounds(25, 78, 46, 14);
		panel.add(lblNota2);
		
		JLabel lblNota3 = new JLabel("Nota 3:");
		lblNota3.setBounds(25, 120, 46, 14);
		panel.add(lblNota3);
		
		JLabel lblTPS = new JLabel("TPS");
		lblTPS.setBounds(25, 158, 46, 14);
		panel.add(lblTPS);
		
		JComboBox cboAprobadoDesp = new JComboBox();
		cboAprobadoDesp.setFont(new Font("Georgia", Font.PLAIN, 13));
		cboAprobadoDesp.setBounds(145, 153, 106, 22);
		cboAprobadoDesp.addItem("");
		cboAprobadoDesp.addItem("Aprobado");
		cboAprobadoDesp.addItem("Desaprobado");
		panel.add(cboAprobadoDesp);
		
		JLabel lblAviso = new JLabel("");
		lblAviso.setForeground(Color.RED);
		lblAviso.setBounds(370, 234, 120, 14);
		contentPane.add(lblAviso);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.BLACK);
		panel_1.setBorder(new TitledBorder(new TitledBorder(new LineBorder(new Color(153, 180, 209)), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Notas Estudiante", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(32, 234, 308, 105);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.setForeground(SystemColor.windowText);
		btnCalcular.setBackground(UIManager.getColor("Button.focus"));
		btnCalcular.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
		            // Validación TP
		            if (cboAprobadoDesp.getSelectedIndex() == 0) { // 0 es el índice del ""
		                txtPromedio.setText("");
		                txtCondicion.setText("");
		                lblAviso.setText("Seleccione TP");
		                return;
		            }
					
		            double nota1 = Double.parseDouble(txtNota1.getText());
		            double nota2 = Double.parseDouble(txtNota2.getText());
		            double nota3 = Double.parseDouble(txtNota3.getText());
		            
		            String estadoTP = cboAprobadoDesp.getSelectedItem().toString();
		            
		            double promedio = (nota1 + nota2 + nota3) / 3;
		            txtPromedio.setText(String.format("%.2f", promedio));
		            
		            String condicion = "";
		            
		            if (estadoTP.equals("Desaprobado")) {
		                condicion = "Libre";
		            } else if (nota1 < 6 || nota2 < 6 || nota3 < 6) {
		                condicion = "Libre";
		            } else if (nota1 >= 8 && nota2 >= 8 && nota3 >= 8 && estadoTP.equals("Aprobado")) {
		                condicion = "Promocionado";
		            } else if (nota1 >= 6 && nota1 < 8 && nota2 >= 6 && nota2 < 8 && nota3 >= 6 && nota3 < 8 && estadoTP.equals("Aprobado")) {
		                condicion = "Regular";
		            } else {
		                condicion = "Regular";
		            }
		            
		            txtCondicion.setText(condicion);
		        } catch (NumberFormatException ex) {
		            txtPromedio.setText("");
		            txtCondicion.setText("");
		            lblAviso.setText("Error en notas");
		        }
			}
		});
		btnCalcular.setBounds(370, 61, 104, 23);
		contentPane.add(btnCalcular);
		
		JButton btnNuevo = new JButton("NUEVO");
		btnNuevo.setForeground(SystemColor.desktop);
		btnNuevo.setBackground(UIManager.getColor("Button.focus"));
		btnNuevo.setFont(new Font("Georgia", Font.PLAIN, 12));
		btnNuevo.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        txtNota1.setText("");
		        txtNota2.setText("");
		        txtNota3.setText("");
		        txtPromedio.setText("");
		        txtCondicion.setText("");
		        cboAprobadoDesp.setSelectedIndex(0);
		        txtNota1.requestFocus(); // Pone el cursor de nuevo en la primera nota
		    }
		});
		btnNuevo.setBounds(370, 110, 104, 23);
		contentPane.add(btnNuevo);
		
		JLabel lblPromedio = new JLabel("Promedio");
		lblPromedio.setBounds(10, 23, 78, 14);
		panel_1.add(lblPromedio);
		
		JLabel lblCondicion = new JLabel("Condicion");
		lblCondicion.setBounds(10, 79, 78, 14);
		panel_1.add(lblCondicion);
		
		txtPromedio = new JTextField();
		txtPromedio.setBounds(145, 20, 109, 20);
		panel_1.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		txtCondicion = new JTextField();
		txtCondicion.setBounds(145, 73, 109, 20);
		panel_1.add(txtCondicion);
		txtCondicion.setColumns(10);
		
	}
}
