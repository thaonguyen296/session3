package JV2_Session78;

public class MyThread extends Thread {
    public void run(){

        for (int i =0; i<20; i+=2){
            try{
                System.out.println(Thread.currentThread().getName()+":"+i);
                Thread.sleep(1500);
            }catch (Exception e){}
        }
    }
}
