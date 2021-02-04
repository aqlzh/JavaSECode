package FileIo;

import java.io.*;
import java.util.HashMap;

public class TestInOut {
    public static void main(String[] args) throws IOException {
        HashMap<String,String>  map = new HashMap<>();
        //创建字符缓冲输入流对象,构造方法中绑定字符输入流
        BufferedReader br = new BufferedReader(new FileReader("D:\\JavaIdeaCode\\TestIO\\in.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\JavaIdeaCode\\TestIO\\out.txt"));

        String line ;
        while((line = br.readLine())!=null){
            //5.对读取到的文本进行切割,获取行中的序号和文本内容
            String[] arr = line.split("\\.");
            //6.把切割好的序号和文本的内容存储到HashMap集合中(key序号是有序的,会自动排序1,2,3,4..)
            map.put(arr[0],arr[1]);
        }

        for(String key : map.keySet()){
            String value = map.get(key);
            //8.把每一个键值对,拼接为一个文本行
            line = key + "." + value;
            //9.把拼接好的文本,使用字符缓冲输出流中的方法write,写入到文件中
            bw.write(line);
            bw.newLine();//写换行
        }
        //10.释放资源
        bw.close();
        br.close();
    }
}
