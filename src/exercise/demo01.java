package exercise;

import java.util.ArrayList;

public class demo01 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        for(int i=200;i<=1000;i++){
            int j=2;
            while(i%j!=0){
                j++;
            }
            if(j==i){
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {

            if(i<list.size()-1){
                System.out.print(list.get(i)+",");
            }else {
                System.out.print(list.get(i));
            }

        }

    }
}
