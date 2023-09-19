package Example;
//Copiar codigo desde aqui
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPanelRemoveAllExample {//Agregar el nombre de la clase o realizar una nueva clase con el nombre presente 
    public static void main(String[] args) {
        //Creación de Jframe
        JFrame frame = new JFrame("Ejemplo de JPanel.removeAll()");
        //Determina el comportamiento para cerrar el programa 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Determina el tamaño de JFrame
        frame.setSize(400,400);
        //Determina la posición inicial
        frame.setLocationRelativeTo(null);
        // Crear un JPanel
        JPanel panel = new JPanel();

        // Crear botones
        JButton addButton = new JButton("Agregar botones");
        JButton removeAllButton = new JButton("Eliminar todos");

        // Agregar un ActionListener al botón de agregar
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton button1 = new JButton("Botón 1");
                JButton button2 = new JButton("Botón 2");
                panel.add(button1);
                panel.add(button2);
                panel.revalidate(); // Actualizar la disposición del panel
                panel.repaint(); // Volver a pintar el panel
            }
        });

        // Agregar un ActionListener al botón de eliminar todos
        removeAllButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
              panel.revalidate(); // Actualizar la disposición del panel
                panel.repaint(); // Volver a pintar el panel
            }
        });

        // Agregar los botones al panel
        panel.add(addButton);
        panel.add(removeAllButton);

        // Agregar el panel al JFrame
        frame.add(panel);
      //Establece la visibilidad
        frame.setVisible(true);
        
    }
}
