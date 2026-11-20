package pcbuild;

public class Computer {
    private Processor cpu;
    private GraphicsCard gpu;

    public Computer() {
        this.cpu = new Processor();
        this.gpu = new GraphicsCard();
    }

    public void bootUp() {
        System.out.println("--- Booting up PC ---");
        cpu.start();
        gpu.start();
    }

    public void shutDown() {
        System.out.println("--- Shutting down PC ---");
        cpu.stop();
        gpu.stop();
    }
}