package JPanelBorder;
//Copiar codigo desde aqui
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
//Agregar el nombre de la clase o realizar una nueva clase con el nombre titleborderExample 
public class titleborderExample {
public static void main(String[] args) {
	//Creación de ventana principal
	JFrame frame = new JFrame();
	//Se especifica el tamaño de la ventana default
	frame.setSize(400, 400);
	//Se indica la visibilidad 
	frame.setVisible(true);
	//Se indica la posición central por default
	frame.setLocationRelativeTo(null);
	//Se propociona el cierre de la ventana 
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//Se crea en panel interno de la ventana
	JPanel panel =new JPanel();
	//Se especifica el tipo de borde color y grosor
	TitledBorder lineBorder = new TitledBorder("Titulo del borde");
	//Se adhieren elementos a ventana principal
	frame.add(panel);
	panel.setBorder(lineBorder);
	
}
	
}