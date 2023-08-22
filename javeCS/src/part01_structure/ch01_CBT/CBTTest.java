package part01_structure.ch01_CBT;

public class CBTTest {
    public static void main(String[] args){
        CBT cbt = new CBT();

        cbt.push(10);
        cbt.push(5);
        cbt.push(1);
        cbt.push(12);
        cbt.push(14);
        cbt.push(7);
//        cbt.pop();

//        cbt.dfs(cbt.getRoot());
        cbt.bfs(cbt.getRoot());
    }
}
