package Hienthi_Sochanle;

public class EvenThread implements Runnable {

    @Override
    public void run() {
        for(int i = 1; i <= 10; i ++) {
            if(i % 2 == 0) {
                try {
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        }
    }
}
