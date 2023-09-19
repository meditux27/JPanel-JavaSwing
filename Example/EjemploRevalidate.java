package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class EjemploRevalidate {

	public static void main(String[] args) {
		// Crear un JFrame
        JFrame frame = new JFrame("Ejemplo de revalidate");

        // Crear un JPanel
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        // Crear un botón para agregar componentes al panel
        JButton agregarBoton = new JButton("Agregar Componente");
        agregarBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo botón y agregarlo al panel
                JButton nuevoBoton = new JButton("Nuevo Botón");
                panel.add(nuevoBoton);

                // Llamar a revalidate() para actualizar el diseño del panel
                panel.revalidate();
            }
        });

        // Crear un botón para quitar componentes del panel
        JButton quitarBoton = new JButton("Quitar Componente");
        quitarBoton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Quitar el último botón agregado al panel
                Component[] componentes = panel.getComponents();
                if (componentes.length > 0) {
                    panel.remove(componentes[componentes.length - 1]);
                    // Llamar a revalidate() para actualizar el diseño del panel
                    panel.revalidate();
                }
            }
        });

        // Agregar los botones al panel
        panel.add(agregarBoton);
        panel.add(quitarBoton);

        // Agregar el panel al JFrame
        frame.add(panel);

        // Configurar el tamaño del JFrame y cerrar la aplicación cuando se cierra la ventana
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

	}

}
