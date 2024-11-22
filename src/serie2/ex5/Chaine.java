package serie2.ex5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;


public class Chaine {
    public static int nbr_mot(String ch){
        String Ch = ch.trim();
        if (Ch.equals("")){
            return 0;
        }
        int res = 1;
        for (int i = 0 ; i < Ch.length() - 1 ; i++){
            if(Ch.charAt(i) != ' ' && Ch.charAt(i+1) == ' ' ){
                res++;
            }
        }
        return res;
    }

    public static void cons_voy(String ch){
        ArrayList<Character> VOY = new ArrayList<Character>();
        ArrayList<Character> CONS = new ArrayList<Character>();

        String CH = ch.toUpperCase();

        for (int i = 0; i < ch.length() ; i++){
            char letter = CH.charAt(i);
            if ( letter == 'A' || letter == 'I' || letter == 'O' || letter == 'E' || letter == 'U'){
                VOY.add(ch.charAt(i));
            }else {
                CONS.add(ch.charAt(i));
            }
        }
        System.out.println("VOY :");
        for (char letters : VOY){
            System.out.print(letters+" ,");
        }
        System.out.println("\n CONS :");
        for (char letters : CONS){
            System.out.print(letters+" ,");
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("donnez ch : ");
        String ch = input.nextLine();

        System.out.println("nombre de mot  = "+nbr_mot(ch));
        cons_voy(ch);
    }



}
