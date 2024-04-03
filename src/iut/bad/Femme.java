package iut.bad;

public class Femme extends Humain {
	
	public Femme() {
		super() ;
	}

	public Femme(String nom, String prenom, int age) {
		super(nom, prenom, age);
	}
	
	public static void main(String[] args) {
        Homme h = new Homme("Dupont", "Jean", 30);
        Femme f = new Femme("Martin", "Marie", 25);

        f.ami(h);
    }
}
