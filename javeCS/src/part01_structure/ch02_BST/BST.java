package part01_structure.ch02_BST;

public class BST implements BSTInterFace {
    MyNode root;

    int count;

    @Override
    public void add(Integer value){
        MyNode newNode = new MyNode(value);
        if(count == 0){
            root = newNode;
            count++;
            return;
        }
        MyNode temp = root;
        while(true){
            if(temp.value < newNode.value){
                if(temp.right == null){
                    //추가
                    temp.right = newNode;
                    break;
                }
                temp = temp.right;
            } else{
                if(temp.left == null){
                    temp.left = newNode;
                    break;
                }
                temp = temp.left;
            }
        }
        count++;
    }

    @Override
    public Integer remove(Integer value) {
//        if(count == 0){
//            System.out.println("트리빔");
//            return null;
//        } else if (count == 1) {
//            int n = root.value;
//            root = null;
//            count--;
//            return n;
//        }
        //삭제 노드 탐색
        MyNode pre = null;
        MyNode temp = root;
        //탐색
        while(value != temp.value){
            if(value > temp.value){
                pre = temp;
                temp = temp.right;
            } else {
                pre = temp;
                temp = temp.left;
            }

            if (temp == null) {
                System.out.println("값 없다");
                return null;
            }
        }
        //혜당 노드를 찾으면 while문 탈출 아니면 while안에서 return
        //1. 자식 노드가 없을 때
        if(temp.right == null && temp.left == null){
            //해당 노드가 루트냐?(카운터 확인 없으면 사용)
            if(temp == root){
                root = null;
            } else if(pre.right == temp){
                pre.right = null;
            } else {// 왼쪽이 프리다
                pre.left = null;
            }
        }
        //자식노드가 1개 있다(왼쪽)
        else if (temp.right == null) {
            if(temp == root){
                root = temp.left;
            } else if (pre.right == temp) {
                pre.right = temp.left;
            } else{
                pre.left = temp.left;
            }
        } //자식노드가 1개 있다(왼쪽)
        else if (temp.left == null) {
            if(temp == root){
                root = temp.right;
            } else if (pre.left == temp) {
                pre.right = temp.right;
            } else{
                pre.left = temp.right;
            }
        } else {
            MyNode replacePre = temp;
            MyNode replaceTemp = replacePre.left;
            //우측 자식중 최댓값
            while(replaceTemp.right != null){
                replacePre = replaceTemp;
                replaceTemp = replaceTemp.right;
            }
            //가장 오른쪽(가장 큰수)를 찾음
            replacePre.right = replaceTemp.left;
            replaceTemp.left = temp.left;
            replaceTemp.right = temp.right;

            if(temp == root){//replaceTemp == 삭제/ replacePre == 올릴값
                if(temp == root){
                    root =replaceTemp;
                } else if (pre.left == temp) {
                    pre.left = replaceTemp;
                } else{
                    return temp.value;
                }
            }
        }
        count--;
        return null;
    }

    @Override
    public MyNode getRoot() {
        return root;
    }

    @Override
    public void preOrder(MyNode node) {
        if(node != null){
            System.out.println(node.value + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    @Override
    public void inOrder(MyNode node) {
        if(node != null){
            preOrder(node.left);
            System.out.println(node.value + " ");
            preOrder(node.right);
        }
    }

    @Override
    public void postOrder(MyNode node) {
        if(node != null){
            preOrder(node.left);
            preOrder(node.right);
            System.out.println(node.value + " ");
        }
    }

}
