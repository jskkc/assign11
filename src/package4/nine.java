package package4;
public abstract class nine {
    final String realName = "nine";

    String name;
    int age;
    public nine() {

    }
    public nine(String name) {
        this.name = name;
    }
    public nine(int age) {
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

    abstract void printAb();

    abstract void printAb2();
}
