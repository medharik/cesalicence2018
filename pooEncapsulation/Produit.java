package pooEncapsulation;

public class Produit {
//variable d'instance <=> attributs
	//l'encapsulation est le premier principe de la poo
	//role de base : proteger les donnees de la classe 
	//en encapsulant les attributs par des gets (accesseurs pour la lecture)
	//et les setters (mutateurs pour l'ecriture )
	
	//les constructeurs : 
	//se sont des methodes qui ont pour role principal :
	//initialiser les attirbuts (au momment de l'instant)
	//en java , il porte le meme nom de la classe
	//et sans type de retour (meme pas void)
	
	
	public  String libelle;
	private double prix;
	private int qteStock;
	public Produit() {
		
	}
	public Produit(String libelle) {
		this.libelle=libelle;
	}
	
	public Produit(String libelle , double prix , int qteStock) {
	
		this.libelle=libelle;
//this(libelle);		
try {
	setPrix(prix);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		this.qteStock=qteStock;
	}
	 public Produit(String libelle, double prix) {
		
		this.libelle = libelle;
		this.prix = prix;
	}
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
