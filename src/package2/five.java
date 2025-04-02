package package2;
public class five implements seven {
    final String realName = "five";

    String name;
    int age;
    public five() {

    }
    public five(String name) {
        this.name = name;
    }
    public five(int age) {
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
