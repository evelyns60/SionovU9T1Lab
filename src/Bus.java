public class Bus extends Vehicle{
    private int windowCount;

    public Bus(String name, int wheels, int windowCount) {
        super(name, wheels);
        this.windowCount = windowCount;
    }

    public int getWindowCount() {
        return windowCount;
    }

    public void honk() {
        System.out.println("Honk honk! Get outta the way!");
    }

}
