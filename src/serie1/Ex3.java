package serie1;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        System.out.println("----------------------------------------------------EXERCICE 3 / SERIE1----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        Scanner input = new Scanner(System.in);

        System.out.print("donnez n = ");
        int n = input.nextInt();

        switch (n){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("un");
                break;
            case 3:
                System.out.println("un");
                break;
            case 9:
                System.out.println("neuf");
                break;
            default:
                System.out.println("ce n'est pas un nombre entre 0 et 9");

        }
        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");


    }
}
