package JV2_Session78;

public class Main2 {
    public static void main(String[] args) {
        MyThread s1 = new MyThread();
        s1.setName("myJavaThread");
//        s1.run();
        s1.start();
        System.out.println("Main thread :"+Thread.currentThread().getName());
    }
}
