package DataStructures;

//  交集
public class P20_UnionSetFirst {
    public static void main(String[] args) {
        int []  a= {1,2,3,4} ;
        int [] b ={2,6,7} ;
        int [] result =unionset(a,b,a.length,b.length) ;


        for (int i = 0; i <a.length+b.length ; i++) {
            if(result[i] != -1){
                System.out.print(result[i]+" ");
            }
        }

    }


    public static int [] unionset(int [] a,int [] b,int La ,int Lb ){
        La = a.length ;
        Lb = b.length ;
        int index = Lb ;
        int arr [] = new int [La+Lb] ;

        for (int i = 0; i <La+Lb ; i++) {
            arr[i] = -1 ;
        }

        for (int i = 0; i <Lb ; i++) {
            arr[i] = b[i] ;
        }


        for (int i = 0; i <La ; i++) {
            Boolean flag = true ;
            for (int j = 0; j <Lb ; j++) {
                if(a[i]==b[j]){
                    flag = false ;
                }
            }
            if(flag){
                arr[index] =a[i] ;
                index++ ;
            }
        }


         return  arr ;
    }

}
