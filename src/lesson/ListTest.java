package lesson;

public class ListTest {

    static class Node {
        private String data; //用于保存数据
        private Node next;   //用于保存下一个节点

        public Node(String data){
            this.data = data ;
        }

        public void setNext(Node next){
            this.next = next ;
        }

        public Node getNext(){
            return this.next ;
        }

        public String getData(){
            return this.data ;
        }
    }



        public static void main(String[] args) {

            //第一步：准备数据
            Node root = new Node("小火车头") ;
            Node n1 = new Node("车厢体1") ;
            Node n2 = new Node("车厢体2") ;
            Node n3 = new Node("车厢体3") ;

            // 链接节点
            root.setNext(n1);
            n1.setNext(n2);
            n2.setNext(n3);

            //读取数据
            Node currentNode = root ;  //从当前根节点开始读取

            while( currentNode !=  null){
                System.out.println(currentNode.getData()) ;
                //将下一个节点设置为当前节点s
                currentNode = currentNode.getNext() ;



            }
        }



}
