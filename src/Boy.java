public class Boy extends Person{
//    private String name;
//    private int age;
//    private Gender sex;

    public Boy(){

    }

    public Boy(String name, int age, Gender sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
//
//    public Gender getSex(){
//        return sex;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setAge(int age){
//        this.age = age;
//    }
//
//    public void setSex(Gender sex) {
//        this.sex = sex;
//    }


//    public String toString(){
//        return getName() + ", " +getAge() + ", "  + getSex();
//    }
}
