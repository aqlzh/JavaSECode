package FileIo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        test();
    }

    private static void test() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("D:\\JavaIdeaCode\\TestIO\\test2.txt"));
// 如出现拒绝访问的异常则说明，可能写成了D:\JavaIdeaCode\TestIO
        Set<String> set = prop.stringPropertyNames() ;
        // 增强for循环
        for (String s : set) {
            String value = prop.getProperty(s);
            System.out.println(s+"="+value);

        }
    }

}
