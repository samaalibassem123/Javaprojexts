package serie2.ex2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class TestRobot {
    public static void main(String[] args){

        Robot R = new Robot();
        System.out.println("Position initiale : ");
        R.affiche();

        R.Avancer(3);
        R.TournerDroite();
        R.TournerDroite();
        R.TournerDroite();
        R.Avancer();
        System.out.println("Position finale: ");
        R.affiche();



    }
}
