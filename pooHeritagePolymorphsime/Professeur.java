package pooHeritagePolymorphsime;

public class Professeur extends Personne{

	String specialite;

	public Professeur(String nom, String prenom, String cin, double salaireBase, String specialite) {
		super(nom, prenom, cin, salaireBase);
		this.specialite = specialite;
	}
	
	public Professeur() {
	
	}

	
	@Override
	public void afficher() {
		
		super.afficher();
		System.out.println("Spécialité : "+this.specialite);
		
	}
	
}
