package part01_structure.ch02_BST;

public interface BSTInterFace {
    void add(Integer value);
    Integer remove(Integer value);
    MyNode getRoot();

     //탐색
    void preOrder(MyNode node);
    void inOrder(MyNode node);
    void postOrder(MyNode node);

}
