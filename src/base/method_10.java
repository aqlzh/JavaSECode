package base;

public class method_10 {
    public static void main(String[] args) {

         // 方法
        int sum = add(1,2) ;
        System.out.println(sum);

        // 命令行传参
        for (int i = 0; i <args.length ; i++) {
            System.out.println("args["+i+"]:"+args[i]);
        }

        // 可变参数
        method_10 method_10 =new method_10() ;
        method_10.test(1,2,3,45,6);

    }

            public static int add(int a,int b){
                return a+b ;
            }


            public void test(int... i){
                System.out.println(i);
                System.out.println(i[0]);
            }

    }

