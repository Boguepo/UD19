package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	
	public Visual() {
		//añadir titulo a la ventana
		setTitle("Welcome");
		
		//coordenads x e y junto con la altura y la longitud, si no se indica la ventana sera muy pequeña
		setBounds(0,0,588,479);
		
		//indica que cuando cerremos la ventana se cierra la app
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//hace visible la ventana
		setVisible(true);
		
		//inicializas el JPanel
		contentPane = new JPanel();
		
		//Indicamos su diseño
		contentPane.setLayout(null);
		
		//lo asignamos a la ventana
		setContentPane(contentPane);
		
		//creamos componente
		JLabel etiqueta = new JLabel("Hola, como te llamas?");
		
		//le indicamos la posicion donde va a estar
		etiqueta.setBounds(235,96,154,40);
		
		//lo añadimos al panel para que e muestre por pantalla
		contentPane.add(etiqueta);
		
		JTextField input = new JTextField();
		input.setBounds(235,160,101,20);
		
		JButton boton= new JButton("Saludar");
	
		boton.setBounds(235,243,101,29);
		contentPane.add(input);
		contentPane.add(boton);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saludos "+input.getText());
			}
		};
		
		boton.addActionListener(al);
		
	}

}
