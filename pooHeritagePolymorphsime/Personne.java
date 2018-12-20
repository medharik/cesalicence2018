package pooHeritagePolymorphsime;

public class Personne {
//attributs
	final double SMIC=3000;
	String nom,prenom,cin;
	private double salaireBase;
	
	
	//methodes
	
	public Personne() {
	
	}
	
	public Personne(String nom,String prenom, String cin, double salaireBase) {
		this.nom=nom;
		this.prenom=prenom;
		this.cin=cin;
		this.salaireBase=salaireBase;	
		
	}

	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public void afficher() {
System.out.println("----------------------------------------------------");
		System.out.println("Nom: "+this.nom);
		System.out.println("Prenom : "+this.prenom);
		System.out.println("Cin : "+this.cin);
		System.out.println("Salaire de base : "+this.salaireBase+" DHS");
				
	}
	
	public void setSalaireBase(double salaireBase) throws Exception {
		
		if (salaireBase < SMIC) {
			throw new Exception("Salaire inacceptable ...");
		} else {
this.salaireBase=salaireBase;
		}
	}
	
	void augmenterSalaire(double valeur){
		
		this.salaireBase+=valeur;
	}
	void reduireSalaire(double valeur){
		
		this.salaireBase-=valeur;
	}
}
