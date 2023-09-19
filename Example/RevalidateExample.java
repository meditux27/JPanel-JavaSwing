package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Agregar el nombre de la clase o realizar una nueva clase con el nombre RevalidateExample
public class RevalidateExample {
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de revalidate()");
        //Determina el comportamiento de cerrar la ventana 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200); 
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        //Establece la visibilidad
        frame.setVisible(true);
        
        //Creación de panel 
        JPanel panel = new JPanel();
        //Creación de botoón
        JButton addButton = new JButton("Agregar botón");
        
        // Agregar un ActionListener al botón
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton newButton = new JButton("¡Nuevo botón!");
                panel.add(newButton);
                // Recalcula y aplica el diseño del panel
                panel.revalidate();
            }
        });

        panel.add(addButton);
        frame.add(panel);
        
    }
}
