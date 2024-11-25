package serie3.ex3;

public class TestEnsemble {
    public static void main(String[] args){
        EnsembleStr ensemble1 = new EnsembleStr();
        EnsembleStr ensemble2 = new EnsembleStr();
        ensemble1.ajouter("hi");
        ensemble1.ajouter("yassin");
        ensemble2.ajouter("hello");
        ensemble2.ajouter("test2");
        String Ch1 = ensemble1.afficher();
        String Ch2 = ensemble2.afficher();
        System.out.println("ch1 = "+Ch1);
        System.out.println("ch2 = "+Ch2);
        System.out.println("ch1 == ch2 : "+ ensemble1.egaliter(ensemble2));
        System.out.println("indexOf mot test2 dans ch2 = "+ensemble2.appartient("test2"));
    }
}
