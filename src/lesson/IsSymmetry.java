package lesson;

public class IsSymmetry {
    public static void main(String[] args) {
        System.out.println(fun("ABA"));
        System.out.println(fun("ABAB"));
        System.out.println(fun("b"));
        System.out.println(fun("bc"));
    }

    public static boolean fun (String s) {
        if (s == null){
            return  false ;
        }
        if(s.equals("") || s.length() ==1){
            return  true ;
        }
        for (int i = 0; i <s.length()/2 ; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return  false ;
            }
        }
        return  true ;
    }
}
