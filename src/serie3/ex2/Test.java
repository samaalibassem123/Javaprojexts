package serie3.ex2;
public class Test {
    public static void main(String[] args) {
        Service S1 = new Service();
        Service S2 = new Service();
        Employer E1 = new Employer("nidhal", "grade1", 1000f);
        Employer E2 = new Employer("mohamed", "grade2", 1200f);
        Employer E3 = new Employer("ali", "grade3", 800f);
        S1.affecterEmploye(E2);
        S1.setChef(E1);
        S2.setChef(E3);
        S2.setChef(E2);
        E2.setSalaire(E2.getSalaire( ) + 500 ) ;
        System.out.println (" Chef de service S1 :" + S1.getChef() +
                " \n Chef de service S2 :" + S2.getChef() + " Les infos des services sont :" + S1 + " " + S2) ;
    }
}
