# JPanel - JavaSwing

### <img src="https://linuxhint.com/wp-content/uploads/2023/08/What-is-Java-Swing-JPanel-with-Examples.jpg" title="" alt="Jpanel" width="401">

#### JPanel es un contenedor ligero que se utiliza para organizar y agrupar componentes gráficos, como botones, etiquetas, cuadros de texto, etc., en una ventana o marco de aplicación. Puedes pensar en un JPanel como un lienzo en el que puedes colocar otros componentes para organizarlos y controlar su disposición en la interfaz de usuario.

____

:book: **Las características más importantes de un `JPanel` en Swing son las siguientes:**

1. **Contenedor Ligero**: Un `JPanel` es un contenedor ligero, lo que significa que se utiliza principalmente para organizar y contener otros componentes, pero no tiene una apariencia visual propia. Es un componente transparente que se utiliza para estructurar y organizar la interfaz de usuario.

2. **Personalización**: Puedes personalizar la apariencia y el comportamiento de un `JPanel` estableciendo propiedades como el color de fondo, el gestor de diseño (layout manager) y el borde. Esto te permite diseñar y organizar componentes de acuerdo con tus necesidades.

3. **Layout Managers**: Puedes utilizar gestores de diseño (`LayoutManager`) con un `JPanel` para controlar cómo se colocan y dimensionan los componentes dentro de él. Algunos de los gestores de diseño comunes incluyen `FlowLayout`, `BorderLayout`, `GridLayout`, entre otros.

4. **Eventos y Componentes**: Puedes agregar controladores de eventos a los componentes dentro de un `JPanel` para manejar interacciones del usuario, como clics de botón o entrada de texto. Además, puedes agregar una variedad de componentes diferentes al `JPanel` para crear interfaces de usuario complejas.

5. **Uso en Jerarquía de Componentes**: Los `JPanel` se utilizan comúnmente en combinación con otros contenedores como `JFrame`, `JDialog` y `JScrollPane` para crear la estructura de la interfaz de usuario en aplicaciones Swing.

Algunos de los métodos más comunes de la clase `JPanel` en Java Swing, que se utilizan con frecuencia para configurar y trabajar son los siguientes:

---

:clipboard: **Pasos para implementar JPanel**

1. **Importa las clases necesarias**:

Asegúrate de importar las clases necesarias de Swing en tu archivo Java para trabajar con `JPanel`.

```java
import javax.swing.JFrame;
import javax.swing.JPanel;
```

2. **Crea un JFrame:**

Debes tener un `JFrame` que sirva como el contenedor principal de tu aplicación.

```java
JFrame frame = new JFrame("Ejemplo JPanel");
frame.setSize(400, 400);
```

3. **Crea un JPanel y agrega componentes:**

Crea un `JPanel` y agrega los componentes que desees mostrar dentro de él. Puedes usar métodos como `add()` para agregar componentes al `JPanel`.

```java
JPanel panel = new JPanel();
panel.add(new JLabel("Etiqueta 1"));
// Agrega más componentes según tus necesidades
```

4. **Agrega el JPanel al JFrame:**

Una vez que hayas agregado los componentes al `JPanel`, agrega el `JPanel` al `JFrame` para que los componentes sean visibles en la ventana.

```java
frame.add(panel);
```

5. **Haz visible el JFrame:**

Finalmente, asegúrate de hacer visible el `JFrame` para que puedas ver el `JPanel` y los componentes que contiene.

```java
frame.setVisible(true);
```

:coffee:[Estructura basica](https://github.com/meditux27/JPanel-JavaSwing/blob/main/estructuraBasica/EjemploJPanel.java)

____

> :beginner:**add(Component comp)**

- Descripción

Agrega un componente al panel, ya sea un botón, un label , etc..

- Sintaxis

```java
panel.add(button);
```

- Nota

Para el uso del metodo add() es necesario que los commponentes ya esten creados o instanciados, posteriormente se indica la adición mediante el comando `add();`

<sub> Crear un JPanel</sub>  
`JPanel panel = new JPanel();`

<sub>Crear un botón </sub>  
`JButton button = new JButton("¡Haz clic!");`

<sub>Agregar el botón al JPanel </sub>  
`panel.add(button);`

- Ejemplo:coffee:

[add](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/addComponentExample.java)

---

> :beginner:**setBackground()**

- Descripción

Establece el color de fondo del panel.

* Sintaxis  

```java
panel.setBackground(Color.LIGHT_GRAY) ;
```

* Nota

Puedes reemplazar Color.LIGHT_GRAY con cualquier otro color de la clase Color, como Color.RED, Color.BLUE, Color.GREEN, o puedes crear tus propios colores personalizados usando los valores RGB.  

* Ejemplo:coffee:

[setBackground ](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/SetBackground.java)

---

> :beginner: **setLayout()**

* Descripción

Establece el administrador de diseño del panel para controlar la disposición de los componentes anexados al panel, entre los mas utilizados son :   `FlowLayout|GridLayout|BorderLayout`

1. **FlowLayout**

_Organiza los componentes en una fila horizontal o vertical, ajustándolos automáticamente a medida que se agregan. Es útil para diseños simples de una fila o una columna de componentes._

2. **BorderLayout**

*Divide el contenedor en cinco áreas: norte, sur, este, oeste y centro. Cada área puede contener un solo componente, y los componentes se expanden para llenar su área asignada.*

3. **GridLayout**

*Organiza los componentes en una cuadrícula de filas y columnas de tamaño fijo. Todos los componentes en un GridLayout tienen el mismo tamaño.*

* Sintaxis

Se puede utilizar de 2 maneras

1. Creando la instancia de layout manager y asignando el nombre de la variable donde se guardo la instancia  

```java
GridLayout diseno = new GridLayout(3, 3);
panel.setLayout(diseno);
```

2. Agregando directamente al panel mediante la instancia  

```java
JPanel panel = new JPanel(new GridLayout(2, 3));
```

* Ejemplos:coffee:

[FlowLayout](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelLayoutManager/FlowLayoutExample.java)

[BorderLayout](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelLayoutManager/BorderLayoutExample.java)

[GridLayout](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelLayoutManager/GridLayoutExample.java)

---

> :beginner:**remove()**

* Descripción

Elimina un componente del panel.  

* Sintaxis  

```java
panel.remove(button);
```

* Nota
  
  Se debe tener creado el componentes para despues ser eliminado  
  <sub>Crear un JPanel </sub>  
  `JPanel panel = new JPanel();  `
  
  <sub> Crear un botón</sub>  
  `JButton button = new JButton("¡Haz clic!");  `
  
  <sub> Agregar el botón al JPanel</sub>  
  `panel.remove(button); ` 

* Ejemplo:coffee:

[remove ]( https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/JPanelRemoveExample.java)

---

> :beginner: **removeAll()**

* Descripción

Elimina todos los componentes del panel, dejando el panel en blanco  

* Sintaxis  

```java
panel.removeAll();
```

* Nota

Al utilizar el metodo remove all, elimina todos los componentes, mas no actualiza el panel o refresca dicho panel, por lo tanto para ver los cambios se utiliza el apoyo de los metodos  

<sub> Actualizar la disposición del panel </sub>

`panel.revalidate();  `

<sub> Volver a pintar el panel</sub>

`panel.repaint(); `

* Ejemplo:coffee:

[removeAll](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/JPanelRemoveAllExample.java)

---

> :beginner:**SetBorder()**

* Descripción

Establece el borde del panel.  

se utiliza para establecer el borde de un componente gráfico, como un JPanel, un JButton, un JLabel u otros componentes.  

* Sintaxis  

```java
comp.setBorder(bord);
```

* Nota

Donde "componente"  es el nombre del componente al que deseas agregar el borde y "bord"  es el objeto que implementa la interfaz javax.swing.border.Border.  

Se pude implementar 3 tipos de bordes  

1. **LINEBORDER**

_Este crea un borde alrededor del componente y se puede indicar el grosor_ 

<sub>Crea un borde de línea roja con grosor de 2 píxeles </sub>

```java
LineBorder lineBorder = new LineBorder(Color.RED, 2);
```

<sub> Establecer el borde en el panel  </sub>

```java
panel.setBorder(lineBorder);
```

:twisted_rightwards_arrows:2da sintaxis...  

```java
Border lineBorder = BorderFactory.createLineBorder(Color.red,3); 
panel.setBorder(lineBorder);
```

2. **TITLEDBORDER**

Este borde agrega un título y una línea visible alrededor del componente.

<sub> Crear un borde de línea roja con grosor de 2 píxeles  </sub>

```java
TitledBorder lineBorder = new TitledBorder("Titulo del borde");
```

<sub> Establecer el borde en el panel  </sub>

```java
panel.setBorder(lineBorder);
```

:twisted_rightwards_arrows:2da sintaxis  

```java
Border titledBorder = BorderFactory.createTitledBorder("Borde con Título");
panel.setBorder(titledBorder);
```

3. **EMPTYBORDER**

Se utiliza para crear un borde vacío alrededor de un componente gráfico.
Este borde agrega un espacio en blanco alrededor del componente, lo que permite separar visualmente el componente de su entorno.

```java
EmptyBorder emptyBorder = new EmptyBorder(int top, int left, int bottom, int right);
```

Donde top, left, bottom y right son valores enteros que representan el tamaño del espacio en blanco en la parte superior, izquierda, inferior y derecha del componente, respectivamente.

```java
EmptyBorder emptyBorder=new EmptyBorder(6,7,8,6);
```

<sub>Establecer el borde en el panel </sub>

```java
panel.setBorder(emptyBorder);
```

:twisted_rightwards_arrows:2da sintaxis  

```java
Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);` `panel.setBorder(emptyBorder);
```

* Ejemplo:coffee:

[LineBorder](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelBorder/lineborderExample.java)

[LineBorder 2da sintaxis](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelBorder/lineborderExample2.java)

[TitledBorder](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelBorder/titleborderExample.java)

[TitledBorder 2da sintaxis](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelBorder/titleborderExample2.java)

[EmptyBorder](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelBorder/emptyborderExample.java)

[EmptyBorder 2da sintaxis](https://github.com/meditux27/JPanel-JavaSwing/blob/main/JPanelBorder/emptyborderExample2.java)

---

> :beginner:**setPreferredSize()** 

* Descripción

Establece el tamaño preferido del panel.  

* Sintaxis  

```java
componentes.setPreferredSize(new Dimension(ancho, alto));
```

* Nota

Este método permite indicar al sistema de diseño y el cómo debería ajustar el tamaño de un componente dentro de un contenedor.

Donde "componentes"  es el componente gráfico al que deseas establecer el tamaño preferido, ancho y alto son los valores enteros que representan respectivamente.  

Es importante mencionar que setPreferredSize() establece una sugerencia para el tamaño preferido del componente, pero no garantiza que el componente se represente exactamente con ese tamaño. El sistema de diseño de Swing puede ajustar el tamaño real del componente según otros factores, como las restricciones del diseño y el espacio disponible en el contenedor.  

* Ejemplo:coffee:

[setPreferredSize](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetPreferredSizeExample.java)

____

> :beginner:**setVisible()**

* Descripción

Establece la visibilidad del panel.  

* Sintaxis  

```java
componente.setVisible(boolean visible);
```

* Nota

El método `setVisible(true)` es esencial para mostrar cualquier ventana o componente en una aplicación Swing, ya que inicialmente, las ventanas se crean invisibles y necesitas llamar a este método para mostrarlas en la pantalla.

* Ejemplo:coffee:

[setVisible](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/SetVisibleExample.java)

____

> :beginner:**repaint()** 

* Descripción

Vuelve a pintar el panel y sus componentes.  

* Sintaxis  

```java
componente.repaint();
```

* Nota

Cuando llamas al método repaint() en un componente, estás indicando al sistema de representación que debe actualizar el contenido visual del componente en la interfaz gráfica.

Donde componente es el componente gráfico al que deseas solicitar que se vuelva a pintar.  

* Ejemplo:coffee:

[repaint](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/RepaintExample.java)

____ 

> :beginner:**revalidate()**

* Descripción

Indica al panel que vuelva a validar su diseño y sus componentes.  

* Sintaxis  

```java
componente.revalidate();
```

* Nota

Este método es especialmente útil después de realizar cambios en la estructura o en los componentes contenidos en un contenedor, ya que asegura que el sistema de diseño recalcule y aplique correctamente las disposiciones de los componentes.

Donde componente es el componente gráfico al que deseas aplicar la recalculación del diseño.

* Ejemplo:coffee:

[revalidate](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/RevalidateExample.java)

____

> :beginner:**getComponent()** 

* Descripción

Devuelve el componente en la posición especificada.  

* Sintaxis  

```java
 Component componente = panel.getComponent(1);
```

* Nota

Se utiliza para obtener el componente en una posición específica dentro de un contenedor. Esto es útil cuando necesitas interactuar con un componente específico contenido en otro contenedor, con la finalidad de modificar su comportamiento

`Component componente = contenedor.getComponent(int indice);`

Donde "contenedor"  es el contenedor en el que deseas buscar el componente e "indice"  es la posición del componente dentro del contenedor. El índice comienza desde 0 para el primer componente, 1 para el segundo componente y así sucesivamente.  

* Ejemplo:coffee:

[getComponent](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetComponentExample.java)

____

> :beginner:**getComponents()**

* Descripción

Devuelve un arreglo de los componentes contenidos en el panel.  

se utiliza para obtener un arreglo de todos los componentes contenidos en un contenedor. Esto es útil cuando deseas acceder y trabajar con varios componentes dentro de un contenedor  

* Sintaxis  

```java
Component[] componentes = contenedor.getComponents();
```

* Nota

Donde "contenedor"  es el contenedor del que deseas obtener los componentes y "componentes"  es un arreglo de objetos Component que tiene todos los componentes dentro del contenedor.  

* Ejemplo:coffee:

[getComponents](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetComponentsExample.java)

____

> :beginner:**getBackground()**

* Descripción

Devuelve el color de fondo del panel.  

* Sintaxis  

```java
Color colorFondo = comp.getBackground();
```

* Nota

Se utiliza para obtener el color de fondo de un componente gráfico, como un JPanel, un JButton, un JLabel, etc.

Donde "comp"  es el componente del cual deseas obtener el color de fondo  y "colorFondo"  es un objeto de la clase java.awt.Color que representa el color de fondo actual del componente.  

Al momento de imprimir el resultado da como resultado el codigo RGB  
Color de fondo: javax.swing.plaf.ColorUIResource[r=238,g=238,b=238]  

* Ejemplo:coffee:

[getBackground](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetBackgroundExample.java)

____

> :beginner:**getLayout()**

* Descripción

Devuelve el administrador de diseño del panel.  

* Sintaxis  

```java
LayoutManager administrador = conten.getLayout();
```

* Nota

Donde `conten`  es el contenedor del cual deseas obtener el administrador de diseño actual y `administrador` en un nombre de una varianble que representa una instancia de una clase que implementa la interfaz java.awt.LayoutManager.

El administrador de diseño es responsable de organizar y posicionar los componentes dentro del contenedor.

* Ejemplo:coffee:

[getLayout](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetLayoutExample.java)

____

> :beginner:**getPreferredSize()**

* Descripción

Devuelve el tamaño del panel seleccionado  

* Sintaxis  

```java
Dimension dimensionPreferida = componente.getPreferredSize();
```

* Nota

Se utiliza en Java Swing para obtener la dimensión preferida de un componente gráfico. La dimensión preferida es el tamaño que el componente preferiría tener si se le permite expandirse o contraerse según las restricciones de diseño y el espacio disponible en el contenedor.

Donde `componente` es el componente del cual deseas obtener la dimensión preferida, y `dimensionPreferida` es una instancia de la clase java.awt.Dimension que representa el ancho y el alto preferidos del componente.  

Al momento de imprimir da una medida preferida del manejador de componentes mas no es la medida exacta del tamaño del componente  

* Ejemplo:coffee:

[getPreferredSize](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetPreferredSizeExample.java)

____

> :beginner:**getSize()**

* Descripción

Devuelve el tamaño actual del panel.  

* Sintaxis  

```java
Dimension dimension = componente.getSize();
```

* Nota

Se utiliza en Java Swing para obtener la dimensión actual de un componente gráfico, como un JFrame, un JPanel, un JButton, etc. La dimensión se refiere al ancho y al alto del componente.

Donde `componente` es el componente del cual deseas obtener la dimensión actual y `dimension` es una instancia de la clase java.awt.Dimension que representa el ancho y el alto del componente.  

* Ejemplo:coffee:

[getSize](https://github.com/meditux27/JPanel-JavaSwing/blob/main/Example/GetSizeExample.java)
