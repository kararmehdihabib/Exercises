public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        
        counter.decrease();
        counter.decrease();
        counter.decrease();
        counter.reset();
        counter.setInitial();
        counter.printValue();
    }
}
