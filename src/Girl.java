public class Girl extends Person {
    private String name;
    private int age;
    private Gender sex;
    public Girl() {

    }

    public Girl(String name, int age, Gender sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    public Gender getSex() {
        return this.sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSex(Gender sex){
        this.sex = sex;
    }

    public String toString() {
        return getName() +", " + getAge() + ", " +getSex();
    }
}
