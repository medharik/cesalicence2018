import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Test {
public static void main(String[] args) {
	
	Employee employees[]= {new Stagiaire("Bapindi", "Redouane",1500),
	new Salarie("Andre","Andre", 100,100),
	new Salarie("Hosni","Cheb", 90,200),
	new Stagiaire("karimi","karim",1000)
	
	};		
	double somme=0;
	for (int i = 0; i < employees.length; i++) {
		System.out.println(employees[i].calculerSalaire());
		somme += employees[i].calculerSalaire();
		
	}
	System.out.println(" la masse salariale est : "+somme+ " DHS");
	
	};
	

	

}
