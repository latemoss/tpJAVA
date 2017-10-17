public class Manutention extends Employe{
    public static final double PRICE_PER_HOUR = 65;
    private final int heures;

    public Manutention(String nom, String prenom, int age, String anneeEntre, int _heures) {
        super(nom, prenom, age, anneeEntre);
        heures = _heures;
    }

    @Override
    public double calculerSalaire() {
        return PRICE_PER_HOUR * (double) heures;
    }

    @Override
    public String getPosition() {
        return "Le manutionnaire";
    }
}
