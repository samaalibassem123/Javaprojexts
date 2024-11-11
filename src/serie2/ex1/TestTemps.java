package serie2.ex1;


import java.util.Scanner;

public class TestTemps {
    public static void main(String[] args){
        Temps T = new Temps();

        Scanner input = new Scanner(System.in);

        System.out.println("donenz h : ");
        int h = input.nextInt();

        System.out.println("donnez minute: ");
        int m = input.nextInt();

        T.setHeures(h);
        T.setMinutes(m);
        T.affiche();
    }
}
