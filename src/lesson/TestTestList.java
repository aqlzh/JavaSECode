package lesson;


//  自己所写
class Node2 {
    private  int data ;
    private String name ;
    Node2 next ;


      //无参构造
    public Node2() {
    }

    public Node2(int data, String name) {
        this.data = data;
        this.name = name;

    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node2 getNext() {
        return next;
    }

    public void setNext(Node2 next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "data=" + data +
                ", name='" + name + '\'' +

                '}';
    }


}

public class TestTestList {

    private  Node2 head = new Node2(0,"null");   //定义头节点
    //private  Node2 head = null ;
    private  Node2 dummyHead;//  定义虚拟头结点（辅助节点）

    private  static int length;

    public  TestTestList(){
        //初始化虚拟头结点
        dummyHead = new Node2(1,"null");
        length = 0 ;
    }


    // 插入
    public void insertEnd(Node2  nextNode){
        Node2 temp = head;      // 辅助节点

        // System.out.println(temp);
        while( true){
        if(temp.next==null)
            break;
        temp = temp.next;
    }
    temp.next = nextNode;
    length++;
    //System.out.println(length);
}


// 展示
    public void displayList(){
        Node2 temp = head.next;  // 辅组节点  头节点之后的元素有数据
        while( true){
            if(temp==null)
                break;

            System.out.println(temp.toString());    //重写的ToString  方法
            temp = temp.next;
        }

    }
    public void displayListArg(Node2 head){
        Node2 temp = head.next;  // 辅组节点  头节点之后的元素有数据
        while( true){
            if(temp==null)
                break;

            System.out.println(temp.toString());    //重写的ToString  方法
            temp = temp.next;
        }

    }

    // 删除
    public void delete (Node2 delNode){
        System.out.println(delNode.getData());

        Node2 temp = head.next;


        for (int i = 0; i <delNode.getData()-1; i++) {
            temp = temp.next;
        }
        temp.next = delNode.next ;
    }


// 翻转
public static Node2 reverseListNode(Node2 head){
    //单链表为空或只有一个节点，直接返回原单链表
    if (head == null || head.getNext() == null){
        return head;
    }
    //前一个节点指针
    Node2 preNode = null;
    //当前节点指针
    Node2 curNode = head;
    //下一个节点指针
    Node2 nextNode = null;

    while (curNode != null){
        nextNode = curNode.getNext();//nextNode 指向下一个节点
        curNode.setNext(preNode);//将当前节点next域指向前一个节点    ***关键***
        preNode = curNode;//preNode 指针向后移动
        curNode = nextNode;//curNode指针向后移动
    }

    return preNode;
}

    public static void main(String[] args) {
        TestTestList list = new TestTestList() ;
        Node2 head = new Node2(0,"null");
        Node2 node1 = new Node2(1,"数据结构") ;
        Node2 node2 = new Node2(2,"Java") ;
        Node2 node3 = new Node2(3,"C") ;
        Node2 node4 = new Node2(4,"Linux") ;

        list.insertEnd(head);
        list.insertEnd(node1);
        //ist.insertEnd(node1);   连续两者错误
        list.insertEnd(node2);
        list.insertEnd(node3);
        list.insertEnd(node4);

        //list.delete(node3);
        list.displayList() ;
       // list.reverseListNode() ;  错误
        System.out.println("=========");
        list.displayListArg(reverseListNode(head));
    }

}
