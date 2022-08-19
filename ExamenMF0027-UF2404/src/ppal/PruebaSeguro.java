package ppal;

import modelo.SeguroCoche;

public class PruebaSeguro {

	public static void main(String[] args) {
		SeguroCoche s1= new SeguroCoche();
		System.out.println("Seguro 1: "+s1);

		SeguroCoche s2= new SeguroCoche("c12456H", "Macarena", 
				"Villalba Morales", "26975743D", 2018, "Trimestral", 150, 0, "1957KPG", 2018);
		System.out.println("Seguro 2: "+s2);
		
		System.out.println("La prima para el seguro con id de Poliza" +s2.getIdPoliza()+ "es de: "+s2.calcularPrima()+" euros");
		
		s2.setAnyo(10);
		System.out.println("La prima para el seguro anterior en el caso de llevar 10 años en la aseguradora es de: "+s2.calcularPrima()+" euros");
		
		s2.setNumSiniestrosHistoricos(2);
		System.out.println("La prima para el seguro anterior en el caso de haber tenido 2 siniestros es de: "+s2.calcularPrima()+" euros");
		
		s2.setAnyo(11);
		System.out.println("La prima para el seguro anterior con 11 años de antigüedad es de: "+s2.calcularPrima()+" euros");
		
		
	}

}
