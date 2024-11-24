package serie3.ex3;

import javax.lang.model.element.Element;
import java.util.ArrayList;

public class EnsembleStr {
    private ArrayList<String> ensemble;

    public EnsembleStr(){
        ensemble = new ArrayList<>();
    }

    public void vider(){
        ensemble.clear();
    }

    public String afficher(){
        String Tabch = "";
        for (String elem : ensemble ){
            Tabch += ", " + elem;
        }
        return Tabch;
    }

    public int appartient(String ch){
        if(ensemble.contains(ch)){
            return ensemble.indexOf(ch);
        }else{
            return -1;
        }
    }

    public void ajouter(String ch){
        if(!ensemble.contains(ch)){
            ensemble.add(ch);
        }
    }

    public void retirer(String ch){
        if(ensemble.contains(ch)){
            ensemble.remove(ch);
        }

    }

    public boolean egaliter(EnsembleStr E){
        return E.afficher().equals(afficher());
    }
}
