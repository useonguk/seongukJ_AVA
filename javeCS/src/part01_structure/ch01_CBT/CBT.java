package part01_structure.ch01_CBT;

import javax.swing.text.Style;
import java.util.LinkedList;
import java.util.Queue;

public class CBT implements CBTInterface{
    MyNode root;// null
    int count; // 0

    @Override
    public void push(Integer value) {
        MyNode newNode = new MyNode(value);
        if(count == 0){
            root = newNode;
            count++;
            return;
        }
        //입력할 위치찾기 위한 반복문
        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp;
        while(true){
            temp = queue.poll();
            //왼쪽 자식 비었냐?
            if(temp.left == null) {
                temp.left = newNode;
                break;
            }else{
                queue.add(temp.left);
            }
            //오른쪽 쵝크
            if(temp.right == null){
                temp.right = newNode;
                break;
            } else{
                queue.add(temp.right);
            }
        }
        count++;
    }

    @Override
    public Integer pop() {
        if(count == 0) {
            System.out.println("트리빔");
            return null;
        } else if (count == 1) {
            int n = root.value;
            root = null;
            count--;
            return n;
        }
        //탐색
        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp = null;
        MyNode pre = null;//부모 노드
        while(!queue.isEmpty()){
            temp = queue.poll();
            //왼 확인
            if(temp.left != null){
                pre = temp;
                queue.add(temp.left);
            }
            if(temp.right != null){
                pre = temp;
                queue.add(temp.right);
            }
        }
        if(pre.left.equals(temp)){
            pre.left = null;
        }else {
            pre.right = null;
        }
        count--;
        return temp.value;
    }

    @Override
    public MyNode getRoot() {
        return root;
    }

    @Override
    public void bfs(MyNode node) {
        if(count == 0){
            System.out.println("tree null");
        }
        Queue<MyNode> queue = new LinkedList<>();
        queue.add(root);
        MyNode temp = null;
        MyNode pre = null;//부모 노드
        while(!queue.isEmpty()){
            temp = queue.poll();
            System.out.println(temp.value);
            //왼 확인
            if(temp.left != null){
                pre = temp;
                queue.add(temp.left);
            }
            if(temp.right != null) {
                pre = temp;
                queue.add(temp.right);
            }
        }
    }

    @Override
    public void dfs(MyNode node) {
        if (count == 0) {
            System.out.print("트리 비었당");
        }
        if(node != null){
            dfs(node.left);
            dfs(node.right);
//            System.out.print(node.value + " ");
        }
    }
}
