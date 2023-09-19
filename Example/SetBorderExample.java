package Example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


import java.awt.*;

public class SetBorderExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo de setBorder()");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        // Crear un JPanel
        JPanel panel = new JPanel();
        
        // Crear un borde de línea roja con grosor de 2 píxeles
        //TitledBorder lineBorder = new TitledBorder("Titulo del borde");
        
        EmptyBorder sinborde=new EmptyBorder(6,7,8,6);
        
        // Establecer el borde en el panel
        panel.setBorder(sinborde);
        
        // Agregar el panel al JFrame
        frame.add(panel);

        frame.setVisible(true);
    }
}

