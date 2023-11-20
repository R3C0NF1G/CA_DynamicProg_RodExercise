package co.edu.unbosque.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Solucion;
import co.edu.unbosque.view.MainView;

/**
 * Clase que actua como controlador en el patron de diseño MVC.
 * Implementa ActionListener para manejar eventos de interfaz grafica.
 *
 */
public class Controller implements ActionListener {
	
	private MainView gui;
	private Solucion solucion;
	
	/**
	 * Constructor de la clase Controller.
     * Inicializa las vistas y el objeto de solucion, y configura los listeners.
	 */
	public Controller() {
		
		gui = new MainView();
		solucion = new Solucion();
		setListeners();
		
	}
	
	/**
	 * Configura los listeners para los botones en las vistas.
	 */
	public void setListeners() {
		
		gui.getMv().getStart().addActionListener(this);
		gui.getMv().getExit().addActionListener(this);
		
		gui.getRv().getRun().addActionListener(this);
		gui.getRv().getBack().addActionListener(this);
		
	}
	
	/**
	 * Maneja los eventos de los botones en las vistas.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case"Iniciar":

			gui.getMv().setVisible(false);
			gui.getRv().setVisible(true);
			
			break;
			
		case "Salir":
			System.exit(0);
			break;
		
		case "Solucionar":
			
			try {
				
				int tamañoVarilla = Integer.parseInt(gui.getRv().getInpN().getText());
				
				String preciosNotParsed = gui.getRv().getInpMatrix().getText();
				String preciosSemiParsed = preciosNotParsed.replaceAll("\\s", "");

				//Creando el array de precios
				int[] preciosParsed = new int[preciosSemiParsed.length()];
				for(int i = 0; i < preciosSemiParsed.length(); i++) {
					preciosParsed[i] = Integer.parseInt(preciosSemiParsed.charAt(i) + "");
				}
				
				//Resolver el problema
				int maxValorPorPieza = solucion.resolverConMemorizacion(tamañoVarilla, preciosParsed);
				if(maxValorPorPieza == preciosParsed[tamañoVarilla - 1]) {
					gui.getRv().setSolucionLabelText("La solucion optima es no dividir la varilla");
				}else {
					gui.getRv().setSolucionLabelText("El valor maximo de venta por parte es " + maxValorPorPieza);
				}
				
			}catch(NumberFormatException ee) {
				gui.getRv().setInpN("");
				gui.getRv().setInpMatrix("");
				JOptionPane.showMessageDialog(null, "Ingrese valores válidos");
			}catch(NegativeArraySizeException ee) {
				gui.getRv().setInpN("");
				gui.getRv().setInpMatrix("");
				JOptionPane.showMessageDialog(null, "Ingrese valores válidos");
			}
			
			break;
		case "Volver":
			gui.getMv().setVisible(true);
			gui.getRv().setVisible(false);
			
			gui.getRv().setInpN("");
			gui.getRv().setInpMatrix("");
			gui.getRv().setSolucionLabelText("");
			
			break;
		default:
			break;
		}
	}

}
