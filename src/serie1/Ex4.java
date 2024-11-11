package serie1;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("donnez n1 : ");
        n1 = input.nextInt();

        System.out.println("donnez n1 : ");
        n2 = input.nextInt();

        System.out.print("somme = " + (n1+n2) + "produit = "+ (n1 * n2));

        if(n2 == 0){
            System.out.println("on ne peut pas diviser sur 0");
        }else{
            System.out.println("quotion = "+ n1/n2);
        }

    }
}
