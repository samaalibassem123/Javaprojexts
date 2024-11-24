package serie3.ex2;

import java.util.Vector;

public class Service {
    private String nom;
    private int tel;
    private Employer chefService;
    private Vector<Employer> employers = new Vector<Employer>();

    public Service(String nom, int tel){
        this.nom = nom;
        this.tel = tel;
    }
    /*Getters*/
    public String getNom() {
        return nom;
    }
    public int getTel() {
        return tel;
    }

    public int getNombreEmploye(){
        int nb = 0;
        for (Employer emp : employers){
            if (emp.getGrade().equals("employer")){
                nb += 1;
            }
        }
        return nb;
    }
    public Employer getChefService(){
        return chefService;
    }
    /*Setters*/
    public void setTel(int tel) {
        this.tel = tel;
    }
    public void setChefService(Employer chefService) {
        if(chefService.getService() == this){
            this.chefService =  chefService;
            chefService.setGrade("chef");
        }else{
            chefService.getService().eliminerEmploye(chefService);
            AffecterEmployer(chefService);
            this.chefService= chefService;
            chefService.setGrade("chef");
        }
    }

    public void AffecterEmployer(Employer employer){
        if(!employers.contains(employer)){
            employer.setService(this);
            employers.addElement(employer);
        }
    }
    public void eliminerEmploye(Employer employer){
        int i = 0;
        for (Employer emp : employers){
            if (emp.toString().equals(employer.toString())){
                employers.removeElement(i);
                break;
            }
            i+=1;
        }
    }

    /*To string*/
    public String toString() {
        return "nom chef = "+chefService.getNom()+", employers = "+employers.size();
    }
}
