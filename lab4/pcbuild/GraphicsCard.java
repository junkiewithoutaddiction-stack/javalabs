package pcbuild;

public class GraphicsCard implements Component {
    @Override
    public void start() {
        System.out.println("Graphics Card is initializing. Rendering...");
    }

    @Override
    public void stop() {
        System.out.println("Graphics Card is shutting down.");
    }
}