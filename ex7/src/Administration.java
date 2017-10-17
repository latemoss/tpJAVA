public class Administration extends adPlusVente{
    public Administration(String nom, String prenom, int age, String anneeEntre, double turnover) {
        super(nom, prenom, age, anneeEntre, turnover);
    }

    @Override
    public String getPosition() {
        return "Le représentant";
    }

    @Override
    protected double getBonus() {
        return 800;
    }
}
