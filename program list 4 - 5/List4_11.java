class EvenThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class List4_11{
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(oddThread);

        t1.start();
        t2.start();
    }
}