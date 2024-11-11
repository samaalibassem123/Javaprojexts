package serie3.ex2;

public class Employer {
    private String nom;
    private String grade;
    private float salaire;
    private Service service;

    /*Getters*/
    public String getNom(){
        return nom;
    }
    public String getGrade(){
        return grade;
    }
    public Service getService(){
        return service;
    }
    public float getSalaire(){
        return salaire;
    }

    /*Setters*/
    public void setGrade( String grade){
        this.grade = grade;
    }
    public void setService(Service service){
        this.service = service;
    }
    public void setSalire(float salaire){
        this.salaire = salaire;
    }

    /*to string*/
    public String toString() {
        return "nom = "+nom+", grade = "+grade+", salaire = "+salaire;
    }

}
