package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Rectangulo;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RectanguloJPanel extends JPanel {
	private JTextField textFieldBase;
	private JTextField textFieldAltura;

	/**
	 * Create the panel.
	 */
	public RectanguloJPanel() {
		setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(39, 47, 81, 13);
		add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(39, 108, 68, 13);
		add(lblAltura);
		
		textFieldBase = new JTextField();
		textFieldBase.setBounds(150, 44, 96, 19);
		add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setBounds(150, 105, 96, 19);
		add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(39, 198, 329, 13);
		add(lblResultado);
		
		JButton btnCalcularArea = new JButton("Calcular \u00C1rea");
		btnCalcularArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. Recupero y convierto a double los valores 
				double base   = Double.parseDouble( textFieldBase.getText() );
				double altura = Double.parseDouble( textFieldAltura.getText() );
				// 2. instanciamos e invocamos a los métodos que hacen los cálculos 
				double area = (new Rectangulo(base, altura)).calcularArea();
				// 3. mostramos en pantalla el resultado 
				lblResultado.setText( String.format("El área es %.2f.", area) );
			}
		});
		btnCalcularArea.setBounds(35, 231, 127, 21);
		add(btnCalcularArea);
		
		JButton btnCalcularPerimetro = new JButton("Calcular Per\u00EDmetro");
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 1. Recupero y convierto a double los valores 
				double base   = Double.parseDouble( textFieldBase.getText() );
				double altura = Double.parseDouble( textFieldAltura.getText() );
				// 2. instanciamos e invocamos a los métodos que hacen los cálculos 
				double perimetro = (new Rectangulo(base, altura)).calcularPerimetro();
				// 3. mostramos en pantalla el resultado 
				lblResultado.setText( String.format("El perímetro es %.2f.", perimetro) );
			}
		});
		btnCalcularPerimetro.setBounds(222, 231, 146, 21);
		add(btnCalcularPerimetro);

	}

}
