package lesson;

public class su_shu {
    public static void main(String[] args) {
        for (int i = 2; i <= 100 ; i++) {
            int j = 2 ;

            while (i % j != 0){
                j++ ;
            }
            if(j != i){
                System.out.print(i + " ");
            }
        }
    }
}
