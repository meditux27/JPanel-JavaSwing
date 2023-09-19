package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetComponentExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
        // Crear un JFrame
        JFrame frame = new JFrame("Ejemplo Sin If de getComponent");
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Determina el comportamiento para cerrar el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Establece la visibilidad
        frame.setVisible(true);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        
        // Crear un JPanel
        JPanel panel = new JPanel();

        // Crear y agregar varios botones al panel
        JButton boton1 = new JButton("Botón 0");
        JButton boton2 = new JButton("Botón 1");
        JButton boton3 = new JButton("Botón 2");
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        // Crear un botón para obtener el segundo botón del panel
        JButton obtenerBoton = new JButton("Obtener el Botón posición 1");
        obtenerBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el segundo botón (índice 1) del panel
                Component componente = panel.getComponent(1);

                try {
                    JButton botonObtenido = (JButton) componente;
                    JOptionPane.showMessageDialog(frame, "Botón obtenido: " + botonObtenido.getText());
                } catch (ClassCastException ex) {
                    JOptionPane.showMessageDialog(frame, "No se pudo obtener el botón.");
                }
            }
        });

        // Agregar el botón "Obtener Segundo Botón" al panel
        panel.add(obtenerBoton);

        // Agregar el panel al JFrame
        frame.add(panel);

       
    }
}
