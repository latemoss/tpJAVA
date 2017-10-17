


import java.util.ArrayList;
import java.util.List;
public class Personnel extends Employe{
    private List<Employe> employes;
    private static final String PRINT_PATTERN = "%s gagne %s euros";

    public Personnel() {
        this.employes = new ArrayList<>();
    }

    public void ajouterEmploye(Employe employe) {
        this.employes.add(employe);
    }

    public void afficherSalaires() {
        employes.forEach(employe -> System.out.println(String.format(PRINT_PATTERN, employe.getName(), employe.calculerSalaire())));
    }

    public double salaireMoyen() {
        double total = 0;
        for (Employe employe: employes) {
            total += employe.calculerSalaire();
        }
        return total / employes.size();
}
