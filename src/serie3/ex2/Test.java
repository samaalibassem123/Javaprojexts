package serie3.ex2;
public class Test {

    public static void main(String[] args){
        System.out.println("----------------------------------------------------EXERCICE 2 / SERIE3----------------------------------------------------\n" +
                "--------------ETUDIANT : BASSEM SAMAALI-------------- \n" +
                "--------------GROUPE : A04-------------- \n" +
                "--------------2024/2025--------------");
        Service s1 = new Service("serivce1",54564578);
        Service s2 = new Service("serivce2",54564578);
        Employer E1 = new Employer("emp1",56.6f);
        Employer E2 = new Employer("emp2",56.6f);
        Employer E3 = new Employer("emp3",56.6f);
        Employer E4 = new Employer("emp4",56.6f);

        s1.AffecterEmployer(E1);
        s1.AffecterEmployer(E2);

        s2.AffecterEmployer(E3);
        s2.AffecterEmployer(E4);

        s1.setChefService(E1);
        s2.setChefService(E3);


        String ch1 = s1.toString();
        String ch2 = s2.toString();
        System.out.println(ch1);
        System.out.println(ch2);

        System.out.println("---------------------------------------------- \n" +
                "----------------FIN D'EXERCICE----------------\n" +
                "----------------------------------------------");
    }




}
