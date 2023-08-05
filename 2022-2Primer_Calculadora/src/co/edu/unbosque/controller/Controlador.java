package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.Numero;
import co.edu.unbosque.view.VentanaPrincipal;
import co.edu.unbosque.view.Vistamensaje;

public class Controlador implements ActionListener {

	private VentanaPrincipal vista;

	public Controlador() {
		vista = new VentanaPrincipal();
		asignarOyentes();

	}
//invocar oyentes y escucha 
	public void asignarOyentes() {
		vista.getPdatos().getBsumar().addActionListener(this);
		vista.getPdatos().getBrestar().addActionListener(this);
		vista.getPdatos().getBmulti().addActionListener(this);
		vista.getPdatos().getBdivi().addActionListener(this);
		vista.getPdatos().getPote().addActionListener(this);
		vista.getPdatos().getRaiz().addActionListener(this);
		vista.getPdatos().getModulo().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
//sysou siempres
		
		if(comando.equals("SUMAR")) {
			operacionSumar();
		}else if(comando.equals("RESTAR")) {
			operacionrestar();	
		}
		if(comando.equals("MULTIPLICAR")) {
			operacionmultiplicar();
		}
		if(comando.equals("DIVIDIR")) {
			operaciondividir();
		}
		if(comando.equals("POTENCIA")) {
			operacionpotencia();
		}
		if(comando.equals("RAIZ")) {
			operacionraiz();
		}
		if(comando.equals("MODULO")) {
			operacionmodulo();
		}
		
	}

	public void operacionSumar() {
		
		String aux = "";
		aux = vista.getPdatos().getCnum1().getText();
		Numero a = new Numero();
		a.setTexto(aux);
		vista.getPresultados().getEresult().setText("La suma de los numeros ingresados es " + a.codificar() );
	}
	
	public void operacionrestar() {
		   String aux = "";
		   double aux2 = 0.0;
			aux = vista.getPdatos().getCnum1().getText();
		    aux2 = Double.parseDouble(aux);
			Numero a = new Numero();
			a.setN(aux2);
			
			aux = vista.getPdatos().getCnum2().getText();
		    aux2 = Double.parseDouble(aux);
			Numero b = new Numero();
			b.setN(aux2);
			
			vista.getPresultados().getEresult().setText("La resta de los numeros ingresados es " + a.restar(b));
		}
	
	public void operacionmultiplicar() {
		   String aux = "";
		   double aux2 = 0.0;
			aux = vista.getPdatos().getCnum1().getText();
		    aux2 = Double.parseDouble(aux);
			Numero a = new Numero();
			a.setN(aux2);
			
			aux = vista.getPdatos().getCnum2().getText();
		    aux2 = Double.parseDouble(aux);
			Numero b = new Numero();
			b.setN(aux2);
			
			vista.getPresultados().getEresult().setText("La multiplicacion de los numeros ingresados es " + a.multiplicar(b));
		}
	
	public void operaciondividir() {
		   String aux = "";
		   double aux2 = 0.0;
			aux = vista.getPdatos().getCnum1().getText();
		    aux2 = Double.parseDouble(aux);
			Numero a = new Numero();
			a.setN(aux2);
			
			aux = vista.getPdatos().getCnum2().getText();
		    aux2 = Double.parseDouble(aux);
			Numero b = new Numero();
			b.setN(aux2);
			
			vista.getPresultados().getEresult().setText("La division de los numeros ingresados es " + a.dividir(b));
		}
	
	public void operacionpotencia() {
		   String aux = "";
		   double aux2 = 0.0;
			aux = vista.getPdatos().getCnum1().getText();
		    aux2 = Double.parseDouble(aux);
			Numero a = new Numero();
			a.setN(aux2);
			
			aux = vista.getPdatos().getCnum2().getText();
		    aux2 = Double.parseDouble(aux);
			Numero b = new Numero();
			b.setN(aux2);
			
			vista.getPresultados().getEresult().setText("La potencia de los numeros es " + a.potencia(a) + " " + a.potencia2(b));
		}
	
	public void operacionraiz() {
		   String aux = "";
		   double aux2 = 0.0;
			aux = vista.getPdatos().getCnum1().getText();
		    aux2 = Double.parseDouble(aux);
			Numero a = new Numero();
			a.setN(aux2);
			
			aux = vista.getPdatos().getCnum2().getText();
		    aux2 = Double.parseDouble(aux);
			Numero b = new Numero();
			b.setN(aux2);
			
			vista.getPresultados().getEresult().setText("La Raiz de los numeros es " + a.raiz(a) + " " + a.raiz2(b));
		}
	
	public void operacionmodulo() {
		   String aux = "";
		   double aux2 = 0.0;
			aux = vista.getPdatos().getCnum1().getText();
		    aux2 = Double.parseDouble(aux);
			Numero a = new Numero();
			a.setN(aux2);
			
			aux = vista.getPdatos().getCnum2().getText();
		    aux2 = Double.parseDouble(aux);
			Numero b = new Numero();
			b.setN(aux2);
			
			vista.getPresultados().getEresult().setText("La Raiz de los numeros es " + a.modulo(b));
		}
}
