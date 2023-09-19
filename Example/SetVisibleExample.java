package Example;
//Copiar codigo desde aqui
import javax.swing.*;

//Agregar el nombre de la clase o realizar una nueva clase con el nombre SetVisibleExample
public class SetVisibleExample {
    public static void main(String[] args) {
  	  // Crear un nuevo JFrame
        JFrame frame = new JFrame("Ejemplo de setVisible");

        // Configurar el tamaño de la ventana
        frame.setSize(400, 300);

        // Hacer que la ventana sea visible
        frame.setVisible(true);

        // Configurar el comportamiento al cerrar la ventana
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Configura la posición inicial de la ventana 
        frame.setLocationRelativeTo(null);
        
        //Se crear un panel para despues insertar 2 botones
        JPanel panel= new JPanel();
        //Se crea el primer botón 
        JButton btn1= new JButton("Boton 1");
        //Se crea el segundo botón 
        JButton btn2= new JButton("Boton 2");
        
        //Se agraga componentes al panel y frame
        frame.add(panel);
        panel.add(btn1);
        panel.add(btn2);
        
        //Se indica la visibilidad de los botones
        btn2.setVisible(true);
        btn2.setVisible(true);
        
        //Oculta el botón 2 despues de 3 segundos
          try {
            Thread.sleep(3000); // Esperar 3 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Ocultar el botón 2
        btn2.setVisible(false);
        
        //Activa el botón 2 despues de 6 segundos
        try {
            Thread.sleep(6000); // Esperar 6 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Activar el botón 1  
        btn2.setVisible(true);
    }
}
