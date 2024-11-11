package serie3.ex3;

public class EnsembleStr {
    private int N;
    private String[] ensemble = new String[N];

    public EnsembleStr(){
    }

    public void affiche(){
        for(String ch : ensemble ){
            System.out.println(ch);
        }
        
    }
}
