package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelResultados extends JPanel{
	
	private JLabel eresult;
	
	
    public PanelResultados() {
		
		setLayout(null); //diseño 
		setBackground(Color.DARK_GRAY);
		setBorder(new TitledBorder("Panel de Resultados"));
		
		inicializarComponentes();
		
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		
		eresult = new JLabel("");
		eresult.setBounds(125, 75, 300, 20);
		add(eresult);
		
	}

	public JLabel getEresult() {
		return eresult;
	}

	public void setEresult(JLabel eresult) {
		this.eresult = eresult;
	}

}
