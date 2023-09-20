package estructuraBasica;
//Copiar codigo desde aqui
import javax.swing.*;

public class EjemploJPanel {//Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
    	// Crear un nuevo JFrame con un título
        JFrame frame = new JFrame("Ejemplo de JPanel");
        // Configurar el comportamiento al cerrar
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Establecer la posición inicial al ejecutar la ventana
        frame.setLocationRelativeTo(null);
        

        // Crear un JPanel
        JPanel panel = new JPanel();

        // Crear un botón y agregarlo al JPanel
        JButton button = new JButton("Haga clic aquí");
        panel.add(button);

        // Agregar el JPanel al JFrame
        frame.getContentPane().add(panel);
        // Establecer el tamaño inicial de la ventana
        frame.setSize(300, 200);
        // Hacer visible la ventana
        frame.setVisible(true);
        
    }
}
