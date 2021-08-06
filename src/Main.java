import java.util.concurrent.atomic.LongAdder;

public class Main {
    public static void main(String[] args) {
        LongAdder report = new LongAdder();
        int[] first = {123, 6, 25, 71};
        int[] second = {124, 51, 77, 12, 6};
        int[] third = {11, 8, 6, 34, 231, 3135};
        Shop firstShop = new Shop(first, report);
        Shop secondShop = new Shop(second, report);
        Shop thirdShop = new Shop(third, report);
        firstShop.start();
        secondShop.start();
        thirdShop.start();
        try {
            firstShop.join();
            secondShop.join();
            thirdShop.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(report);
    }
}
