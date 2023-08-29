package part02_OS.ch01_Tread;

public class ThreadTest {
    public static void main(String[] args) {
        //1개의 Thread는 오름차순 출력
        ThreadAsc asc = new ThreadAsc(100);
        //1개의 Thread는 내림차순 출력
        ThreadDesc desc = new ThreadDesc(100);
        Thread t = new Thread(desc);
        asc.start();
        t.start();

    }
}
