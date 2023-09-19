package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//Agregar el nombre de la clase o realizar una nueva clase con el nombre RepaintExample 
public class RepaintExample {
    public static void main(String[] args) {
    	  // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de repaint()");
     // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Configurar el tamaño de la ventana
        frame.setSize(300, 200);
     // Hacer que la ventana sea visible
        frame.setVisible(true);

        JPanel panel = new JPanel();
        JButton button = new JButton("Cambiar color");
        
        // Agregar un ActionListener al botón
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cambiar el color del panel
                panel.setBackground(Color.BLUE);
                // Solicitar un repintado del panel
                panel.repaint();
            }
        });

        panel.add(button);
        frame.add(panel);

       
    }
}

