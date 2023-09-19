package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetPreferredSizeExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de getPreferredSize()");
        //Determina el comportamiento para cerrar el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        //Establece la visibilidad
        frame.setVisible(true);
        // Crear un JPanel
        JPanel panel=new JPanel();
        
        //Creación de botones 
        JButton boton = new JButton("Dimensión");
        //Implementand el metodo
        Dimension dimensionPreferida =boton.getPreferredSize();
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar un cuadro de diálogo con un mensaje después de presionar el botón
                JOptionPane.showMessageDialog(null, "La dimensión del botón es.. "+dimensionPreferida);
            }
        });
        //Agregar elementos al panel 
        frame.add(panel);
        panel.add(boton);

        
    }
}
