package serie2.ex1;


import java.util.Scanner;

public class TestTemps {
    public static void main(String[] args){
        System.out.println("----------------------------------------------------EXERCICE 1 / SERIE2----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        Temps T = new Temps();

        Scanner input = new Scanner(System.in);

        System.out.println("donenz h : ");
        int h = input.nextInt();

        System.out.println("donnez minute: ");
        int m = input.nextInt();

        T.setHeures(h);
        T.setMinutes(m);
        T.affiche();
        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");

    }
}
