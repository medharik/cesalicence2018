package poo;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	
	//on instancie ooiu on construit un objet de type Produit (classe)
	Produit pdt;//declarer un objet pdt 
	
	// instancier 
	pdt=new Produit();
	
	pdt.libelle=JOptionPane.showInputDialog("entrer un nom ");
	pdt.prix=7800;
	pdt.qteStock=15;
	pdt.afficher();
	pdt.prix *=0.80;
	pdt.afficher();
	pdt.recharger(100);
	pdt.afficher();
	pdt.recharger(-10);
	pdt.afficher();
	
	Produit hp=new Produit();
	hp.libelle="hp";
	hp.prix=9000;
	hp.afficher();
}
}
