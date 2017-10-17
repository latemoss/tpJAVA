public abstract class adPlusVente extends Employe{
    private double turnover;
    private static double INCOME_RATE = 0.2;

    public adPlusVente(String nom, String prenom, int age, String anneeEntre, double _turnover) {
        super(nom, prenom, age, anneeEntre);
        turnover = _turnover;
    }

    @Override
    public double calculerSalaire() {
        return INCOME_RATE * turnover + getBonus();
    }

    protected abstract double getBonus();
}
