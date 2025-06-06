package principal;


import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Ejercicio3 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Ejercicio3() {
		
		// Armamos el marco principal
        JFrame frame = new JFrame("Selección Múltiple");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 359);
        frame.setLocation(500, 250);
        ButtonGroup soGrupo = new ButtonGroup();
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[]{384, 0};
        gridBagLayout.rowHeights = new int[]{90, 130, 55, 43, 0};
        gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        frame.getContentPane().setLayout(gridBagLayout);
                
        // Panel para seleccionar sistema operativo
        JPanel soPanel = new JPanel();
        soPanel.setLayout(null);
        
        JPanel soIntPanel = new JPanel();
        soIntPanel.setBounds(10, 11, 364, 68);
        soIntPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        soPanel.add(soIntPanel);
        soIntPanel.setLayout(null);
        
        JLabel lblPickSO = new JLabel("Elija un sistema operativo");
        lblPickSO.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblPickSO.setBounds(5, 19, 160, 30);
        soIntPanel.add(lblPickSO);
        JRadioButton windowsButton = new JRadioButton("Windows");
        windowsButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        windowsButton.setBounds(160, 19, 80, 30);
        soIntPanel.add(windowsButton);
        soGrupo.add(windowsButton);
        JRadioButton linuxButton = new JRadioButton("Linux");
        linuxButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        linuxButton.setBounds(298, 19, 60, 30);
        soIntPanel.add(linuxButton);
        soGrupo.add(linuxButton);
        JRadioButton macButton = new JRadioButton("Mac");
        macButton.setFont(new Font("Tahoma", Font.BOLD, 11));
        macButton.setBounds(242, 19, 50, 30);
        soIntPanel.add(macButton);
        soGrupo.add(macButton);
        
                // Agregamos paneles al marco
                GridBagConstraints gbc_soPanel = new GridBagConstraints();
                gbc_soPanel.fill = GridBagConstraints.BOTH;
                gbc_soPanel.insets = new Insets(0, 0, 5, 0);
                gbc_soPanel.gridx = 0;
                gbc_soPanel.gridy = 0;
                frame.getContentPane().add(soPanel, gbc_soPanel);
                
                // Panel para seleccionar especialidades
                JPanel especialidadesPanel = new JPanel();
                especialidadesPanel.setLayout(null);
                GridBagConstraints gbc_especialidadesPanel = new GridBagConstraints();
                gbc_especialidadesPanel.fill = GridBagConstraints.BOTH;
                gbc_especialidadesPanel.insets = new Insets(0, 0, 5, 0);
                gbc_especialidadesPanel.gridx = 0;
                gbc_especialidadesPanel.gridy = 1;
                frame.getContentPane().add(especialidadesPanel, gbc_especialidadesPanel);
                
                JPanel especInternalPanel = new JPanel();
                especInternalPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
                especInternalPanel.setBounds(10, 11, 364, 103);
                especialidadesPanel.add(especInternalPanel);
                especInternalPanel.setLayout(null);
                JCheckBox programmingCheckBox = new JCheckBox("Programación");
                programmingCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
                programmingCheckBox.setBounds(175, 10, 160, 20);
                especInternalPanel.add(programmingCheckBox);
                JCheckBox gamingCheckBox = new JCheckBox("Administración");
                gamingCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
                gamingCheckBox.setBounds(175, 40, 160, 20);
                especInternalPanel.add(gamingCheckBox);
                JCheckBox designCheckBox = new JCheckBox("Diseño Grafico");
                designCheckBox.setFont(new Font("Tahoma", Font.BOLD, 11));
                designCheckBox.setBounds(175, 70, 160, 20);
                especInternalPanel.add(designCheckBox);
                
                JLabel lblNewLabel = new JLabel("Elija una especialidad");
                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
                lblNewLabel.setBounds(10, 43, 145, 14);
                especInternalPanel.add(lblNewLabel);
        
                // Panel para ingresar horas
                JPanel horasPanel = new JPanel();
                                
                JLabel horasLabel = new JLabel("Cantidad de horas en la computadora:");
                horasLabel.setBounds(26, 18, 214, 14);
                horasLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
                JTextField horasField = new JTextField(5);
                horasField.setBounds(250, 15, 84, 20);
                horasPanel.setLayout(null);
                horasPanel.add(horasLabel);
                horasPanel.add(horasField);
                GridBagConstraints gbc_horasPanel = new GridBagConstraints();
                gbc_horasPanel.fill = GridBagConstraints.BOTH;
                gbc_horasPanel.insets = new Insets(0, 0, 5, 0);
                gbc_horasPanel.gridx = 0;
                gbc_horasPanel.gridy = 2;
                frame.getContentPane().add(horasPanel, gbc_horasPanel);
        
                // Botones
                JPanel botonPanel = new JPanel();
                JButton aceptarButton = new JButton("Aceptar");
                aceptarButton.setBounds(283, 6, 80, 30);
                
                aceptarButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                        boolean soSeleccionado = windowsButton.isSelected() || macButton.isSelected() || linuxButton.isSelected();
                        boolean especialidadSeleccionada = programmingCheckBox.isSelected() || designCheckBox.isSelected() || gamingCheckBox.isSelected();
                        String horas = horasField.getText().trim();
                        boolean horasValidas = !horas.isEmpty();

                        if (!soSeleccionado || !especialidadSeleccionada || !horasValidas) {
                            JOptionPane.showMessageDialog(frame,
                                    "Debe seleccionar un Sistema Operativo, al menos una Especialidad y completar las horas.",
                                    "Error de validación",
                                    JOptionPane.ERROR_MESSAGE);
                            return; 
                        }

                        // --- CAPTURAMOS OPCIONES ---
                        String sistemaOperativo = "";
                        if (windowsButton.isSelected()) {
                            sistemaOperativo = "Windows";
                        } else if (macButton.isSelected()) {
                            sistemaOperativo = "Mac";
                        } else if (linuxButton.isSelected()) {
                            sistemaOperativo = "Linux";
                        }

                        String especialidades = "";
                        if (programmingCheckBox.isSelected()) {
                            especialidades += "Programación - ";
                        }
                        if (designCheckBox.isSelected()) {
                            especialidades += "Diseño Gráfico - ";
                        }
                        if (gamingCheckBox.isSelected()) {
                            especialidades += "Gaming - ";
                        }

                        String mensajeFinal = sistemaOperativo + " - " + especialidades + horas + " Hs";

                        
                        Mensaje mensajeVentana = new Mensaje(mensajeFinal);
                        mensajeVentana.setVisible(true);
                    }
                });
                        botonPanel.setLayout(null);
                
                        botonPanel.add(aceptarButton);
                        GridBagConstraints gbc_botonPanel = new GridBagConstraints();
                        gbc_botonPanel.fill = GridBagConstraints.BOTH;
                        gbc_botonPanel.gridx = 0;
                        gbc_botonPanel.gridy = 3;
                        frame.getContentPane().add(botonPanel, gbc_botonPanel);

        // Hacemos visible la ventana
        frame.setVisible(true);
	}
}