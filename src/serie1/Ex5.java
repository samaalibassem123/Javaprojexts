package serie1;

public class Ex5 {
    public static void main(String[] args){
        //MSG AFFICHE AU DEBUT D'EXERCICE
        System.out.println("----------------------------------------------------EXERCICE 5 / SERIE1----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);

        switch (args[1]){
            case "+":
                System.out.println("n1 + n2 = " + (n1+n2));
                break;
            case "*":
                System.out.println("n1 * n2 = "+ (n1+n2));
                break;
            case "/":
                if(n2 == 0){
                    System.out.println("en ne peut pas diviser sur 0");
                }else{
                    System.out.println("n1 / n2 = "+ (n1/n2));
                }
                break;
        }
        //MESSAGE AFFICHER EN FIN D'EXERCICE
        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");

    }
}
