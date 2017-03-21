package metier;
// Sans genericite
public class Paire {
	Object premier;
	Object deuxieme;

	public Paire(Object premier, Object deuxieme) {
		super();
		this.premier = premier;
		this.deuxieme = deuxieme;
	}

	public Object getPremier() {
		return premier;
	}

	public void setPremier(Object premier) {
		this.premier = premier;
	}

	public Object getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(Object deuxieme) {
		this.deuxieme = deuxieme;
	}
	
}
