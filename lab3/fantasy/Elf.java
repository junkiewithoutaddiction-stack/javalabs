package fantasy;

public class Elf extends Creature {
    private int age;

    public Elf(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void performAction() {
        System.out.println("Elf " + name + " is shooting a bow.");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Age: " + this.age);
    }
}