public class SynchronizedTest-1 extends Thread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                test.one("AA");
            }
        });
        thread.start();
        test.two();
    }

    public synchronized void one(String tag) {
        for(int i=0;i<100;i++){
            System.out.println("")
        }
    }

    public void two() {
        for(int i=0;i<100;i++){

        }
    }
}