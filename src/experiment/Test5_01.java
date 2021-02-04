package experiment;


   // String str = "31415926"  ;

public class Test5_01 {
    public static void main(String[] args) {
        String str = "31415926" ;
        // System.out.println((int)str.charAt(0)-(int)'0');
        // System.out.println(str.length());

        int [] res  = new int [str.length()] ;
        for (int i = 0; i <str.length() ; i++) {

            res[i] = (int)str.charAt(i)-(int)'0' ;
        }
//        for (int i : res) {
//            System.out.print(i + " ");
//        }
        System.out.println(sumFUN(res));
    }

    public static  int sumFUN(int [] res){
        int sum = 0 ;
        for (int i = 0; i <res.length ; i++) {
            sum+= res[i] ;
        }
        return  sum ;
    }


}
