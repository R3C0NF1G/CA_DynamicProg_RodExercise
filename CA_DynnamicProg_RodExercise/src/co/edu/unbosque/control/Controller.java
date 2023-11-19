package co.edu.unbosque.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.edu.unbosque.model.Solucion;
import co.edu.unbosque.view.MainView;
import co.edu.unbosque.view.RodView;

public class Controller implements ActionListener {
	
	private MainView gui;
	private Solucion solucion;
	
	public Controller() {
		
		
		gui = new MainView();
		solucion = new Solucion();
		setListeners();
		
	}
	
	public void setListeners() {
		
		gui.getMv().getStart().addActionListener(this);
		gui.getMv().getAbout().addActionListener(this);
		gui.getMv().getExit().addActionListener(this);
		
		gui.getRv().getRun().addActionListener(this);
		gui.getRv().getRun().setActionCommand("Solucionar");
		gui.getRv().getBack().addActionListener(this);
		gui.getRv().getBack().setActionCommand("Volver");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case"INICIAR":

			gui.getMv().setVisible(false);
			gui.getRv().setVisible(true);
			
			break;
		
		case "Solucionar":
			int tamañoVarilla = Integer.parseInt(gui.getRv().getInpN().getText());
			
			String preciosNotParsed = gui.getRv().getInpMatrix().getText();
			String preciosSemiParsed = preciosNotParsed.replaceAll("\\s", "");
			//System.out.println(preciosSemiParsed);
			//Creando el array de precios
			int[] preciosParsed = new int[preciosSemiParsed.length()];
			for(int i = 0; i < preciosSemiParsed.length(); i++) {
				preciosParsed[i] = Integer.parseInt(preciosSemiParsed.charAt(i) + "");
			}
			//System.out.println(Arrays.toString(preciosParsed));
			
			//Resolver el problema
			int maxValorPorPieza = solucion.resolver(tamañoVarilla, preciosParsed);
			//System.out.println(maxValorPorPieza);
			System.out.println(preciosParsed[tamañoVarilla - 1]);
			if(maxValorPorPieza == preciosParsed[tamañoVarilla - 1]) {
				gui.getRv().setSolucionLabelText("La solucion optima es no dividir la varilla");
			}else {
				gui.getRv().setSolucionLabelText("El valor maximo de venta por parte es " + maxValorPorPieza);
			}
			
			break;
		case "Volver":
			gui.getMv().setVisible(true);
			gui.getRv().setVisible(false);
			
			gui.getRv().setInpN("");
			gui.getRv().setInpMatrix("");
			
			break;
		default:
			break;
		}
	}

}
