package Example;
//Copiar codigo desde aqui
import javax.swing.*;
import java.awt.*;
//Agregar el nombre de la clase o realizar una nueva clase con el nombre PreferredSizeExample
public class PreferredSizeExample {
    public static void main(String[] args) {
    	 // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de setPreferredSize");

        // Crear un JPanel
        JPanel panel = new JPanel();

        // Crear un JButton con un texto
        JButton boton = new JButton("Haz clic");

        // Establecer las dimensiones preferidas del JButton
        Dimension dimension = new Dimension(200, 100);
        boton.setPreferredSize(dimension);

        // Agregar el botón al panel
        panel.add(boton);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Configurar el tamaño del JFrame y cerrar la aplicación cuando se cierra la ventana
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
