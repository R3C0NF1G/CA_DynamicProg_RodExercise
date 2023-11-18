package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Menu;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame{
	
	private RodView rv;
	private MenuView mv;
	
	public MainView() {
		
		execute();
		
		getContentPane().setLayout(null);
		setTitle("CA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 450);
	//	getContentPane().setBackground(Color.gray);
	//	getContentPane().setBackground(Color.decode("#002B5B"));
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}

	private void execute() {
		
		rv = new RodView();
		rv.setBounds(0, 0, 550, 450);
		getContentPane().add(rv);
		
		mv = new MenuView();
		mv.setBounds(0, 0, 550, 450);
		getContentPane().add(mv);
		
	}

	public RodView getRv() {
		return rv;
	}

	public void setRv(RodView rv) {
		this.rv = rv;
	}

	public MenuView getMv() {
		return mv;
	}

	public void setMv(MenuView mv) {
		this.mv = mv;
	}
	
}
