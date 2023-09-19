package Example;
//Copiar codigo desde aqui
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SetBackground { //Modificar el nombre de la clase a su preferencia o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
        // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de setBackground");
        // Configurar el tamaño del JFrame
        frame.setSize(400, 300);
        // Configura el cierre por medio del boton de la ventana 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Configura que la posición de inicio sea en el centro de la pantalla 
        frame.setLocationRelativeTo(null);
        // Crear un JPanel
        JPanel panel = new JPanel();
        
        // Establecer el color de fondo del JPanel
        panel.setBackground(Color.DARK_GRAY); // Puedes usar otros colores como Color.RED, Color.GREEN, etc.

        // Agregar el JPanel al JFrame
        frame.add(panel);

      //Configura que se haga visible la ventana
        frame.setVisible(true);
    }
}
