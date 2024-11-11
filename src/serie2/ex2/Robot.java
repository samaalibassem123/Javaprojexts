package serie2.ex2;

public class Robot {
    private int x;
    private int y;
    private char orientation;

    /*constructeur*/
    public Robot(){
        x = 0;
        y = 0;
        orientation = 'N';
    }

    public void TournerDroite(){
        switch (orientation){
            case 'N':
                orientation = 'E';
                break;
            case 'E':
                orientation = 'S';
                break;
            case 'S':
                orientation = 'O';
                break;
            case 'O':
                orientation = 'N';
                break;
        }
    }

    public void Avancer(){
        switch (orientation){
            case 'N':
                y++;
                break;
            case 'E':
                x++;
                break;
            case 'S':
                y--;
                break;
            case 'O':
                x--;
                break;
        }
    }
    public void Avancer(int NbPas){
        switch (orientation){
            case 'N':
                y+=NbPas;
                break;
            case 'E':
                x+=NbPas;
                break;
            case 'S':
                y-=NbPas;
                break;
            case 'O':
                x-=NbPas;
                break;
        }
    }
    public void affiche() {
        System.out.println("x = "+x+" y = "+y+" orientation = "+orientation);
    }

}
