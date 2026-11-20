package fantasy;

public class Orc extends Creature {
    private String weapon;

    public Orc(String name, String weapon) {
        super(name);
        this.weapon = weapon;
    }

    @Override
    public void performAction() {
        System.out.println("Orc " + name + " is swinging a " + this.weapon);
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weapon: " + this.weapon);
    }
}