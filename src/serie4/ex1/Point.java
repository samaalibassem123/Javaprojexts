package serie4.ex1;
public class Point {
    private int x,y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void affiche()
    {System.out.println("coordonnées : " + x + " " + y);}
}