public abstract class Employe {

    private static String NAME_PATTERN= "%s %s %s";
    private String nom;
    private String prenom;
    private int age;
    private String anneeEntre;

    public Employe(String _nom, String _prenom, int _age, String _anneeEntre){
        nom=_nom;
        prenom=_prenom;
        age=_age;
        anneeEntre=_anneeEntre;
    }

    public abstract double calculerSalaire();
    public abstract String getPosition();

    public String getNom() {return String.format(NAME_PATTERN, getPosition(), nom, prenom);
    }
}