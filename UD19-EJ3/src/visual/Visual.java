package visual;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Visual extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	public Visual() {
		// creacion de la ventana
				setTitle("Peliculas");
				setBounds(0, 0, 406, 453);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setVisible(true);
				// creacion del panel
				contentPane = new JPanel();
				contentPane.setLayout(null);
				setContentPane(contentPane);
				
				JLabel lblNewLabel = new JLabel("Sistema Operativo");
				lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel.setBounds(10, 10, 128, 13);
				contentPane.add(lblNewLabel);
				
				JRadioButton rbtn1 = new JRadioButton("Windows");
				rbtn1.setBounds(10, 42, 103, 21);
				contentPane.add(rbtn1);
				
				JRadioButton rbtn2 = new JRadioButton("Linux");
				rbtn2.setBounds(10, 65, 103, 21);
				contentPane.add(rbtn2);
				
				JRadioButton rbtn3 = new JRadioButton("Mac");
				rbtn3.setBounds(10, 88, 103, 21);
				contentPane.add(rbtn3);
				
				ButtonGroup bgroup = new ButtonGroup();
				bgroup.add(rbtn1);
				bgroup.add(rbtn2);
				bgroup.add(rbtn3);
				
				JLabel lblNewLabel_1 = new JLabel("Especialidad");
				lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_1.setBounds(254, 10, 103, 13);
				contentPane.add(lblNewLabel_1);
				
				JCheckBox ch1 = new JCheckBox("Programador");
				ch1.setBounds(254, 42, 93, 21);
				contentPane.add(ch1);
				
				JCheckBox ch2 = new JCheckBox("Dise\u00F1o Grafico");
				ch2.setBounds(254, 65, 93, 21);
				contentPane.add(ch2);
				
				JCheckBox ch3 = new JCheckBox("Administracion");
				ch3.setBounds(254, 88, 93, 21);
				contentPane.add(ch3);
				
				JSlider slider = new JSlider();
				slider.setMaximum(10);
				slider.setBounds(76, 197, 200, 22);
				contentPane.add(slider);
				
				JLabel lblNewLabel_2 = new JLabel("Horas dedicadas");
				lblNewLabel_2.setBounds(76, 152, 121, 13);
				contentPane.add(lblNewLabel_2);
				
				JLabel lblNewLabel_3 = new JLabel("0");
				lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_3.setBounds(57, 187, 45, 13);
				contentPane.add(lblNewLabel_3);
				
				JLabel lblNewLabel_4 = new JLabel("10");
				lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
				lblNewLabel_4.setBounds(246, 187, 45, 13);
				contentPane.add(lblNewLabel_4);
				// Boton y Listener
				JButton btnNewButton = new JButton("Mostrar");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String resultado = "";
						if(rbtn1.isSelected()) {
							resultado += "SO: "+rbtn1.getText()+"\n";
						}else if(rbtn2.isSelected()) {
							resultado += "SO: "+rbtn2.getText()+"\n";
						}else if(rbtn3.isSelected()) {
							resultado += "SO: "+rbtn3.getText()+"\n";
						}
						
						if(ch1.isSelected()) {
							resultado += "Especialidad: "+ch1.getText()+"\n";
						}
						if(ch2.isSelected()) {
							resultado += "Especialidad: "+ch2.getText()+"\n";
						}
						if(ch3.isSelected()) {
							resultado += "Especialidad: "+ch3.getText()+"\n";
						}
						
						resultado +="Horas: "+ slider.getValue()+"\n";
						
						JOptionPane.showMessageDialog(null, resultado);
					}
				});
				btnNewButton.setBounds(133, 292, 85, 21);
				contentPane.add(btnNewButton);
	}
}
