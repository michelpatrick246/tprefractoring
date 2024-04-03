package iut.bad;

public class Humain {

	protected String nom;
    protected String prenom;
    protected int age;
    
    public Humain() {}

    public Humain(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    
    public void details() {
    	System.out.println("Nom: "+ nom + ",Prénom: "+ prenom + ",Age: "+ age);
    }
    
    @Override
    public String toString() {
    	return "Nom: "+ nom + ",Prénom: "+ prenom + ",Age: "+ age ;
    }
    
    public void ami(Homme autreHumain, int dureeAmitie) {
        System.out.println(this.nom + " est maintenant ami avec " + autreHumain.nom +
        		" depuis " + dureeAmitie + " jours");
    }

    public void ami(Homme autreHumain) {
        int dureeAmitie = 100;
        ami(autreHumain, dureeAmitie);
    }
}
