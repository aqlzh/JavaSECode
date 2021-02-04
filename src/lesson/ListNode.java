package lesson;

//  Java  老师代码
class Node {
    private int data;
    private String name;
    Node next;


    // Constructor  构造方法


    //无参构造
    public Node(){
    }


    //有参构造
    public Node(int data) {
        this.data = data;
    }

    // 重写
    public Node(int data, String name) {
        this.name = name;
        this.data = data;
    }

    public String toString(){

        return "[" + data +"," + name + "]";
    }


    public int getData() {

        return data;
}
    public void setData(int data) {

        this.data = data;
    }

    public Node getNext() {

        return next;
    }

    public void setNext(Node next) {

        this.next = next;
    }

}




public class ListNode {

    // 初始化
    private  Node head = new Node(0,"");
    private  static int length;

    ListNode() {
        length = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int length(){
        return length;
    }

   //往最后插入
   //  A-> B -> C -> NULL
    public void insertEnd(Node  nextNode){
        Node temp = head;      // 辅助节点

       // System.out.println(temp);
        while( true){
            if(temp.next==null)
                break;
            temp = temp.next;
        }
        temp.next = nextNode;
        length++;
    }


    public void displayList(){
        Node temp = head.next;  // 辅组节点  头节点之后的元素有数据
        while( true){
            if(temp==null)
                break;

            System.out.println(temp.toString());    //重写的ToString  方法
            temp = temp.next;
        }

    }

    public int peek(int n){
        Node temp = head;
        for (int i = 0; i < n && temp!=null; i++) {
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public static void main(String[] args) {

        ListNode list = new ListNode();
        Node node1 = new Node(1,"Java");
        Node node2 = new Node(2,"C++");
        Node node3 = new Node(3,"JavaScript");
        Node node4 = new Node(4,"Linux");

        list.insertEnd(node1);
        list.insertEnd(node2);
        list.insertEnd(node3);
        list.insertEnd(node4);
        //list.insertEnd(node4);

        list.displayList();

        System.out.println("============");
        System.out.println(list.head.next.toString());      // 输出第一个元素
        System.out.println(list.head.next.next.toString());


    }
}