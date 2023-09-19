package JPanelLayoutManager;
//Copiar codigo desde aqui
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class FlowLayoutExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de FlowLayout");
        //Determina el comportamiento de cerrar la ventana 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        //Establece la visibilidad
        frame.setVisible(true);
        
        // Crear un JPanel con FlowLayout
        frame.setLayout(new FlowLayout());

        // Crear botones
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");

        // Agregar los botones al JPanel
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

       
    }
}
