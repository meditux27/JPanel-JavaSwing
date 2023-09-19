package JPanelLayoutManager;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
public static void main(String[] args) {
    // Crear un nuevo JFrame
    JFrame frame = new JFrame("Ejemplo de GridLayout");
    //Determina el tamaño de JFrame
    frame.setSize(300, 200);
    //Determina el comportamiento para cerrar el programa 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    //Determina la posición inicial
    frame.setLocationRelativeTo(null);
    // Crear un JPanel con GridLayout
    JPanel panel = new JPanel(new GridLayout(3, 2));
    // El GridLayout tendrá 3 filas y 2 columnas

    // Crear y agregar componentes al panel
    panel.add(new JButton("Botón 1"));
    panel.add(new JButton("Botón 2"));
    panel.add(new JButton("Botón 3"));
    panel.add(new JButton("Botón 4"));
    panel.add(new JButton("Botón 5"));
    panel.add(new JButton("Botón 6"));

    // Agregar el panel al JFrame
    frame.add(panel);

  //Establece la visibilidad
    frame.setVisible(true);
}
}
