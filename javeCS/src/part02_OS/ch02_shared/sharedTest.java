package part02_OS.ch02_shared;

public class sharedTest {
    public static void main(String[] args) throws InterruptedException {
        Thread_r1_Wait_r2 t1 = new Thread_r1_Wait_r2();
        Thread_r2_Wait_r1 t2 = new Thread_r2_Wait_r1();

        t1.start();
//        Thread.sleep(100);//잠깐 대기시켜서 해결된다(좋지 못한 방법)
        t2.start();
    }
}
