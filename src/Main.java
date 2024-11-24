import serie1.Ex4;
import serie1.Ex5;
import serie2.ex1.TestTemps;
import serie2.ex2.TestRobot;
import serie2.ex3.TestPoint;
import serie2.ex4.Rectangle;
import serie2.ex5.Chaine;
import serie3.ex2.Test;
import serie4.ex1.TestPointS4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int serie;

        System.out.println("----------------------------------------------------PROJET DE PROGRAMMATION OBJET ORIENTEE JAVA----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");

        do{

            System.out.println("SECLECTIONEZ UNE SERIE \n" +
                    "1 - SERIE 1 \n" +
                    "2 - SERIE 2 \n" +
                    "3 - SERIE 3 \n" +
                    "4 - SERIE 4 \n" +
                    "5 - QUITTER \n");
            System.out.print("Réponse: ");
            serie = input.nextInt();

            switch (serie){
                case 1 :
                    int ExerciceS1;
                    do {
                        System.out.println("-----SELECTIONNEZ UNE EXERCICE \n" +
                                "----- 1 - EXERCICE 4 \n" +
                                "----- 2 - EXERCICE 5 \n" +
                                "----- 0 - RETOUR \n");
                        System.out.print("Réponse: ");
                        ExerciceS1 = input.nextInt();

                        switch (ExerciceS1){
                            case 1:
                                Ex4.main(args);
                                break;
                            case 2:
                                Ex5.main(args);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!ENTREZ UN NOBMRE COMME LE MENU INDIQUE!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (ExerciceS1 != 0);
                    break;

                case 2 :
                    int ExerciceS2;
                    do {
                        System.out.println("-----SELECTIONNEZ UNE EXERCICE \n" +
                                "----- 1 - EXERCICE 1 \n" +
                                "----- 2 - EXERCICE 2 \n" +
                                "----- 3 - EXERCICE 3 \n" +
                                "----- 4 - EXERCICE 4 \n" +
                                "----- 5 - EXERCICE 5 \n" +
                                "----- 0 - RETOUR \n");
                        System.out.print("Réponse: ");
                        ExerciceS2 = input.nextInt();
                        switch (ExerciceS2){
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
                                System.out.println("!!!!!!!!!!!!!!!!!!ENTREZ UN NOBMRE COMME LE MENU INDIQUE!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (ExerciceS2 != 0);
                    break;
                case 3 :
                    int ExerciceS3;
                    do {
                        System.out.println("-----SELECTIONNEZ UNE EXERCICE \n" +
                                "----- 1 - EXERCICE 1 \n" +
                                "----- 2 - EXERCICE 2 \n" +
                                "----- 3 - EXERCICE 3 \n" +
                                "----- 0 - RETOUR \n");
                        System.out.print("Réponse: ");
                        ExerciceS3 = input.nextInt();

                        switch (ExerciceS3){
                            case 1:
                                //do the work
                                break;
                            case 2:
                                Test.main(args);
                                break;
                            case 3:
                                //do the work
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!ENTREZ UN NOBMRE COMME LE MENU INDIQUE!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (ExerciceS3 != 0);
                    break;

                case 4 :
                    int ExerciceS4;
                    do {
                        System.out.println("-----SELECTIONNEZ UNE EXERCICE \n" +
                                "----- 1 - EXERCICE 1 \n" +
                                "----- 2 - EXERCICE 3 \n" +
                                "----- 3 - EXERCICE 4 \n" +
                                "----- 0 - RETOUR \n");
                        System.out.print("Réponse: ");
                        ExerciceS4 = input.nextInt();

                        switch (ExerciceS4){
                            case 1:
                                TestPointS4.main(args);
                                break;
                            case 2:
                                //do the work
                                break;
                            case 3:
                                //do the work
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("!!!!!!!!!!!!!!!!!!ENTREZ UN NOBMRE COMME LE MENU INDIQUE!!!!!!!!!!!!!!!!!!");
                                break;
                        }
                    }while (ExerciceS4 != 0);
                    break;
                case 5 :
                    System.out.println("----------------FIN----------------");
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!!!!!!!ENTREZ UN NOBMRE COMME LE MENU INDIQUE!!!!!!!!!!!!!!!!!!");
                    break;
            }
        }while(serie != 5);




    }
}