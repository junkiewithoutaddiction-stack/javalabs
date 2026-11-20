package coffee;

public class CoffeeMachine {
    private String model;
    private int waterLevel;
    private boolean isHeating;
    private int beanCapacity;
    private int currentBeans;

    public CoffeeMachine(String model, int waterLevel, int beanCapacity) {
        this.model = model;
        this.waterLevel = waterLevel;
        this.beanCapacity = beanCapacity;
        this.currentBeans = 0;
        if (waterLevel < 10) {
            this.isHeating = true;
        } else {
            this.isHeating = false;
        }
    }

    public void displayStatus() {
        System.out.println("Model: " + model);
        System.out.println("Water Level: " + waterLevel + "%");
        System.out.println("Heating: " + isHeating);
        System.out.println("Bean Capacity: " + beanCapacity + " g");
        System.out.println("Current Beans: " + currentBeans + " g");
    }
}