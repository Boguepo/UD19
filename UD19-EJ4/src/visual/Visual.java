package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;



import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visual extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField num1;
	private JTextField num2;

	public Visual() {
		// creacion de la ventana
		setTitle("Peliculas");
		setBounds(0, 0, 400, 306);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		// creacion del panel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Numero 1:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 43, 97, 13);
		contentPane.add(lblNewLabel);
		
		num1 = new JTextField();
		num1.setBounds(10, 66, 102, 19);
		contentPane.add(num1);
		num1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Numero 2:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(265, 43, 97, 13);
		contentPane.add(lblNewLabel_1);
		
		num2 = new JTextField();
		num2.setBounds(266, 66, 96, 19);
		contentPane.add(num2);
		num2.setColumns(10);
		
		
		
		JLabel result = new JLabel("");
		result.setHorizontalAlignment(SwingConstants.CENTER);
		result.setBounds(132, 138, 88, 45);
		contentPane.add(result);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
			}
		});
		btnNewButton.setBounds(22, 206, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("About");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(null, "Aplicacion creada por: Toni Arjona");
			}
		});
		btnNewButton_1.setBounds(266, 206, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btn_suma = new JButton("+");
		btn_suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		
				result.setText(Integer.toString(Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText())));
			}
		});
		btn_suma.setBounds(122, 50, 58, 21);
		contentPane.add(btn_suma);
		
		JButton btn_resta = new JButton("-");
		btn_resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result.setText(Integer.toString(Integer.parseInt(num1.getText()) - Integer.parseInt(num2.getText())));
			}
		});
		btn_resta.setBounds(197, 50, 58, 21);
		contentPane.add(btn_resta);
		
		JButton btn_multiplicacion = new JButton("x");
		btn_multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				result.setText(Integer.toString(Integer.parseInt(num1.getText()) * Integer.parseInt(num2.getText())));
			}
		});
		btn_multiplicacion.setBounds(122, 81, 58, 21);
		contentPane.add(btn_multiplicacion);
		
		JButton btn_division = new JButton("/");
		btn_division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				result.setText(Integer.toString(Integer.parseInt(num1.getText()) / Integer.parseInt(num2.getText())));
			}
		});
		btn_division.setBounds(198, 81, 58, 21);
		contentPane.add(btn_division);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(132, 120, 88, 13);
		contentPane.add(lblNewLabel_2);
	}
}
