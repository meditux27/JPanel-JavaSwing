package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetSizeExample {
    public static void main(String[] args) {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de getSize()");
        //Determina el comportamiento para cerrar el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Establece la visibilidad
        frame.setVisible(true);
        

        JPanel panel =new JPanel();
        // Obtener la dimensión del JFrame
        Dimension dimension = frame.getSize();
        JButton boton = new JButton("Dimensión");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar un cuadro de diálogo con un mensaje después de presionar el botón
                JOptionPane.showMessageDialog(null, "La dimensión del botón es.. "+dimension);
            }
        });
        //Agregar elementos al panel 
        frame.add(panel);
        panel.add(boton);
        
    }
}
