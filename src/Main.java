import serie1.Ex4;
import serie1.Ex5;
import serie2.ex1.TestTemps;
import serie2.ex2.TestRobot;
import serie2.ex3.TestPoint;
import serie2.ex4.Rectangle;
import serie2.ex5.Chaine;
import serie3.ex1.PilInt;
import serie3.ex2.Test;
import serie3.ex3.TestEnsemble;
import serie4.ex1.TestPointS4;
import serie4.ex3.TestEx3;
import serie4.ex4.TestFrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("******yassin ben romthan******\n" + "******Groupe A02******\n" );
        Scanner sc = new Scanner(System.in);
        int s;
        do{
            System.out.println("selectionez serie \n" +
                    "1 = serie 1 \n" +
                    "2 = serie 2 \n" +
                    "3 = serie 3 \n" +
                    "4 = serie 4 \n" +
                    "5 = quitter \n");
            System.out.print("saisie = ");
            s = sc.nextInt();
            switch (s){
                case 1 :
                    int Ex;
                    do {
                        System.out.println("selectionez  exercice \n" +
                                "1 = exercice 4 \n" +
                                "2 = exercice 5 \n" +
                                "0 = retourner \n");
                        System.out.print("saisie = ");
                        Ex = sc.nextInt();

                        switch (Ex){
                            case 1:
                                Ex4.main(args);
                                break;
                            case 2:
                                Ex5.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!entrez un nombre comme le menu indique!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (Ex != 0);
                    break;

                case 2 :
                    int Ex2;
                    do {
                        System.out.println("selectionez un exercice \n" +
                                "1 = exercice 1 \n" +
                                "2 = exercice 2 \n" +
                                "3 = exercice 3 \n" +
                                "4 = exercice 4 \n" +
                                "5 = exercice 5 \n" +
                                "0 = retournez \n");
                        System.out.print("saisie = ");
                        Ex2 = sc.nextInt();
                        switch (Ex2){
                            case 1:
                                TestTemps.main(args);
                                break;
                            case 2:
                                TestRobot.main(args);
                                break;
                            case 3:
                                TestPoint.main(args);
                                break;
                            case 4:
                                Rectangle.main(args);
                                break;
                            case 5:
                                Chaine.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!entrez un nombre comme le menu indique!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (Ex2 != 0);
                    break;
                case 3 :
                    int Ex3;
                    do {
                        System.out.println("selectionnez une exercice \n" +
                                "1 = exercice  \n" +
                                "2 = exercice 2 \n" +
                                "3 = exercie 3 \n" +
                                "0 = retournez \n");
                        System.out.print("saisie = ");
                        Ex3 = sc.nextInt();

                        switch (Ex3){
                            case 1:
                                PilInt.main(args);
                                break;
                            case 2:
                                Test.main(args);
                                break;
                            case 3:
                                TestEnsemble.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!entrez un nombre comme le menu indique!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (Ex3 != 0);
                    break;

                case 4 :
                    int Ex4;
                    do {
                        System.out.println("selctionnez exercice \n" +
                                "1 = exercice 1 \n" +
                                "2 = exercice 3 \n" +
                                "3 = exercice 4 \n" +
                                "0 = retournez \n");
                        System.out.print("saisie");
                        Ex4 = sc.nextInt();

                        switch (Ex4){
                            case 1:
                                TestPointS4.main(args);
                                break;
                            case 2:
                                TestEx3.main(args);
                                break;
                            case 3:
                                TestFrome.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!entrez un nombre comme le menu indique!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (Ex4 != 0);
                    break;
                case 5 :
                    System.out.println("----------------FIN----------------");
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!!!!!!!entrez un nombre comme le menu indique!!!!!!!!!!!!!!!!!!");
                    break;
            }
        }while(s != 5);




    }
}