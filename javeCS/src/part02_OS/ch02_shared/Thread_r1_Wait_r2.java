package part02_OS.ch02_shared;

public class Thread_r1_Wait_r2 extends Thread{
    @Override
    public void run(){
        synchronized (Resurces.r1) {//동기식 처리
            System.out.println(Thread.currentThread().getName() + "take r1 N r2 wait");
            synchronized (Resurces.r2){
                System.out.println(Thread.currentThread().getName() + "take r2");
                System.out.println(Thread.currentThread().getName() + "put r1 r2");
            }
        }
    }
}
