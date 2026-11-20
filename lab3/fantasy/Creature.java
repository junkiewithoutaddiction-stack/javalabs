package fantasy;

public abstract class Creature implements Action {
    protected String name;

    public Creature(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("Creature name: " + this.name);
    }

    public abstract void performAction();
}