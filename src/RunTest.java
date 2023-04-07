public class RunTest {

/*    Anna:  Anna, 20, Nữ
    Emma:  Emma, 22, Nữ
    Jack:  Jack , 19, Nam
    Duo:   Duo, 31, Nam*/
    public static void main(String[] args){
        Girl anna = new Girl("Anna", 20, Gender.NU);
        Girl emma = new Girl("Emma", 22, Gender.NU);

        Boy jack = new Boy("Jack", 19, Gender.NAM);
        Boy duo = new Boy("Duo", 31, Gender.NAM);

        System.out.println(anna);
        System.out.println(emma);
        System.out.println(jack);
        System.out.println(duo);
    }
}
