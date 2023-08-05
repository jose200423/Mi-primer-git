package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelDatos pdatos;
	
	private PanelResultados presultados;
	
	public VentanaPrincipal() {
		setTitle("Primer calculadora");
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.red);
		getContentPane().setLayout(null);
		
		inicialozarComponentes();
		
		setResizable(false);//no permite modificar el tamaño de la ventana
	    setLocationRelativeTo(null);//lugar donde sale la ventana null en la mitad
	    setVisible(true);//lebol etiquetas informacion
	}
	
	
	public void inicialozarComponentes() {
		
		pdatos = new PanelDatos();
		pdatos.setBounds(25, 25, 550, 250);
		getContentPane().add(pdatos);
		
		presultados = new PanelResultados();
		presultados.setBounds(25, 300, 550, 250);
		getContentPane().add(presultados);
		
	}


	public PanelDatos getPdatos() {
		return pdatos;
	}


	public void setPdatos(PanelDatos pdatos) {
		this.pdatos = pdatos;
	}


	public PanelResultados getPresultados() {
		return presultados;
	}


	public void setPresultados(PanelResultados presultados) {
		this.presultados = presultados;
	}

}
