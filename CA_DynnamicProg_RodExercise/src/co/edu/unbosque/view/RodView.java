package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RodView extends JPanel{
	
	private JLabel labInpN;
	private JLabel labInpMatrix;
	private JTextField inpN;
	private JTextArea inpMatrix;
	private JButton run;
	private JButton back;
	
	public RodView() {
		
		setLayout(null);
		setBackground(Color.GRAY);
		execute();
		setVisible(false);
		
	}

	private void execute() {
		
		labInpN = new JLabel("Introduzca el valor de n: ");
		labInpN.setFont(new Font("Arial", Font.ITALIC, 15));
		labInpN.setForeground(Color.BLACK);
		labInpN.setBounds(50, 50, 300, 30);
		add(labInpN);
		
		labInpMatrix = new JLabel("Introduzca la matriz de precios: ");
		labInpMatrix.setFont(new Font("Arial", Font.ITALIC, 15));
		labInpMatrix.setForeground(Color.BLACK);
		labInpMatrix.setBounds(50, 100, 300, 30);
		add(labInpMatrix);
		
		inpN = new JTextField("");
		inpN.setBounds(300, 50, 100, 30);
		add(inpN);
		
		inpMatrix = new JTextArea("");
		inpMatrix.setBounds(300, 100, 150, 150);
		add(inpMatrix);
		
		run = new JButton("►");
		run.setBackground(Color.BLACK);
		run.setForeground(Color.WHITE);
		run.setBounds(200, 300, 150, 30);
		add(run);
		
		back = new JButton("←");
		back.setBackground(Color.BLACK);
		back.setForeground(Color.WHITE);
		back.setBounds(200, 350, 150, 30);
		add(back);
		
	}

	public JTextField getInpN() {
		return inpN;
	}

	public void setInpN(JTextField inpN) {
		this.inpN = inpN;
	}

	public JTextArea getInpMatrix() {
		return inpMatrix;
	}

	public void setInpMatrix(JTextArea inpMatrix) {
		this.inpMatrix = inpMatrix;
	}

	public JButton getRun() {
		return run;
	}

	public void setRun(JButton run) {
		this.run = run;
	}

	public JButton getBack() {
		return back;
	}

	public void setBack(JButton back) {
		this.back = back;
	}
	
} 