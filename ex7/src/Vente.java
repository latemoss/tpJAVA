public class Vente extends adPlusVente{
    public Vente(String nom, String prenom, int age, String anneeEntre, double turnover) {
        super(nom, prenom, age, anneeEntre, turnover);
    }

    @Override
    public String getPosition() {
        return "Le vendeur";
    }

    @Override
    protected double getBonus() {
        return 400;
    }
}
