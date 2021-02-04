package lesson;

public class Lesson2_04 {

    // 实现换行  输出1~1000素数
 public static void main(String[] args) {
        int prCount = 0 ;
        int line = 10 ;
        for (int i = 2; i < 1000; i++) {
            int count = 0 ;
            for (int j = 1; j <= i ; j++) {
                if(i%j==0){
                    count ++  ;    // 实现原理只能有两个数被整除
                }
            }

            if(count ==2){
                System.out.print(i+"\t");
                prCount ++ ;
            }
            if(prCount == line){     // 控制行数
                prCount = 0 ;
                System.out.println();
            }
        }
    }
}
