package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Rectangulo;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGui extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldBase;
	private JTextField textFieldAltura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGui frame = new MainGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainGui() {
		setTitle("Rect\u00E1ngulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBase = new JLabel("Base");
		lblBase.setBounds(41, 52, 45, 13);
		contentPane.add(lblBase);
		
		JLabel lblAltura = new JLabel("Altura");
		lblAltura.setBounds(41, 123, 45, 13);
		contentPane.add(lblAltura);
		
		textFieldBase = new JTextField();
		textFieldBase.setToolTipText("La base del rect\u00E1ngulo");
		textFieldBase.setBounds(119, 49, 96, 19);
		contentPane.add(textFieldBase);
		textFieldBase.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.setToolTipText("La altura del rect\u00E1ngulo");
		textFieldAltura.setBounds(119, 120, 96, 19);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JButton btnCalculoArea = new JButton("Calcular \u00C1rea");
		btnCalculoArea.setBounds(41, 218, 154, 21);
		contentPane.add(btnCalculoArea);
		
		JLabel lblResultado = new JLabel("");
		lblResultado.setBounds(41, 195, 320, 13);
		contentPane.add(lblResultado);
		
		JButton btnCalcularPerimetro = new JButton("Calcular Per\u00EDmetro");
		btnCalcularPerimetro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double base = Double.parseDouble( textFieldBase.getText() );
				double altura = Double.parseDouble( textFieldAltura.getText() );			
				// 3. generar instancia de Rectangulo y calcular 
				Rectangulo rectangulo = new Rectangulo(base, altura);
				double perimetro = rectangulo.calcularPerimetro();
				// 4. mostrar en pantalla 
				lblResultado.setText( String.format("El perímetro es %.2f.", perimetro) );
			}
		});
		btnCalcularPerimetro.setBounds(224, 218, 171, 21);
		contentPane.add(btnCalcularPerimetro);
		
		btnCalculoArea.addActionListener( evento -> {
			// 1. recuperar base y la altura desde los JTextField
			// 2. convertir base y altura a double 
			double base = Double.parseDouble( textFieldBase.getText() );
			double altura = Double.parseDouble( textFieldAltura.getText() );			
			// 3. generar instancia de Rectangulo y calcular 
			Rectangulo rectangulo = new Rectangulo(base, altura);
			double area = rectangulo.calcularArea();
			// 4. mostrar en pantalla 
			lblResultado.setText( String.format("El área es %.2f.", area) );
		});
		
		
	}
}
