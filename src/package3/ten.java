package package3;
public abstract class ten {
    final String realName = "ten";

    String name;
    int age;
    public ten() {

    }
    public ten(String name) {
        this.name = name;
    }
    public ten(int age) {
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

    abstract void printAb3();
    abstract void printAb4();
    abstract void printAb5();
}
