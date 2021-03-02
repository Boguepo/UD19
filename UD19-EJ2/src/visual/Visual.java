package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3349689115913768419L;
	/**
	 * 
	 */

	private JPanel contentPane;
	private JTextField newPeli;

	public Visual(ArrayList<String> pelis) {
		pelis.add("Frozen");
		pelis.add("Los Increibles");
		pelis.add("Terminator");
		// creacion de la ventana
		setTitle("Peliculas");
		setBounds(0, 0, 624, 285);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// creacion del panel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		// creacion de la etiqueta
		JLabel etq1 = new JLabel("Escribe el titulo de una pelicula");
		etq1.setBounds(104, 64, 172, 37);
		contentPane.add(etq1);
		// creacion del cuadro de texto
		newPeli = new JTextField();
		newPeli.setBounds(104, 92, 138, 21);
		contentPane.add(newPeli);
		// creacion del boton
		JButton btnAdd = new JButton("A\u00F1adir");
		btnAdd.setBounds(128, 123, 85, 21);
		contentPane.add(btnAdd);
		// creacion de etiqueta 2
		JLabel etq2 = new JLabel("Peliculas");
		etq2.setBounds(391, 76, 107, 13);
		contentPane.add(etq2);
		// creacion del comboBox con las pelis
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(367, 102, 97, 21);
		contentPane.add(comboBox);
		for (int i = 0; i < pelis.size(); i++) {
			comboBox.addItem(pelis.get(i));
			repaint();
		}

		// creacion de los Listeners
		ActionListener al = new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				addPeli(newPeli.getText(), comboBox, pelis);
				//seteamos el valor del texto
				newPeli.setText("");
				//volvemos 
				newPeli.requestFocus();

			}

		};
		// añadimos el evento al boton
		btnAdd.addActionListener(al);
	}

	private void addPeli(String text, JComboBox<String> cb, ArrayList<String> pelis) {
		cb.addItem(text);
		pelis.add(text);
		

	}
}
