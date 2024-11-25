package serie4.ex3;

public class TestEx3 {
    public static void main(String[] args){
        Employer emp1 = new Employer("test1","mat54",5,5.6);
        Vendeur vent1 = new Vendeur("test2","1025", 5, 5.6, 0.5);
        Directeur directeur1= new Directeur("texe2","turn58",800,5688);
        System.out.println("employer :");
        emp1.afficher();
        System.out.println("vendeur : ");
        vent1.afficher();
        System.out.println("directeur : ");
        directeur1.afficher();
    }
}
