package serie2.ex1;


import java.util.Scanner;

public class TestTemps {
    public static void main(String[] args){
        Temps T = new Temps();

        Scanner input = new Scanner(System.in);

        System.out.print("donenz l' heure : ");
        int h = input.nextInt();

        System.out.print("donnez les minute : ");
        int m = input.nextInt();

        T.setHeures(h);
        T.setMinutes(m);
        T.affiche();
    }
}
