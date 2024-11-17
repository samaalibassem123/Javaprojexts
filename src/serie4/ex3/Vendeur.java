package serie4.ex3;

public class Vendeur extends Employer{
    private double pourcentage;
    public Vendeur(String nom,String matc, int nbh, double prixh, double pourcentage){
        super(nom, matc, nbh, prixh);
        this.pourcentage = pourcentage;
    }

    @Override
    public double calculSalaire() {
        return (super.calculSalaire()*pourcentage)+super.calculSalaire();
    }
    @Override
    public void afficher() {
        super.afficher();
    }
}
