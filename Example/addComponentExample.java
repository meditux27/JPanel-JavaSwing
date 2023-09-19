package Example;
import javax.swing.JButton;
//Copiar codigo desde aqui
import javax.swing.JFrame;
import javax.swing.JPanel;

//Agregar el nombre de la clase o realizar una nueva clase con el nombre SetBeckground
public class addComponentExample {
	public static void main(String[] args) {
		//Creación de Jframe
		JFrame frame=new JFrame();
		//Determina el tamaño de JFrame
		frame.setSize(400,400);
		//Determina la posición inicial
		frame.setLocationRelativeTo(null);
		//Establece la visibilidad
		frame.setVisible(true);
		//Determina el comportamiento de cerrar la ventana 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creación de panel 
		JPanel panel = new JPanel();
		//Creación de botones 
        JButton button1 = new JButton("Botón 1");
        JButton button2 = new JButton("Botón 2");
        JButton button3 = new JButton("Botón 3");
        JButton button4 = new JButton("Botón 4");
        JButton button5 = new JButton("Botón 5");
        JButton button6 = new JButton("Botón 6");
        
        //Utilizando el metodo add para unir todos los componentes a JFrame
        
        //Agregando panel a frame
        frame.add(panel);
        //Agregando 
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
		
	}
}
