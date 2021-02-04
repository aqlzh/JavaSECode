package DataStructures;

public class Intersection {

    public static void main(String[] args) {
        int [] a = {1,2,3,4,6} ;
        int [] b = {2,3,5,6} ;
        int [] result =inter(a,b) ;    // 2,3,0,0
        for (int i : result) {
            System.out.print(i+ " ");
        }

    }

    public static int [] inter(int [] a,int [] b){
        int  index = 0 ;
        int ml = a.length>b.length ? a.length : b.length ;
        int [] arr = new int[ml] ;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if(a[i]==b[j]){
                    arr[index] =a[i] ;
                    index++ ;
                }
            }
        }
        int [] arr1 = new int [index] ;
        for (int i = 0; i < index; i++) {

            arr1[i] = arr[i] ;

        }
        return arr1 ;
    }

}
