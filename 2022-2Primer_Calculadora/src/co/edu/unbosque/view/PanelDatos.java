package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel{
	
	private JLabel enum1;
	private JLabel enum2;
	private JLabel eoperaciones;
	private JTextField cnum1;
	private JTextField cnum2;
	private JButton bsumar;
	private JButton brestar;
	private JButton bmulti;
	private JButton bdivi;
	private JButton pote;
	private JButton raiz;
	private JButton modulo;
	
	public PanelDatos() {
		
		setLayout(null);
		setBackground(Color.CYAN);
		setBorder(new TitledBorder("Panel de Datos"));
		
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public JLabel getEnum1() {
		return enum1;
	}

	public void setEnum1(JLabel enum1) {
		this.enum1 = enum1;
	}

	public JLabel getEnum2() {
		return enum2;
	}

	public void setEnum2(JLabel enum2) {
		this.enum2 = enum2;
	}

	public JLabel getEoperaciones() {
		return eoperaciones;
	}

	public JButton getModulo() {
		return modulo;
	}

	public void setModulo(JButton modulo) {
		this.modulo = modulo;
	}

	public void setEoperaciones(JLabel eoperaciones) {
		this.eoperaciones = eoperaciones;
	}

	public JTextField getCnum1() {
		return cnum1;
	}

	public void setCnum1(JTextField cnum1) {
		this.cnum1 = cnum1;
	}

	public JTextField getCnum2() {
		return cnum2;
	}

	public void setCnum2(JTextField cnum2) {
		this.cnum2 = cnum2;
	}

	public JButton getBsumar() {
		return bsumar;
	}

	public void setBsumar(JButton bsumar) {
		this.bsumar = bsumar;
	}

	public JButton getBrestar() {
		return brestar;
	}

	public void setBrestar(JButton brestar) {
		this.brestar = brestar;
	}

	public void inicializarComponentes() {
		
		enum1 = new JLabel("Ingrese numero");
		enum1.setBounds(50, 50, 120, 20);//derecha abajo tamaño
		add(enum1);
		
		cnum1 = new JTextField();
		cnum1.setBounds(190, 50, 120, 20);
        add(cnum1);
        
        enum2 = new JLabel("Ingrese numero");
		enum2.setBounds(50, 100, 120, 20);//derecha abajo tamaño
		add(enum2);
		
		cnum2 = new JTextField();
		cnum2.setBounds(190, 100, 120, 20);
        add(cnum2);
        
        eoperaciones = new JLabel("Operaciones");
		eoperaciones.setBounds(50, 150, 80, 20);
        add(eoperaciones);
        
        bsumar = new JButton("+");
		bsumar.setBounds(170, 150, 50, 20);
        bsumar.setActionCommand("SUMAR");
		add(bsumar);
		
		brestar = new JButton("-");
		brestar.setBounds(230, 150, 50, 20);
        brestar.setActionCommand("RESTAR");
		add(brestar);

		bmulti = new JButton("*");
		bmulti.setBounds(290, 150, 50, 20);
		bmulti.setActionCommand("MULTIPLICAR");
		add(bmulti);

		bdivi = new JButton("/");
		bdivi.setBounds(350, 150, 50, 20);
		bdivi.setActionCommand("DIVIDIR");
		add(bdivi);
		
		pote = new JButton("^2");
		pote.setBounds(410, 150, 50, 20);
		pote.setActionCommand("POTENCIA");
		add(pote);
		
		raiz = new JButton("√");
		raiz.setBounds(470, 150, 50, 20);
		raiz.setActionCommand("RAIZ");
		add(raiz);
		
		modulo = new JButton("%");
		modulo.setBounds(170, 200, 50, 20);
		modulo.setActionCommand("MODULO");
		add(modulo);
		
		
        
	}

	public JButton getRaiz() {
		return raiz;
	}

	public void setRaiz(JButton raiz) {
		this.raiz = raiz;
	}

	public JButton getPote() {
		return pote;
	}

	public void setPote(JButton pote) {
		this.pote = pote;
	}

	public JButton getBmulti() {
		return bmulti;
	}

	public void setBmulti(JButton bmulti) {
		this.bmulti = bmulti;
	}

	public JButton getBdivi() {
		return bdivi;
	}

	public void setBdivi(JButton bdivi) {
		this.bdivi = bdivi;
	}

}
