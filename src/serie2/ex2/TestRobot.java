package serie2.ex2;

public class TestRobot {
    public static void main(String[] args){
        System.out.println("----------------------------------------------------EXERCICE 2 / SERIE2----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        Robot R = new Robot();
        R.Avancer(3);
        R.TournerDroite();
        R.TournerDroite();
        R.TournerDroite();
        R.Avancer();
        R.affiche();

        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");

    }
}
