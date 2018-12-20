package pooHeritagePolymorphsime;

public class Test {
public static void main(String[] args) {
	Professeur karim=new Professeur("karimi", "karim", "k123457", 800,"bureautique");
	Personnel chadia=new Personnel("ben", "chadia", "bh123456",50,10000);
	Personnel directeur=new Personnel("ben", "ali", "bp123456",95000,0);
	
	karim.afficher();
	karim.augmenterSalaire(4000);
	karim.afficher();
	chadia.augmenterSalaire(9500);
	chadia.ajouterCommissiom(1000);
	
	chadia.afficher();
	directeur.reduireSalaire(80000);
	directeur.afficher();
	try {
		directeur.setSalaireBase(900);
		directeur.augmenterSalaire(8000);
		directeur.afficher();
		
	} catch (Exception e) {
	System.out.println(e.getMessage());
	}
	
	
	
	System.out.println("fin programme");
	

}
}
