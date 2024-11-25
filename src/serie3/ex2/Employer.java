package serie3.ex2;

public class Employer {

    private String nom, grade;
    private Float salaire;
    private Service myService;

    public String getNom() {
        return this.nom;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String newGrade) {
        this.grade = newGrade;
    }

    public Service getMyService() {
        return this.myService;
    }

    public void setMyService(Service newService) {
        this.myService = newService;
    }

    public Float getSalaire() {
        return this.salaire;
    }

    public void setSalaire(Float newSalaire) {
        this.salaire = newSalaire;
    }

    public String toString() {
        return "Nom : " + this.nom + ", Grade : " + this.grade + ", Salaire : " + this.salaire;
    }

    public Employer(String a, String b, float c) {
        this.nom = a;
        this.grade = b;
        this.salaire = c;
    }
}

