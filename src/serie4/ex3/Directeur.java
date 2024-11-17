package serie4.ex3;

public class Directeur extends Salarie{
    private double prixMen;
    private double salaireFixe;
    public Directeur(String nom, String matc, double prixMen, double salaireFixe){
        super(nom,matc);
        this.prixMen = prixMen;
        this.salaireFixe = salaireFixe;
    }

    @Override
    public double calculSalaire() {
        return salaireFixe+prixMen;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("salaire = "+calculSalaire());
    }
}
