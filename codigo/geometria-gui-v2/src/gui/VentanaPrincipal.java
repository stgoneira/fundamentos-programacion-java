package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal();
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
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 402);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		JMenuItem menuItemSalir = new JMenuItem("SALIR");
		menuArchivo.add(menuItemSalir);
		menuItemSalir.addActionListener( evento -> System.exit(0) );
		
		JMenu menuCalculos = new JMenu("C\u00E1lculos");
		menuBar.add(menuCalculos);
		
		JMenuItem menuItemRectangulo = new JMenuItem("Rect\u00E1ngulo");
		menuCalculos.add(menuItemRectangulo);		
		// implementación anónima de ActionListener 
		menuItemRectangulo.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane = new RectanguloJPanel();				
				setContentPane(contentPane);
				contentPane.updateUI();
			}
		});
		
		JMenuItem menuItemCirculo = new JMenuItem("C\u00EDrculo");
		menuCalculos.add(menuItemCirculo);	
		// Lambda 
		menuItemCirculo.addActionListener( evento -> {
			contentPane = new CirculoJPanel();				
			setContentPane(contentPane);
			contentPane.updateUI();
		});
				
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
