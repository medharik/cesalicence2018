package pooEncapsulation;

import java.util.Date;



public class ProduitAlimentaire extends Produit {
	
	public Date dateExpiration;
	
	public ProduitAlimentaire(String libelle, double prix, int qteStock, Date dateExpiration) {
			super(libelle, prix, qteStock);
		    this.dateExpiration=dateExpiration;
	
		
	}
	
	public ProduitAlimentaire() {
		
	}
	//redefinition 
	@Override
	void afficher() {
		
		super.afficher();
		System.out.println("la date d'expiration est "+this.dateExpiration.toLocaleString());
	}
	
	

}
