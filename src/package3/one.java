package package3;
public class one extends ten {
    final String realName = "one";

    String name;
    int age;
    public one(String name) {
        this.name = name;
    }
    public one(int age) {
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

    public void printAb3() {
        System.out.println("ab1");
    }
    public void printAb4() {
        System.out.println("ab1");
    }
    public void printAb5() {
        System.out.println("ab1");
    }
}
