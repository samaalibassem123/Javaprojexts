package serie4.ex3;

public class Employer extends Salarie {
    private int nbh;
    private double prixh;
    public Employer(String nom,String matc, int nbh, double prixh){
        super(nom,matc);
        this.nbh = nbh;
        this.prixh = prixh;
    }
    @Override
    public double calculSalaire() {
        return nbh*prixh;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" Salaire = " +  calculSalaire() );
    }
}
