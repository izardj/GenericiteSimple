package presentation;

import metier.Paire;
import metier.PaireGenerique;

public class Lanceur {

	public static void main(String[] args) {
		// exemple sans genericite
		Paire p = new Paire("abc", "xyz");
		String x = (String) p.getPremier();
		Double y = (Double) p.getDeuxieme(); // erreur a l'execution
		
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		// exemple avec genericite
		PaireGenerique<String> p2 = new PaireGenerique<String>("def", "uvw");
		String a = p2.getPremier();
		//Double b = p2.getDeuxieme(); // erreur des la compilation
		String b = p2.getDeuxieme();
		
		System.out.println(p2);
		
		PaireGenerique<Integer> p3 = new PaireGenerique<Integer>(12, 30);
		System.out.println(p3);
	}
}
