package serie4.ex3;

public class TestEx3 {
    public static void main(String[] args){
        Employer emp1 = new Employer("bassem","meata54",5,5.6);
        Vendeur vent1 = new Vendeur("test2","rease54", 5, 5.6, 0.5);
        Directeur directeur1= new Directeur("texe2","reaz558",800,5688);

        emp1.afficher();
        vent1.afficher();
        directeur1.afficher();
    }
}
