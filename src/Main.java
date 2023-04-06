public class Main{

    public static void main(String[] args) {
        Girl anna = new Girl("Anna",20, Gender.FEMALE);
        Girl emma = new Girl();
        emma.setName("Emma");
        emma.setAge(22);
        emma.setSex(Gender.FEMALE);

        Boy jack = new Boy("Jack", 19,Gender.MALE);
        Boy duo = new Boy();
        duo.setName("Duo");
        duo.setAge(31);
        duo.setSex(Gender.MALE);

        System.out.println(anna);
        System.out.println(emma);
        System.out.println(jack);
        System.out.println(duo);
    }
}
