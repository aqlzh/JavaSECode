package lesson;

// 完善版
public class NewList {
    public Entry head;         //定义链表的头结点
    public NewList(){          //初始化链表时创建一个头结点
        head = new Entry();
    }

    static class Entry{       //节点类    Node  <--> Entry
        int data;      //数据域
        String name ;
        Entry next;    //地址域

        public Entry(){//将头结点初始化为  data=-1   next=null
            data = -1;
            next = null;
        }

        public Entry(int val){//其他结点所需的构造函数
            data = val;
            next = null;
        }



        public Entry(int data, String name) {
            this.data = data;
            this.name = name;

        }
    }

// 头插法
    public void insertHead(int val){
        //创建节点 cur
        Entry cur = new Entry(val);

        cur.next = head.next;
        head.next = cur;

    }


// 尾插法
public void insertTail(int val){
    Entry tmp;
    Entry cur = new Entry(val);
    tmp = head;

    /*
     * 遍历链表到最后一个结点
     */
    while(tmp.next != null){
        tmp = tmp.next;
    }
    tmp.next = cur;
    cur.next = null;
}


//获取长度
//得到单链表的长度
public int getLength(){
    int len = 0;//长度标志量
    Entry tmp;
    tmp = head.next;
    while(tmp != null){//遍历整个链表得到链表长度
        len++;
        tmp = tmp.next;
    }
    return len;
}


// 指定插入
public boolean insertPos(int pos,int val){
    if(pos < 0 || pos > getLength()){
        return false;
    }else{
        Entry cur = head;
        //找到插入的地方
        for(int i = 0;i <= pos-1;i++){
            cur = cur.next;
        }
        Entry entry = new Entry(val);
        //进行插入
        entry.next = cur.next;
        cur.next = entry;
        return true;
    }
}


//打印
public void show(){
    Entry tmp;
    tmp = head;
    //遍历打印链表
    while(tmp.next != null){
        System.out.println("data :"+tmp.next.data);
        tmp = tmp.next;
    }
}

    public static void main(String[] args) {
        NewList list = new NewList() ;
       Entry node1 = new Entry(1,"小火车头") ;



    }
}
