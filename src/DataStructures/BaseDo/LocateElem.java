package DataStructures.BaseDo;

public class LocateElem {
    public static void main(String[] args) {
        int [] a = {2,3,4,5}   ;
        System.out.println( compare(a,5) );
    }

   public static int compare(int [] a, int i){
       for (int j = 0; j <a.length ; j++) {
           if(a[j]==i){
               return  j ;
           }
       }
         return  0 ;
   }
}
