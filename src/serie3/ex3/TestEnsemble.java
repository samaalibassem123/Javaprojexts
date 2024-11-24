package serie3.ex3;

public class TestEnsemble {
    public static void main(String[] args){
        EnsembleStr ensemble1 = new EnsembleStr();
        EnsembleStr ensemble2 = new EnsembleStr();

        ensemble1.ajouter("Hello");
        ensemble1.ajouter("Bassem");

        ensemble2.ajouter("Hello");
        ensemble2.ajouter("Bassem");

        String Ch1 = ensemble1.afficher();
        String Ch2 = ensemble2.afficher();
        System.out.println("Ensemble 1 = "+Ch1);
        System.out.println("Ensemble 2 = "+Ch2);

        System.out.println("Ensemble1 == Ensemble2 : "+ ensemble1.egaliter(ensemble2));

        System.out.println("index of mot bassem in ensemble 1 = "+ensemble1.appartient("Bassem"));


    }
}
