package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetBackgroundExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de getBackground()");
        //Determina el comportamiento para cerrar el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        //Establece la visibilidad
        frame.setVisible(true);
        
        JPanel panel = new JPanel();
        //Agregando color de fondo
        panel.setBackground(Color.cyan);
        // Obtener el color de fondo del panel
        Color colorFondo = panel.getBackground();
        System.out.println("Color de fondo: " + colorFondo);
     // Crear un botón
        JButton boton = new JButton("Color RGB");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar un cuadro de diálogo con un mensaje después de presionar el botón
                JOptionPane.showMessageDialog(null, "El color del panel es "+colorFondo);
            }
        });
        //Agregar elementos al panel 
        frame.add(panel);
       
        panel.add(boton);
        
    }
}
