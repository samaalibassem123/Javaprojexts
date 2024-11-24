package serie4.ex4;

public class TestFrome {
    public static void main(String[] args){
        System.out.println("----------------------------------------------------EXERCICE 4 / SERIE4----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        Cercle c = new Cercle(1.5);
        Rectangle r = new Rectangle(2,3);
        Rectangle carrer = new Carre(4);

        System.out.println("le primitere de cercle = "+ c.primetre() + " , le surface = "+c.surface());
        System.out.println("le primitere de Rectangle = "+ r.primetre() + " , le surface = "+r.surface());
        System.out.println("le primitere de Carre = "+ carrer.primetre() + " , le surface = "+carrer.surface());

        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");
    }
}
