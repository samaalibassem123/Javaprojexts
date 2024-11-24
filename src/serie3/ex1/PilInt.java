package serie3.ex1;

import javax.script.CompiledScript;
import java.util.Scanner;

public class PilInt {
    private int tab[], n , tmax;

    public void Initialiser(int max){
        tab = new int[max];
        tmax = max;
        n = 0;
    }
    public void  affiche(){
        if(n == 0){
            System.out.println("pile est vide");
        }else {
            System.out.println("Afficher les elements: ");
            for (int i = 0; i < n; i++ ){
                System.out.println(tab[i] + " ");
            }
        }

    }
    public void empiler(int a){
        if(n == tmax){
            System.out.println("Pile pleine");
        }else {
            tab[n] = a;
            n++;
        }
    }

    public int depiler(){
        if(n == 0){
            System.out.println("La pile est vide");
            return -1;
        }else {
            n--;
            return tab[n];
        }
    }

    public static void main(String[] args){
        System.out.println("----------------------------------------------------EXERCICE 1 / SERIE3----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        PilInt pile = new PilInt();

        System.out.print("donnez N de PIle: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        pile.Initialiser(n);

        for (int i = 0; i < n; i++){
            System.out.print("donnez element "+i+" = ");
            int element = sc.nextInt();
            pile.empiler(element);
        }
        pile.affiche();

        System.out.print("how many time do u want to empiler : ");
        int supelement = sc.nextInt();

        for (int i = 0 ; i < supelement; i++){
            pile.depiler();
        }
        pile.affiche();




        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");
    }

}
