package lesson;

// 实现在表中插入数据
public class ListInsert {
    // 插入函数
    public static long[] insert(long[] arr, int i, long l) {
        //新建数组,对原数组扩容
        long[] arr1 = new long[arr.length + 1];
        //将原数组数据赋值给新数组
        for (int j = 0; j < arr.length; j++) {
            arr1[j] = arr[j];
        }
        //将大于i的数据向后移动一位   j 为原数组中最后一个
        for (int j = arr1.length - 2; j > i; j--) {
            arr1[j + 1] = arr1[j];
        }

        //赋值到i位置
        arr1[i + 1] = l;
        return arr1;
    }

    //测试
    public static void main(String[] args) {
        long[] arr = {12, 25, 11, 36, 14};
        long[] arr1 = insert(arr, 3, 100);
        for (long l : arr1) {
            System.out.print(l + " ");
        }
    }
}