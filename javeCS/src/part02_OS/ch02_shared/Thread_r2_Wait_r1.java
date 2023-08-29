package part02_OS.ch02_shared;

public class Thread_r2_Wait_r1 extends Thread{
    @Override
    public void run(){
        synchronized (Resurces.r2) {//동기식 처리
            System.out.println(Thread.currentThread().getName() + "take r2 N r1 wait");
            synchronized (Resurces.r1){
                System.out.println(Thread.currentThread().getName() + "take r1");
                System.out.println(Thread.currentThread().getName() + "put r1 r2");
            }
        }
    }
}
