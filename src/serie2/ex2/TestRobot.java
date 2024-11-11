package serie2.ex2;

public class TestRobot {
    public static void main(String[] args){
        Robot R = new Robot();
        R.Avancer(3);
        R.TournerDroite();
        R.TournerDroite();
        R.TournerDroite();
        R.Avancer();
        R.affiche();
    }
}
