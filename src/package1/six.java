package package1;
import package2.*;
public class six extends five implements eight {
    String name;
    int age;
    final String realName = "six";
    public six(String name) {
        this.name = name;
    }
    public six(int age) {
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
