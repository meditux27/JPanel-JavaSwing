package JPanelLayoutManager;
//Copiar codigo desde aqui
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class BorderLayoutExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre BorderLayoutExample
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de BorderLayout");
        //Determina el comportamiento de cerrar la ventana 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        //Establece la visibilidad
        frame.setVisible(true);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);

        // Crear un JButton para cada área
        JButton buttonNorth = new JButton("Norte");
        JButton buttonSouth = new JButton("Sur");
        JButton buttonEast = new JButton("Este");
        JButton buttonWest = new JButton("Oeste");
        JPanel panel2=new JPanel();

        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");
        panel2.add(button1);
        panel2.add(button2);
        panel2.add(button3);
        
        // Establecer BorderLayout en el JFrame
        frame.setLayout(new BorderLayout());

        // Agregar los botones en diferentes áreas
        frame.add(buttonNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(buttonEast, BorderLayout.EAST);
        frame.add(buttonWest, BorderLayout.WEST);
        frame.add(panel2, BorderLayout.CENTER);

        
        
      
    }
}
