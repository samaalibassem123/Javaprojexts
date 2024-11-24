package serie2.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPoint {

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------EXERCICE 3 / SERIE2----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        Point p = new Point();

        p.afficher();

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        p.deplacer(a, b);

        p.afficher();

        System.out.println("Affichage du Point : " + p);

        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");


    }
    
}
