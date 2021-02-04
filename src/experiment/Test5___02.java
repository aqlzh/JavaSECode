package experiment;

import java.util.Arrays;

public class Test5___02 {

        public static void main(String[] args) {
            int[] my_array = {1,2,5,5,6,6,7,2,9,2};
            //1 2 2 2 5 5 6 6 7 9
            Arrays.sort(my_array);
//            for (int i : my_array) {
//                System.out.print(i + " ");
//            }
            System.out.println();
            for (int i = 0; i < my_array.length - 1; i++) {
                if (my_array[i] == my_array[i+1]) {
                    System.out.print(my_array[i] + " ");

                    for (int j = i+2; j < my_array.length; j++) {   // 滑动优化算法
                        if (my_array[i] != my_array[j]) {
                            i = j - 1;
                            break;
                        }
                    }
                }
            }
        }

}
