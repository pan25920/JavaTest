package TestTwo;

public class ThreadDemo {
    public static void main(String[] args) {

        MyThread myThread=new MyThread();
        myThread.start();
    }

}
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread() + "-->"+i);
        }
    }
}
