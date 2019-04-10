package JV2_Session78;

public class CountDown extends Thread {
    public void run(){
        try{
            for (int i=10; i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
            System.out.println("Happy New Year!!!!!");
        }catch (Exception e){}
    }

}
