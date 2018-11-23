package pac1;

import java.util.Scanner;

public class Tp2Correction {

	public static void main(String[] args) {
		
		
		
		//saisir un tableau de 3 notes
double 	tnote []=	saisir();
		//calculer la somme des notes du tableau
double somme=calculerSomme(tnote);
System.out.println("la somme est "+somme);
		//calculer la moyenne (selon la somme )
double moyenne=calculerMoyenne(somme);
System.out.println("la moyenne est "+moyenne);
		// observation : echec ou reussite selon la moyenne
		 observer(moyenne);
		
	}
	
	
	
	
	

	private static void observer(double moyenne) {
		if (moyenne >=10) {
			System.out.println("Reussite");
		} else {
			System.out.println("Echec");

		}
		
	}

	private static double calculerMoyenne(double somme) {
	double moyenne= somme / 3;
		return moyenne;
	}

	private static double calculerSomme(double[] tnote) {
		double somme=0;
		for (int i = 0; i < tnote.length; i++) {
			somme +=tnote[i];
		}
		return somme;
	}

	private static double[] saisir() {
		Scanner clavier =new Scanner(System.in);
		double tnote[]=new double [3];
		for (int i = 0 ; i < tnote.length; i++) {
			System.out.println("entrer note numero "+(i +1 ));//printf
			tnote[i]=clavier.nextDouble();//scanf
			
			
		}
		
		return tnote;
	}
}
