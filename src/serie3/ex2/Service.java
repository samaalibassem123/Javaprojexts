package serie3.ex2;

import java.util.Vector;

public class Service {

    private String nom;
    private int numTel;
    private Employer chef;
    private Vector<Employer> listeEmployes = new Vector<Employer>();

    public String getNom() {
        return this.nom;
    }

    public int getNombreEmployes() {
        return this.listeEmployes.size();
    }

    public int getNumTel() {
        return this.numTel;
    }

    public void setNumTel(int newNumTel) {
        this.numTel = newNumTel;
    }

    public Employer getChef() {
        return this.chef;
    }



    public void setChef(Employer newChef) {
        //this.chef = newChef;
        if(newChef.getMyService() == this) {
            this.chef = newChef;
            newChef.setGrade("Chef");
        }
        else {

            this.affecterEmploye(newChef);
            this.chef = newChef;
            newChef.setGrade("Chef");
        }

    }

    public void affecterEmploye(Employer e) {

        if(this.listeEmployes.contains(e)) {
            System.out.println("L'employé existe déjà dans la liste des employés de ce service !");
        }
        else {
            this.listeEmployes.add(e);
            e.setMyService(this);
        }
    }

    public void eliminerEmploye(Employer e) {
        if(this.listeEmployes.contains(e)) {
            this.listeEmployes.remove(e);
            e.setMyService(null);

        }
        else {
            System.out.println("L'employé n'existe pas dans la liste des employés de ce service !");
        }
    }

    public String toString() {
        String s = "Nom : " + this.nom + ", NumTel : " + this.numTel + ", Chef : " + this.chef.getNom() + " et la liste des employes est : ";

        for(int i = 0; i<listeEmployes.size(); i++) {
            if(!listeEmployes.get(i).getGrade().equals("CHEF"))
                s = s + listeEmployes.get(i).getNom() + "\n";
        }
        return s;
    }


}
