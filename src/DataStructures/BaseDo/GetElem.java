package DataStructures.BaseDo;

public class GetElem {
    public GetElem(int i) {
    }

    public static void main(String[] args) {
        int [] a= {1,3,4,6,8,9} ;
        // 主函数测试·
        System.out.println(Elem(a,3));
    }
    public static int Elem(int [] arr,int n){

        return  arr[n] ;
    }
}
