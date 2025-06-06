package principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mensaje extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public Mensaje(String texto) {
        setTitle("Mensaje");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 200);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(10, 10));

        JPanel panelCentro = new JPanel(new FlowLayout(FlowLayout.LEFT, 20, 20));

        JLabel iconoLabel = new JLabel(UIManager.getIcon("OptionPane.informationIcon"));
        panelCentro.add(iconoLabel);

        JLabel textoLabel = new JLabel("<html><b>" + texto + "</b></html>");
        panelCentro.add(textoLabel);

        contentPane.add(panelCentro, BorderLayout.CENTER);

        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnAceptar);
        contentPane.add(panelBoton, BorderLayout.SOUTH);
    }
}
