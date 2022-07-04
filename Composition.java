import java.util.ArrayList;
import java.util.List;

class Keyboard {
    public String brandName;

    public Keyboard(String brandName) {
        this.brandName = brandName;
    }
}

class Monitor {
    public String brandName;
    public int size;

    public Monitor(String brandName, int size) {
        this.brandName = brandName;
        this.size = size;
    }
}

class Processor {
    public String brandName;
    public int RAM;

    public Processor(String brandName, int RAM) {
        this.brandName = brandName;
        this.RAM = RAM;
    }
}

class TechShop {
    private final List<Keyboard> keyboards;
    private final List<Monitor> monitors;
    private final List<Processor> processors;

    public TechShop(List<Keyboard> keyboards, List<Monitor> monitors, List<Processor> processors) {
        this.keyboards = keyboards;
        this.monitors = monitors;
        this.processors = processors;
    }

    public List<Keyboard> getAllKeyboards() {
        return keyboards;
    }

    public List<Monitor> getAllMonitors() {
        return monitors;
    }

    public List<Processor> getAllProcessors() {
        return processors;
    }
}

public class Composition {
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("HP");
        Monitor monitor = new Monitor("HP", 14);
        Processor processor = new Processor("HP", 8);
        List<Keyboard> keyboards = new ArrayList<>();
        List<Monitor> monitors = new ArrayList<>();
        List<Processor> processors = new ArrayList<>();
        keyboards.add(keyboard);
        monitors.add(monitor);
        processors.add(processor);
        TechShop techShop = new TechShop(keyboards, monitors, processors);
        int numK = techShop.getAllKeyboards().size();
        int numM = techShop.getAllMonitors().size();
        int numP = techShop.getAllProcessors().size();
        System.out.println("Number of keyboards in the shop: " + numK);
        System.out.println("Number of monitors in the shop: " + numM);
        System.out.println("Number of processors in the shop: " + numP);
    }

}
