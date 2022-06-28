package n1exercici1;

public class Producte {
	private String nom;
	private int preu;
	
	public Producte(String nom, int preu) {
		this.nom = nom;
		this.preu = preu;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getPreu() {
		return preu;
	}
	
	public void setPreu(int preu) {
		this.preu = preu;
	}
	
	
	
}
