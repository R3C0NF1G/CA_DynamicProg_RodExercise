package co.edu.unbosque.view;

import javax.swing.JFrame;

/**
 * Clase que representa la vista principal de la aplicacion.
 * Extiende JFrame y contiene las vistas RodView y MenuView. 
 *
 */
public class MainView extends JFrame{
	
	private RodView rv;
	private MenuView mv;
	
	/**
	 * Constructor de la clase MainView.
     * Configura la interfaz grafica y establece las propiedades iniciales.
	 */
	public MainView() {
		
		execute();
		
		getContentPane().setLayout(null);
		setTitle("CA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(550, 450);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		
	}

	/**
	 * Configura las vistas RodView y MenuView dentro de la interfaz grafica.
	 */
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
