import java.util.concurrent.atomic.LongAdder;

public class Shop extends Thread {
    private int[] array;
    LongAdder report;

    public Shop(int[] array, LongAdder report) {
        this.array = array;
        this.report = report;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        report.add(sum);
    }
}
