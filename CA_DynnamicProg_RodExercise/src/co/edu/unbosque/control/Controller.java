package co.edu.unbosque.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MainView;
import co.edu.unbosque.view.RodView;

public class Controller implements ActionListener {
	
	private MainView gui;
	
	public Controller() {
		
		
		gui = new MainView();
		setListeners();
		
	}
	
	public void setListeners() {
		
		gui.getMv().getStart().addActionListener(this);
		gui.getMv().getAbout().addActionListener(this);
		gui.getMv().getExit().addActionListener(this);
		
		gui.getRv().getRun().addActionListener(this);
		gui.getRv().getBack().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case"INICIAR":

			gui.getMv().setVisible(false);
			gui.getRv().setVisible(true);
			
			break;

		default:
			break;
		}
	}

}
