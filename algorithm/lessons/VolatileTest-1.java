public class VolatileTest-1 extends Thread {
    boolean flag = false;
    int i = 0;

    public void run() {
        while(!flag){
            i++;
        }
    }

    public static void main(String[] args) throws Exception {
        VolatileTest vt = new VolatileTest();
        vt.start();
        Thread

    }
}