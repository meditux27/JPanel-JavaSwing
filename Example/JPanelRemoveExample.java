package Example;
//Copiar codigo desde aqui
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelRemoveExample {
    public static void main(String[] args) {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de JPanel.remove()");
        //Determina el comportamiento para cerrar el programa 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Determina el tamaño de JFrame
        frame.setSize(300, 200);
        
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        // Crear un JPanel
        JPanel panel = new JPanel();

        // Crear un botón
        JButton addButton = new JButton("Agregar botón");
        JButton removeButton = new JButton("Eliminar botón");
        JButton button = new JButton("¡Soy un botón!");

        // Agregar un ActionListener al botón de agregar
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.add(button);
                panel.revalidate(); // Actualizar la disposición del panel
                panel.repaint(); // Volver a pintar el panel
            }
        });

        // Agregar un ActionListener al botón de eliminar
        removeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.remove(button);
                panel.revalidate(); // Actualizar la disposición del panel
                panel.repaint(); // Volver a pintar el panel
            }
        });

        // Agregar los botones al panel
        panel.add(addButton);
        panel.add(removeButton);

        // Agregar el panel al JFrame
        frame.add(panel);
      //Establece la visibilidad
        frame.setVisible(true);
        
    }
}
