package serie4.ex4;

public class Cercle implements Forme{
    private double rayon;


    public Cercle(double rayon){
        this.rayon = rayon;
    }


    @Override
    public double primetre() {
        return 2 * 3.14 * rayon;
    }

    @Override
    public double surface() {
        return 3.14 * rayon * rayon;
    }
}
