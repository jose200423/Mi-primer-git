package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CompararObjetos {
	
	static class Estudiante implements Comparable<Estudiante>{
		public String nombre;
		public int edad;
		
		public Estudiante(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}
		
		@Override
		public int compareTo (CompararObjetos.Estudiante o) {
			if (this.edad>o.edad) {
				return 1;
			}else if (this.edad<o.edad) {
				return -1;
			}else {
				return 0;
			}
		}
		
		
	}
	
	

	public static void main(String[] args) {
	//	ArrayList<Estudiante> lista = new ArrayList<>();
		
		PriorityQueue<Estudiante> lista = new PriorityQueue<>(); 
		lista.add(new Estudiante("Sebastian Ernesto Carroz Anez", 18));
		lista.add(new Estudiante("Cristhian Camilo Diaz Romero", 17));
		lista.add(new Estudiante("Oscar Eduardo Chavarro Pedroza", 18));
		lista.add(new Estudiante("Harold Mauricio Duarte Samboni", 18));
		lista.add(new Estudiante("Andres Santiago Rueda Vega", 17));
	
		
		
	/**
		ArrayList<Estudiante> lista2 = lista;
		
		//lista.sort((a,b)->a.edad>b.edad?1:a.edad<b.edad?-1:0);
		
		Comparator<Estudiante> ordenarPorEdad=(a,b)->a.edad>b.edad?1:-1;
		Comparator<Estudiante> ordenarPorNombre=(a,b)->a.nombre.compareTo(b.nombre);
		
		lista.sort(ordenarPorEdad.reversed());
		Collections.sort(lista2, ordenarPorNombre.thenComparing(Collections.reverseOrder()));
	//	lista2.sort(ordenarPorEdad);
	**/
		
		
		
		/**
		Collections.sort(lista, new Comparator<Estudiante>() {
			
			public int compare(Estudiante o1, Estudiante o2) {
				if(o1.edad>o2.edad) {
					return 1;
				}else if (o1.edad<o2.edad) {
					return -1;
				}else {
					if (o1.nombre.compareTo(o2.nombre)>0) {
						return 1;
					}else if (o1.nombre.compareTo(o2.nombre)<0) {
							return -1;
					}
					return 0;
				}
			}
		
			});
			**/
		lista.forEach((a)->{
			System.out.println(a.nombre+" "+a.edad);
		});
		
		System.out.println();
		/**
		lista2.forEach((a)->{
			System.out.println(a.nombre+" "+a.edad);
		});
		**/
	}
}

