package FileIo;

import java.io.FileInputStream;

public class Read {

        public static void main(String[] arge) throws Exception{
            FileInputStream in = new FileInputStream("D:\\test.txt");
            int b=0;
            while((b=in.read()) !=-1){
                System.out.print((char)b);
            }
            in.close();

    }

}
