package experiment;

import java.util.TreeSet;

public class Deduplication {
    public static void main(String[] args) {
        int[] data = new int[] {11,10,55,79,100,111,45,56,79,90,345,1000,1000};
        searchRepeatIndex(data);

        int [] res = new int [data.length] ;
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>() ;
        for (int i = 0; i < data.length; i++) {
            myTreeSet.add(res[i]) ;
            myTreeSet.remove(Index(data)) ;
         }

//        int[] desArray = new int[myTreeSet.size()];  //定义一个新数组，长度和myTreeSet一样
//        int count =0;     //计数
//        for(Integer xInteger:myTreeSet){  //增强for循环进行遍历
//            desArray[count++]=xInteger;
//            System.out.println(xInteger);  //得到的myTreeSet是去重和排序好的数组
//        }

        for (Integer integer : myTreeSet) {
           // System.out.println(myTreeSet.forEach(Integer);+ " " );
        }
    }

    //去重
    public static void searchRepeatIndex(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    System.out.println("第"+(i+1)+"个元素重复了");
                    break;//去掉这句可以查找重复次数
                }
            }
        }
    }

    public static int Index(int[] arr){
        int num =0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    //System.out.println("第"+(i+1)+"个元素重复了");
                    num = i+1 ;
                    break;//去掉这句可以查找重复次数
                }
            }
        }
        return num ;
    }


}
