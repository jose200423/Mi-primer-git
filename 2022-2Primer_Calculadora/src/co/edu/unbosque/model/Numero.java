package co.edu.unbosque.model;

public class Numero {
	
	private double n;
	private String texto;
	
	
	public Numero() {
		n = 0;
		texto = "";
		//deben irme por todas clases get y set
	}
	
	public double suma(Numero b) {
		return n + b.n;
		
	}
	
	public double restar(Numero b) {
		if(n>b.n) {
			return n - b.n;
		}
		return b.n - n;
		
	}
	
	public double multiplicar(Numero b) {
		return n * b.n;
	}
	
	public double dividir(Numero b) {
			return n / b.n;
		
		
	}
	public double potencia(Numero b) {
		return Math.pow(n, 2);
		
	}
	public double potencia2(Numero b) {
		return Math.pow(b.n, 2);
		
	}
	
	public double raiz(Numero b) {
		return Math.sqrt(n);
		
	}
	public double raiz2(Numero b) {
		return Math.sqrt(b.n);
		
	}
	
	public double modulo(Numero b) {
		return n % b.n;
	}
	
	public String codificar() {
		
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		texto = texto.toUpperCase();
		
		char caracter;
		String texto1 = "";
		
		for (int i = 0; i < texto.length(); i++) {
			caracter = texto.charAt(i);
			int pos = letras.indexOf(caracter);
			if (pos == -1){
				texto1 = texto1 + caracter;
			}else{
				texto1 = texto1 + letras.charAt((pos-3) % letras.length());
			}
		
		}
	
		System.out.println(texto1); 
		return texto1;
	}
	

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	

}
