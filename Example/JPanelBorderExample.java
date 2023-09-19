package Example;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class JPanelBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de JPanel.setBorder()");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);

        // Crear un JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear diferentes tipos de bordes
        Border lineBorder = BorderFactory.createLineBorder(Color.red,3);
        Border titledBorder = BorderFactory.createTitledBorder("Borde con Título");
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);

        // Establecer los diferentes bordes en el panel
        panel.setBorder(lineBorder); // Borde de línea
        // panel.setBorder(titledBorder); // Borde con título
         //panel.setBorder(emptyBorder); // Borde vacío

        // Agregar el panel al JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}

