package serie2.ex1;

public class Temps {
    private int h;
    private int m;

    /*Setters*/
    void setHeures(int h){
        this.h = h;
    }
    void setMinutes(int m){
        this.m = m;
    }

    void affiche(){
        System.out.println(h+"H"+m+"mn");
    }
}
