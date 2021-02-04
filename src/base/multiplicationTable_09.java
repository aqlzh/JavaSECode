package base;

public class multiplicationTable_09 {

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {   // 控制外层
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+(j*i)+"\t");

            }
            System.out.println();
        }

        // 打印五角星   注意可以使用debug方法观察过程

        for (int a = 1; a < 5; a++) {
            for (int b = 1; b > a; b--) {
                System.out.print(" ");
            }
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
