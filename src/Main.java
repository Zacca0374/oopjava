public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter(10);
        Counter.incrementCount();
        System.out.println("Count after increment: " + Counter.getCount());
        Counter.incrementCount();
        System.out.println("Count after increment: " + Counter.getCount());
        counter1.setNumber(3);
        System.out.println("Counter 1 number: " + counter1.getNumber());
        counter2.setNumber(8);
        System.out.println("Counter 2 number: " + counter2.getNumber());
    }
}
