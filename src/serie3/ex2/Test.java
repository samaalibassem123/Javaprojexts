package serie3.ex2;
public class Test {

    public static void main(String[] args){
        Service s1 = new Service();
        Service s2 = new Service();
        Employer E1 = new Employer();
        Employer E2 = new Employer();
        Employer E3 = new Employer();
        Employer E4 = new Employer();

        s1.AffecterEmployer(E1);
        s1.AffecterEmployer(E2);

        s2.AffecterEmployer(E3);
        s2.AffecterEmployer(E4);

        E3.setGrade("Chef");
        E1.setGrade("Chef");

    }




}
