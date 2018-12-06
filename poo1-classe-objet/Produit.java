package poo;
/**
 * @author dell
 * @since 2018
 */
public class Produit {

	//les attributs (fields) => data <=> variables d'instance

	
	

	String libelle;
	double prix;
	int qteStock;
	
	//les methodes => le comportement
	
	void afficher() {
		System.out.println("libelle : "+libelle);
		System.out.println("prix : "+prix+" Dhs");
		System.out.println("quantite en stock : "+qteStock);

	};
	
	
	 void recharger(int uneQte) {
		if (uneQte >0) {
			qteStock +=uneQte;
		} else {
			System.out.println("erreur de qte");

		}

	}
	
	
	
	
	

	
	
	
}
