package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetComponentsExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de getComponents()");
        //Determina el comportamiento para cerrar el programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        //Establece la visibilidad
        frame.setVisible(true);
        // Crear un JPanel
        JPanel panel = new JPanel();

        //Creación de botones 
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón con efecto ");
        JButton button3 = new JButton("Botón 3");
        JButton button4 = new JButton("Botón 4");
        JButton button5 = new JButton("Botón 5");
        JButton button6 = new JButton("Botón 6");

        //Agregar elementos al panel 
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        frame.add(panel);

        // Agregar un ActionListener al botón 2
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Component[] componentes = panel.getComponents(); // Obtener todos los componentes
                for (Component componente : componentes) {
                    if (componente instanceof JButton) {
                        ((JButton) componente).setText("¡Clickeado!");
                    }
                }
            }
        });

        
    }
}

