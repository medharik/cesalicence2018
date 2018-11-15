package pac1;

import java.util.Arrays;
import java.util.Scanner;

public class Note1 {

	public static void main(String[] args) {
		double note[]=new double[3];
		double somme=0,moyenne=0;
		
		Scanner clavier =new Scanner(System.in);
		// peupler le tableau des notes
		for (int i = 0; i < note.length; i++) {
			
			System.out.println("entrer la note numero "+(i+1));
			note[i]=clavier.nextDouble();
			
		}
		
		//calcul nde la somme et la moyenne
		
		for (int i = 0; i < note.length; i++) {
			somme +=note[i];
				
			
		}
		moyenne=somme/note.length;
		System.out.println("la somme est "+somme);
		System.out.println("la moyenne est "+ moyenne);
		Arrays.sort(note);
		System.out.println("note min "+note[0]);
		System.out.println("note max est "+note[note.length-1]);
		
		
	}
}
