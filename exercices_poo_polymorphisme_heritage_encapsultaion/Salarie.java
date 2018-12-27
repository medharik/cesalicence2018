
public class Salarie extends
 Employee{
 private double taux;
 private double nombreHeure;
 
 public double getTaux() {
	return taux;
}
 public double getNombreHeure() {
	return nombreHeure;
}
 
 public void setTaux(double taux) throws Exception {
	 if (taux < 0) {
		throw new Exception("Taux invalide!!");
	}else {
		this.taux=taux;
	}
	 
}
 public void setNombreHeure(double nombreHeure) throws Exception {
	 if (nombreHeure<0) {
		throw new Exception("Nombre d'heure incorrect");
	} else {
this.nombreHeure=nombreHeure;
	}
	this.nombreHeure = nombreHeure;
}
 public Salarie() {
	// TODO Auto-generated constructor stub
}
 public Salarie(String nom, String prenom,double taux,double nombreHeure) {
	super(nom, prenom);
	this.taux=taux;
	this.nombreHeure=nombreHeure;
}
 @Override
	public double calculerSalaire() {
	double salaire =this.taux*this.nombreHeure;
	 
		return salaire;
	}

 
 
 
}
