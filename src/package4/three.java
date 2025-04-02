package package4;
import package1.*;
public class three extends nine implements eight {
    final String realName = "three";

    String name;
    int age;
    public three() {

    }
    public three(String name) {
        this.name = name;
    }
    public three(int age) {
        this.age = age;
    }

    public void addAge() {
        this.age++;
    }
    public void addAge(int i) {
        this.age += i;
    }

    private int getAge() {
        return this.age;
    }
    protected String getName() {
        return this.name;
    }

    public void printInfo() {
        int i = this.getAge();
        String j = this.getName();
        System.out.println("Name: " + i + " Age: " + j);
    }
    public void printAb() {
        System.out.println("ab1");
    }
    public void printAb2() {
        System.out.println("ab2");
    }
}
