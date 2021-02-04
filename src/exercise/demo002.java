package exercise;

public class demo002 {

        public static void main(String args[]){
            int a[] = new int[10];
            System.out.println("10个随机整数为：");
            for(int i = 0; i < 10; i++){
                int random_num = (int)(Math.random() * 100 + 1);
                System.out.println(random_num);
                a[i] = random_num ;
            }
            System.out.println("经过从小到大排序，这10个随机整数为：");
            for(int i = 0; i < a.length; i++){
                for(int j = i + 1; j < a.length; j++){
                    if(a[i] > a[j]){
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            for(int i:a)
                System.out.println(i);
        }


}
