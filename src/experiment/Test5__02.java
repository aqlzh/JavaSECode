package experiment;

public class Test5__02 {
    public static void main(String[] args) {
        int [] my_array = {1,2,5,5,6,6,7,2,9,2} ;

        int [] res = new int [my_array.length]  ;
        for (int i = 0; i <my_array.length ; i++) {
            for (int j = i+1; j <my_array.length ; j++) {
                if (my_array[i] == my_array[j]) {
                    System.out.print(my_array[i] + " " );
//                    int k = 0 ;
//                    res[k] = my_array[i] ;
//                    k++ ;
                }

            }
        }

//        for (int re : res) {
//            System.out.print(re + " ");
//        }

    }
    }

