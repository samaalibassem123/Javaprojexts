package serie2.ex3;

public class Point {
    private float abcisse;
    private float ordonne;

    public void afficher() {
        //System.out.println("Abcisse : " + abcisse + " - ordonné : " + ordonne);
        System.out.println("Abcisse : " + this.abcisse + " - ordonné : " + this.ordonne);
    }

    public void deplacer(float a, float o) {
        this.abcisse = a;
        this.ordonne = o;
        // abcisse = a;
        // ordonne = o;
    }

  

    public Point() {
        this.abcisse = 0;
        this.ordonne = 0;
    }

    public Point(float a, float o) {
        this.abcisse = a;
        this.ordonne = o;
    }

//ACCESSEURS = GETTERS (lecture) + SETTERS (ecriture)

    public float getOrdonne() {
        return this.ordonne;
    }

    public float getAbcisse() {
        return this.abcisse;
    }

  

    public String toString() {
        return "(" + this.abcisse + "," + this.ordonne + ")";
       
    }

    public boolean equals(Object o) {
        Point q = (Point) o; //CAST

        // if(this.abcisse == q.abcisse && this.ordonne == q.ordonne)
        //     return true;
        // return false;

        return(this.abcisse == q.abcisse && this.ordonne == q.ordonne);
    }

   





}