package base;

        import java.util.Scanner;

public class Scannner_07 {
    public static void main(String[] args) {
        // 创建一个扫描对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in) ;

        System.out.println("请输入数据将使用next接收");

        // 判断用户有没有输入字符
        if(scanner.hasNext()){
            // 输入数字

            int num = scanner.nextInt() ;
            System.out.println("输入的数字是"+num);
            // 使用next接受(输入字符串)
            String str = scanner.next() ;
            System.out.println("输入的字符串内容为"+str);
        }

        System.out.println("_______");

        // 进行赋初值
        int i=0;
        float f = 0.0f ;

        System.out.println("请输入整数");

        if(scanner.hasNextInt()){
            i =scanner.nextInt() ;
            System.out.println("整数数据"+i);
        }else{
            System.out.println("输入的不是整数数据");
        }

        System.out.println("请输入小数");

        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("小数数据"+f);
        }else{
            System.out.println("输入的不是小数数据");
        }


        // 凡是属于IO流，要及时关闭，否则占用资源
        scanner.close() ;
    }
}
