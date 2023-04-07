public abstract class Person {
    protected String name;
    protected int age;
    protected Gender sex;


    public abstract String getName();
    public abstract int getAge();

    public Gender getSex(){
        return sex;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    public String toString(){
        return getName() + ", " +getAge() + ", "  + getSex();
    }

}
