package serie1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        //MSG AFFICHE AU DEBUT D'EXERCICE
        System.out.println("----------------------------------------------------EXERCICE 4 / SERIE1----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.print("donnez n1 : ");
        n1 = input.nextInt();

        System.out.print("donnez n2 : ");
        n2 = input.nextInt();

        System.out.print("somme = " + (n1+n2) + " , produit = "+ (n1 * n2));

        if(n2 == 0){
            System.out.println("on ne peut pas diviser sur 0");
        }else{
            System.out.println(", quotion = "+ n1/n2);
        }
        //MESSAGE AFFICHER EN FIN D'EXERCICE
        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");
    }
}
