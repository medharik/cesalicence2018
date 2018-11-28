package pac1;

import java.util.Scanner;

public class Calcul {

	
	
	public static void main(String[] args) {
		
		//saisir puht + qte
		    double info[]=saisir();
		//calculer tht
	double tht=	calculerTht(info);
	System.out.println("tht est "+tht);
		//selon la tva =>calculerTtc
	double tva=20;
		double ttc=calculerTtc(tht,tva);
		System.out.println("ttc est "+ttc);
		//selon une reduction =>calculerPrixReduit
		double taux=20;
		double ttcReduit=calculerPrixReduit(ttc,taux);
		System.out.println("ttc reduit est :"+ttcReduit);
	}
	
	
	
	
	
	

	private static double calculerPrixReduit(double ttc, double taux) {
		double ttcReduit=ttc*(1-taux/100);
		return ttcReduit;
	}

	private static double calculerTtc(double tht, double tva) {

		double ttc=tht*(1+tva/100);
		return ttc;
	}

	private static double calculerTht(double[] info) {
		
		double puht=info[0];
		double qte=info[1];
		
		double tht= puht*qte;
				
		
		
		
		return tht;
	}

	private static double[] saisir() {
		Scanner clavier =new Scanner(System.in);
		System.out.println("entrer puht :");
		double puht=clavier.nextDouble();
		System.out.println("entrer la quantité ");
		double qte=clavier.nextDouble();
		
		double info[]= {puht,qte};
		
		
		
		return info;
	}
}
