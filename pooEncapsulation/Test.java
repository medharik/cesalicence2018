package pooEncapsulation;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	
	Produit hp=new Produit();
	hp.libelle="tst 99898";
	//hp.afficher();
	try {
		hp.setPrix(9000);
		hp.afficher();
		//System.out.println(hp.getPrix());
		
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	//hp.setQteStock(-20);
	
	
}
}
