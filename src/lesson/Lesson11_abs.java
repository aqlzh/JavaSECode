package lesson;

public class Lesson11_abs {
    public static void main(String[] args) {
        System.out.println(fun(-3));
        System.out.println(getchar());
        int a = 10 ;
    }

    public static  int fun(int a){
        if(a > 0){
            return  a ;
        } else  {
            return  -a  ;
        }
    }

    public  static  char getchar(){
//          int i = (int) Math.round(Math.random()*26) ;
//          int j = (int) 'a' + i ;
//          char ch = (char) j ;
//          return  ch ;

          char a = (char) ((int) (Math.random()*26)+97) ;
          return  a ;
    }

}
