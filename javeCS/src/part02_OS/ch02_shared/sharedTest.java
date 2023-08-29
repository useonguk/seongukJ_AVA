package part02_OS.ch02_shared;

public class sharedTest {
    public static void main(String[] args) {
        Thread_r1_Wait_r2 t1 = new Thread_r1_Wait_r2();
        Thread_r2_Wait_r1 t2 = new Thread_r2_Wait_r1();

        t1.start();
        t2.start();
    }
}
