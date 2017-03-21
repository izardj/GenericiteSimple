package presentation;

import metier.Paire;

public class Lanceur {

	public static void main(String[] args) {

		Paire p = new Paire("abc", "xyz");
		String x = (String) p.getPremier();
		Double y = (Double) p.getDeuxieme(); // erreur a l'execution
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		}

}
