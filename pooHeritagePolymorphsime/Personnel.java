package pooHeritagePolymorphsime;

public class Personnel extends Personne {
double commission;

public Personnel() {
}
public Personnel(String nom, String prenom,String cin,double salaireBase, double commission) {
super(nom, prenom, cin, salaireBase);
this.commission=commission;
}
@Override
	public void afficher() {
		super.afficher();
		System.out.println("Commission : "+this.commission);
	}

	public void ajouterCommissiom(double commission) {
		this.commission += commission;

	}
	
}
