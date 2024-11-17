package serie4.ex3;

public abstract class Salarie {
    private String nom;
    private String matc;

    public Salarie(String nom,String matc) {
        this.nom = nom;
        this.matc = matc;
    }
    public void afficher(){
        System.out.print("nom = " + nom + ", matrucule = " + matc + ", " );
    }
    public abstract double calculSalaire();

}
