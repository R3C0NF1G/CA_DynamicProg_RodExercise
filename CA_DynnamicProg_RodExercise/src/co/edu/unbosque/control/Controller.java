package co.edu.unbosque.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.view.MainView;
import co.edu.unbosque.view.RodView;

public class Controller implements ActionListener {
	
	MainView gui;
	RodView nextGui;
	
	public Controller() {
		
		gui = new MainView();
		nextGui = new RodView();
		
	}
	
	public void setListeners() {
		
		gui.getStart().addActionListener(this);
		gui.getAbout().addActionListener(this);
		gui.getExit().addActionListener(this);
		
		nextGui.getRun().addActionListener(this);
		nextGui.getBack().addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		
		case"INICIAR":
			
			gui.setVisible(false);
			nextGui.setVisible(true);
			
			break;

		default:
			break;
		}
	}

}
