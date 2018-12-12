package pooEncapsulation;

public class Produit {
//variable d'instance <=> attributs
	public  String libelle;
	private double prix;
	private int qteStock;
	
	 void afficher() {
	System.out.println("libelle "+this.libelle);
	System.out.println("prix : "+this.prix);
	System.out.println("quantité en stock "+this.qteStock);
	}
	 
	public void setPrix(double prix) throws Exception {
		if (prix < 0) {
		throw new Exception("Erreur , prix non valide");
		}else {
			this.prix = prix;
	
		}
	
	}
	public double getPrix() {
		return prix;
	}
	
	
	public void setQteStock(int qteStock) {
		
		if (qteStock<0) {
			System.out.println("erreur de qte");
		} else {
this.qteStock=qteStock;
		}
	}
	//concevoir une classe produit (libelle,qte,prix)
	//rechargerStock(qteArecharger); vendre : selon une qteAvendre
	//retourne le tht et maj du stock 
}
