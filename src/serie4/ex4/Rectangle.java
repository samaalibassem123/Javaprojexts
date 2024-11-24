package serie4.ex4;

public class Rectangle implements Forme{
    private int H;
    private int L;

    public Rectangle(int H, int L){
        this.H = H;
        this.L = L;
    }

    @Override
    public double surface() {
        return L*H;
    }

    @Override
    public double primetre() {
        return (L+H)*2;
    }
}
