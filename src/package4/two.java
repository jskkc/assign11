package package4;
import package1.eight;
import package4.*;
public class two extends three implements eight {
    final String realName = "two";
    String name;
    int age;
    public two(String name) {
        this.name = name;
    }
    public two(int age) {
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
}
