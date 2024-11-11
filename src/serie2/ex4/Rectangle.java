package serie2.ex4;
public class Rectangle {
    private float longeur;
    private float largeur;

    public Rectangle(){
        longeur = 10;
        largeur =  5;
    }
    public Rectangle(float longeur, float largeur){
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public float perimetre(){
        float res = 2 * (largeur+longeur);
        return  res;
    }
    public  float surface(){
        return largeur*largeur;
    }

    public void modifierRectangle(float L, float l){
        longeur = L;
        largeur = l;
    }

    public void affiche(){
        System.out.println("l = "+longeur+"; L = "+largeur+"; perimtre = " + perimetre() + "; surface = " + surface());
    }

    public static void main(String[] args){
        Rectangle rect = new Rectangle(5.4f,3.5f);
        Rectangle rect2 = new Rectangle();
        rect.affiche();
        rect2.affiche();

        //Q3
        Rectangle rect3 = new Rectangle();
        rect3.modifierRectangle(20.6f, 15);

        //Q4 on obtient l = 0.0f and L = 0.0f
    }

}
