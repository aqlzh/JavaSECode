package lesson;

//顺序表相关操作


public class SeqList<T> extends Object{
    public Object[] element;  //顺序表
    public int len;  //顺序表元素个数


    //默认构造方法
    public SeqList(){
        this(64);
    }

    //构造方法 由values数组提供元素
    public SeqList(T[] values){
        this(values.length);
        for(int i=0;i<values.length;i++)
            element[i]=values[i];

    }
    //构造方法 提供长度
    public SeqList(int length) {
        this.element=new Object[length];//申请数组的存储空间，元素暂为null
        if(length<0) throw new java.lang.NegativeArraySizeException();
        this.len=0;
    }

    //拷贝构造方法
    public SeqList(SeqList list){
        this.len=list.len;  //浅拷贝方法，可拷贝基本数据类型
        this.element=new Object[list.element.length];//深拷贝方法拷贝引用数据类型。先申请一个数组。
        for(int i=0;i<list.len;i++)
            this.element[i]=list.element[i];  //对象引用赋值，没有创建新对象
    }

    //判断顺序表是否为空
    public boolean isEmpty(){
        return this.len==0;
    }

    //返回顺序表元素个数
    public int size(){
        return this.len;
    }

    //打印所有元素
    public void printAll(){
        for(int i=0;i<len;i++)
            System.out.print(element[i]+" ");
    }

    //设置第index个元素为element
    public void set(int index,T x){
        if(element==null) throw new NullPointerException("element==null");
        else if(index<0&&index>=len) throw new IndexOutOfBoundsException();
        else this.element[index]=x;
    }

    //获取第index个元素
    public Object get(int index){
        if(index>=0&&index<len)  return this.element[index];
        return null;

    }

    //插入元素
    public Object insert(int index,T x){
        if(index<0) index=0;
        else if(index>this.len) index=len-1;
        else if(x==null) throw new NullPointerException();//先判断容错
        Object[] element2=this.element;//创建element2数组暂存element元素
        if(this.len==element.length)//若顺序表已有元素个数=顺序表长度，则扩容
            this.element=new Object[element.length*2];
        for(int i=0;i<index;i++)
            element[i]=element2[i];
        for(int j=index+1;j<len+1;j++)
            element[j]=element2[j-1];
        element[index]=x;
        len++;
        return element;
    }

    //尾插
    public Object endInsert(T x){
        return this.insert(this.len, x);
    }

    //插入不重复元素，若无重复，尾插入,返回位置，若重复，返回-1
    public int insertdifferent(T key){
        for(int i=0;i<this.len;i++){
            if(key.equals(element[i]))
                return -1;
        }
        this.endInsert(key);
        return this.len;
    }


    //按位置删除
    public Object delete(int index){
        if(index<0) index=0;
        else if(index>this.len-1) index=this.len-1;
        else{
            for(int i=index;i<this.len-1;i++)
                element[i]=element[i+1];
            element[len-1]=null;
            this.len--;
        }
        return element;
    }

    //清空顺序表元素
    public void clear(){
        this.len=0;
    }


    //按元素删除
    public void delete2(T key) {
        int count=0;
        for(int i=0;i<len;i++){
            if(key==element[i]){
                Object[] list2=new Object[len-1];
                for(int j=0;j<i;j++) list2[j]=element[j];
                for(int j=i;j<len-1;j++) list2[j]=element[j+1];
                for(Object j:list2)  System.out.print(j+" ");
            }
            else  count++;
        }
        if(count==len) throw new IndexOutOfBoundsException();
    }

    //返回顺序表所有元素的描述字符串
    public String toString(){
        String str="(";
        for(Object x:element) str+=x+" ";
        str+=")";
        return str;
    }

    //返回其中一个元素的描述字符串
    public String toStringOne(int index){
        String str="(";
        str+=element[index]+")";
        return str;
    }

    //搜寻元素,若找到，则返回位置，若找不到，则返回-1
    public int search(T key){
        for(int i=0;i<this.len;i++)
            if(key.equals(element[i])) return i;
        return -1;
    }

    //判断两个顺序表是否相等（各对应元素相等，长度相同）
    public boolean euqals(Object obj){
        if(obj==this)
            return true;   //若引用同一个参数对象，则相等
        else if(obj instanceof SeqList<?>){
            SeqList<T> list=(SeqList<T>) obj;
            /*声明list，引用obj的实例（总不能后面每次用到obj和this作对比的时候前面都得加上（SqeList<T>吧，太麻烦了，所以干脆声明一个list））*/
            if(this.len==list.len){
                for(int i=0;i<this.len;i++){
                    if(!this.get(i).equals(list.get(i)))
                        return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }


    public static void main(String[] args) {
        SeqList list = new SeqList() ;


    }
}






