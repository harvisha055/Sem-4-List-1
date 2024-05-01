class DivByThree implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

class DivByFive implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}

public class List4_4 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new DivByThree());
        Thread t2 = new Thread(new DivByFive());
        t1.start();
        t2.start();
    }
}