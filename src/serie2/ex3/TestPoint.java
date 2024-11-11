package serie2.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPoint {

    public static void main(String[] args) {

        Point p = new Point();

        p.afficher();

        Scanner sc = new Scanner(System.in);

        float a = sc.nextFloat();
        float b = sc.nextFloat();

        p.deplacer(a, b);

        p.afficher();

        System.out.println("Affichage du Point : " + p);

    }
    
}
