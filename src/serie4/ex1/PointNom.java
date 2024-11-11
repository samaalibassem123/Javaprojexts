package serie4.ex1;

public class PointNom extends Point{
    private char name;
    public PointNom(char name, int x,int y){
        super(x,y);
        this.name = name;
    }

    @Override
    public void affiche(){
        System.out.print(" nom = " + name+" : ");
        super.affiche();
    }

}
