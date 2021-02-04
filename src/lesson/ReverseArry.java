package lesson;

// 不另加数组的情况下，进行翻转数组
public class ReverseArry {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 1, 7, 9};
        int [] res =reverse(arr) ;

        for (int i : res) {
            System.out.print(i+ " ");
        }
    }

    public static int []  reverse (int [] arr1) {
        int i = 0;
        int j = arr1.length - 1;
        int temp = 0;
        while (i < j) {
            temp = arr1[i];
            arr1[i] = arr1[j];
            arr1[j] = temp;
            i++;
            j--;
        }
        return arr1 ;
    }

}
