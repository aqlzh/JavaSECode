package lesson;

public class Lesson_06_Demo {

        public static void  work(int work,Integer[][] arr,int daynum){
            int b = 0;
            int k = 1;
            while( b<5) {
                for (int i = 0; i <= 6; ++i,work++) {
                    arr[i][k] = work;
                    System.out.printf("  %6d",arr[i][k]);
                    if (work>=daynum){
                        break;
                    }
                }
                k++;
                System.out.println();
                b++;
                if (work>=daynum){
                    break;
                }
            }
        }

}
