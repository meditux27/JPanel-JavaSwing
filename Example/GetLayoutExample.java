package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetLayoutExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de getLayout()");
        //Determina el comportamiento para cerrar el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Establece la visibilidad
        frame.setVisible(true);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        // Crear un JPanel
        JPanel panel = new JPanel();

        // Obtener el administrador de diseño actual del panel
        LayoutManager administrador = panel.getLayout();
        System.out.println("Administrador de diseño: " + administrador);
        JButton boton = new JButton("Layout");
        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Mostrar un cuadro de diálogo con un mensaje después de presionar el botón
                JOptionPane.showMessageDialog(null, "Layout : "+administrador);
            }
        });
        //Agregar elementos al panel 
        frame.add(panel);
        panel.add(boton);
    }
}
