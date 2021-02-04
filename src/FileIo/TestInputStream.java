package FileIo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class TestInputStream {
    public static void main(String[] args) throws IOException {
        //创建FileInputStream对象,构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("D:\\JavaIdeaCode\\TestIO\\test.txt");
        //使用FileInputStream对象中的方法read读取文件

        //int read(byte[] b) 从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
        byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(Arrays.toString(bytes));//[65, 66]
        System.out.println(new String(bytes));//AB

        len = fis.read(bytes);
        System.out.println(len);//2
        System.out.println(new String(bytes));//CD

        len = fis.read(bytes);
        System.out.println(len);//1
        System.out.println(new String(bytes));//ED

        len = fis.read(bytes);
        System.out.println(len);//-1
        System.out.println(new String(bytes));//ED


        System.out.println("=========");
        /*
            发现以上读取时一个重复的过程,可以使用循环优化
            不知道文件中有多少字节,所以使用while循环
            while循环结束的条件,读取到-1结束
         */


//        byte[] bytes2 = new byte[1024];//存储读取到的多个字节
//        int len =0 ; //记录每次读取的有效字节个数
//        while((len = fis.read(bytes2))!=-1){
//            //String(byte[] bytes, int offset, int length) 把字节数组的一部分转换为字符串 offset:数组的开始索引 length:转换的字节个数
//            System.out.println(new String(bytes2,0,len));
//        }

        //释放资源
        fis.close();
    }
}
