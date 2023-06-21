public class Counter {
    private static int count;
    private static int number;

    public Counter(int number) {
        Counter.number = number;
    }

    public static void incrementCount() {
        count += number;
    }

    public static int getCount() {
        return count;
    }

    public void setNumber(int number) {
        Counter.number = number;
    }

    public int getNumber() {
        return number;
    }
}