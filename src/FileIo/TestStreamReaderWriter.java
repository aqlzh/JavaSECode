package FileIo;

import java.io.*;

// 转换文件编码
public class TestStreamReaderWriter {
    public static void main(String[] args) throws IOException {
        //1.创建InputStreamReader对象,构造方法中传递字节输入流和指定的编码表名称GBK
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\JavaIdeaCode\\TestIO\\我是GBK格式的文本.txt"),"gbk");
        //2.创建OutputStreamWriter对象,构造方法中传递字节输出流和指定的编码表名称UTF-8
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\JavaIdeaCode\\TestIO\\我是utf_8格式的文件.txt"),"UTF-8");

        int len = 0;
        while((len = isr.read())!=-1){
            //4.使用OutputStreamWriter对象中的方法write,把读取的数据写入到文件中
            osw.write(len);
        }
        //5.释放资源
        osw.close();
        isr.close();
    }
}
