package part01_structure.ch01_CBT;

public interface CBTInterface {
    void push(Integer value);

    Integer pop();
    MyNode getRoot();

    void bfs(MyNode node);//입력한 그대로 출력
    void dfs(MyNode node);
}
