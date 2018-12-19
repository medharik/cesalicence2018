package pooEncapsulation;

import java.util.Date;

import javax.swing.JOptionPane;

public class Test {
public static void main(String[] args) {
	
	Produit hp=new Produit("hp dv 6",9000,100);//instanciation  
	//hp.libelle="tst 99898";
	hp.afficher();
	try {
		
		hp.setPrix(9000);
		hp.afficher();
		//System.out.println(hp.getPrix());
		
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	//hp.setQteStock(-20);
	
	
	
	ProduitAlimentaire lait=
			new ProduitAlimentaire("lait salim", 100,10,new Date(118,12,19));

	lait.afficher();
	try {
	lait.setPrix(10);
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
lait.setQteStock(10);
lait.libelle="lait UHT";
lait.dateExpiration=new Date(118,12, 13);

lait.afficher();

	
}
}
