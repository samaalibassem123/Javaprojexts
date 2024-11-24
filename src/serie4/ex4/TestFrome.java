package serie4.ex4;

public class TestFrome {
    public static void main(String[] args){
        Cercle c = new Cercle(1.5);
        Rectangle r = new Rectangle(2,3);
        Rectangle carrer = new Carre(4);

        System.out.println("le primitere de cercle = "+ c.primetre() + " , le surface = "+c.surface());
        System.out.println("le primitere de Rectangle = "+ r.primetre() + " , le surface = "+r.surface());
        System.out.println("le primitere de Carre = "+ carrer.primetre() + " , le surface = "+carrer.surface());
    }
}
