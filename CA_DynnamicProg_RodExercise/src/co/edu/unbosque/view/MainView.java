package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MainView extends JFrame{
	
	private JLabel title;
	
	private JLabel subTitle;
	
	private JButton start;
	
	private JButton about;
	
	private JButton exit;
	
	public MainView() {
		
		execute();
		
		getContentPane().setLayout(null);
		setTitle("CA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 450);
		getContentPane().setBackground(Color.gray);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}

	private void execute() {
		// TODO Auto-generated method stub
		
		title = new JLabel("Complejidad Algorítmica");
		title.setFont(new Font("Cooper black", Font.BOLD, 20));
		title.setForeground(Color.BLACK);
		title.setBounds(140, 20, 300, 30);
		getContentPane().add(title);
		
		subTitle = new JLabel("Ejercicio: Corte Óptimo De Varillas");
		subTitle.setFont(new Font("Cooper black", Font.BOLD, 15));
		subTitle.setForeground(Color.BLACK);
		subTitle.setBounds(140, 100, 300, 30);
		getContentPane().add(subTitle);
		
		start = new JButton("INICIAR");
		start.setBackground(Color.BLACK);
		start.setForeground(Color.WHITE);
		start.setBounds(200, 200, 150, 30);
		getContentPane().add(start);
		
		about = new JButton("ACERCA DE");
		about.setBackground(Color.BLACK);
		about.setForeground(Color.WHITE);
		about.setBounds(200, 250, 150, 30);
		getContentPane().add(about);
		
		exit = new JButton("SALIR");
		exit.setBackground(Color.BLACK);
		exit.setForeground(Color.WHITE);
		exit.setBounds(200, 300, 150, 30);
		getContentPane().add(exit);
		
	}

	public JButton getStart() {
		return start;
	}

	public void setStart(JButton start) {
		this.start = start;
	}

	public JButton getAbout() {
		return about;
	}

	public void setAbout(JButton about) {
		this.about = about;
	}

	public JButton getExit() {
		return exit;
	}

	public void setExit(JButton exit) {
		this.exit = exit;
	}
	
}
