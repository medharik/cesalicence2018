
public class Stagiaire  extends Employee{

	private double salaireHebdo;

	public Stagiaire() {
		
	}

	public Stagiaire(String nom, String prenom, double salaireHebdo) {
		super(nom, prenom);
		this.salaireHebdo = salaireHebdo;
	}

	public double getSalaireHebdo() {
		return salaireHebdo;
	}

	public void setSalaireHebdo(double salaireHebdo) {
		this.salaireHebdo = salaireHebdo;
	}
	
	@Override
	public double calculerSalaire() {
		
		return salaireHebdo*4;
	}
	}
