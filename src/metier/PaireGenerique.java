package metier;

public class PaireGenerique<T> {
	
	private T premier;
	private T deuxieme;

	public PaireGenerique(T premier, T second) {
		super();
		this.premier = premier;
		this.deuxieme = second;
	}

	public T getPremier() {
		return premier;
	}

	public void setPremier(T premier) {
		this.premier = premier;
	}

	public T getDeuxieme() {
		return deuxieme;
	}

	public void setDeuxieme(T second) {
		this.deuxieme = second;
	}
	
	
	
}
