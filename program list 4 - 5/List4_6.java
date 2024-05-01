class EvenNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

class OddNumbers implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

public class List4_6 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new EvenNumbers());
        Thread t2 = new Thread(new OddNumbers());
        t1.start();
        t2.start();
    }
}