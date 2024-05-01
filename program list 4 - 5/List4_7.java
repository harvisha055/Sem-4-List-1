class ThreadI implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread-I");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadII implements Runnable {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread-II");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadIII implements Runnable {
    public void run() {
        for (int i = 0; i < 2; i++) {
            System.out.println("Thread-III");
            try {
                Thread.sleep(7500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class List4_7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadI());
        Thread t2 = new Thread(new ThreadII());
        Thread t3 = new Thread(new ThreadIII());
        t1.start();
        t2.start();
        t3.start();
    }
}