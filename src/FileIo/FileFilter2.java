package FileIo;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class FileFilter2 {
    public static void main(String[] args) {
        File file=new File("D:\\GitFile");
        getAllFileName2(file);
    }

    public static void getAllFileName(File file){
        //FileFilter
        File[] files = file.listFiles(new FileFilter() {//过滤器匿名内部类 实现accept方法
            @Override
            public boolean accept(File pathname) {
                //过滤规则,pathname是文件夹或者是.java结尾的文件返回true
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });
        for (File f1 : files) {
            //System.out.println("B==="+f1);
            if(f1.isDirectory()){
                getAllFileName(f1);//递归
                //System.out.println("C==="+f1);
            }else {
                System.out.println(f1);
            }
        }
    }

    public static void getAllFileName2(File file){
        //FilenameFilter
        File[] files = file.listFiles(new FilenameFilter() {//过滤器匿名内部类 实现accept方法
            @Override
            public boolean accept(File dir, String name) {
                //过滤规则,dir+name是文件夹或者是.java结尾的文件返回true
                return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });
        for (File f1 : files) {
            //System.out.println("B==="+f1);
            if(f1.isDirectory()){
                getAllFileName(f1);//递归
                //System.out.println("C==="+f1);
            }else {
                System.out.println(f1);
            }
        }
    }
}
