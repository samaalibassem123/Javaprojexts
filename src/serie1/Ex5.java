package serie1;

public class Ex5 {
    public static void main(String[] args){


        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[2]);

        switch (args[1]){
            case "+":
                System.out.println("n1 + n2 " + (n1+n2));
                break;
            case "*":
                System.out.println("n1 * n2 "+ (n1+n2));
                break;
            case "/":
                if(n2 == 0){
                    System.out.println("en ne peut pas diviser sur 0");
                }else{
                    System.out.println("n1 / n2"+ (n1/n2));
                }
                break;
        }

    }
}
