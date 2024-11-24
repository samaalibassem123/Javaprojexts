package serie3.ex1;

import javax.script.CompiledScript;

public class PilInt {
    private int tab[], n , tmax;

    public void Initialiser(int max){
        tab = new int[max];
        tmax = max;
        n = 0;
    }
    public void  affiche(){
        System.out.println("Afficher les elements: ");
        for (int i = 0; i < n; i++ ){
            System.out.println(tab[i] + " ");
        }
        System.out.println();
    }
    public void empiler(int a){
        if(n == tmax){
            System.out.println("Pile pleine");
        }else {
            tab[n] = a;
            n++;
        }
    }

    public int depiler(){
        if(n == 0){
            System.out.println("La pile est vide");
            return -1;
        }else {
            n--;
            return tab[n];
        }
    }

    public static void main(String[] args){
        PilInt pile = new PilInt();
        pile.Initialiser(5);

        pile.empiler(10);
        pile.empiler(20);
        pile.empiler(30);

        pile.affiche();

        System.out.println("Element depile: " + pile.depiler());
        pile.affiche();

        pile.depiler();
        pile.depiler();
        pile.depiler();
    }

}
