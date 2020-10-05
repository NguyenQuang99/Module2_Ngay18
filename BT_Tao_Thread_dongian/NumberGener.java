package BT_Tao_Thread_dongian;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            try{
                Thread.sleep(500);

            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
            System.out.println(i);
        }

    }


}
