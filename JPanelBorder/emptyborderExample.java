package JPanelBorder;
//Copiar codigo desde aqui
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


//Agregar el nombre de la clase o realizar una nueva clase con el nombre emptyborderExample
public class emptyborderExample {

	public static void main(String[] args) {		
	// Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de EmptyBorder");
	// Configurar el tamaño del JFrame 
        frame.setSize(300, 200);
        //Se configura el cierre del programa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Se indica la visibilidad
        frame.setVisible(true);
        //Se indica la posición inicial al ejecutar 
        frame.setLocationRelativeTo(null);
		

        // Crear un JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Crear un JButton
        JButton boton = new JButton("Mi Botón");
        JButton boton2 = new JButton("Mi Botón2");
        // Crear un EmptyBorder con márgenes de 20 píxeles en todos los lados
        EmptyBorder emptyBorder=new EmptyBorder(20,20,20,20);

        // Aplicar el borde al botón
        boton.setBorder(emptyBorder);
      
        // Agregar el botón al panel y posición
        panel.add(boton, BorderLayout.CENTER);
        panel.add(boton2, BorderLayout.WEST);
        // Agregar el panel al JFrame
        frame.add(panel);

        
	}
}
