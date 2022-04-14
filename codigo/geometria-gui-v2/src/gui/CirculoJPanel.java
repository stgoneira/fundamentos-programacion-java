package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Circulo;
import modelo.Rectangulo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CirculoJPanel extends JPanel {
	private JTextField textFieldDiametro;

	/**
	 * Create the panel.
	 */
	public CirculoJPanel() {
		setLayout(null);
		
		JLabel lblDiametro = new JLabel("Di\u00E1metro");
		lblDiametro.setBounds(51, 50, 77, 13);
		add(lblDiametro);
		
		textFieldDiametro = new JTextField();
		textFieldDiametro.setBounds(154, 47, 147, 19);
		add(textFieldDiametro);
		textFieldDiametro.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(51, 211, 329, 13);
		add(lblResultado);
		
		JButton btnCalcularArea = new JButton("Calcular \u00C1rea");
		btnCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. Recupero y convierto a double los valores 
				double diametro = Double.parseDouble( textFieldDiametro.getText() );				
				// 2. instanciamos e invocamos a los métodos que hacen los cálculos 
				double area = (new Circulo(diametro)).calcularArea();
				// 3. mostramos en pantalla el resultado 
				lblResultado.setText( String.format("El área es %.2f.", area) );
			}
		});
		btnCalcularArea.setBounds(51, 256, 120, 21);
		add(btnCalcularArea);
		
		JButton btnCalcularPerimetro = new JButton("Calcular Per\u00EDmetro");
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. Recupero y convierto a double los valores 
				double diametro = Double.parseDouble( textFieldDiametro.getText() );				
				// 2. instanciamos e invocamos a los métodos que hacen los cálculos 
				double perimetro = (new Circulo(diametro)).calcularPerimetro();
				// 3. mostramos en pantalla el resultado 
				lblResultado.setText( String.format("El perímetro es %.2f.", perimetro) );
			}
		});
		btnCalcularPerimetro.setBounds(200, 256, 126, 21);
		add(btnCalcularPerimetro);

	}

}
