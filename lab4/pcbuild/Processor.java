package pcbuild;

public class Processor implements Component {
    @Override
    public void start() {
        System.out.println("Processor is starting up. Calculating...");
    }

    @Override
    public void stop() {
        System.out.println("Processor is shutting down.");
    }
}