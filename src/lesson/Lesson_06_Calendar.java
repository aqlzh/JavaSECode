package lesson;

import java.util.Scanner;

public class Lesson_06_Calendar {

    public static  int week(int year,int month , int day){
            if (month==1||month==2){
                year = year-1;
                month = month + 12;
            }
            int weeks = (day + 2*month + 3*(month+1)/5 + year + year/4 - year/100 +year/400) % 7;//星期一是0，以此后推
            return weeks;
        }
        public static void main(String[] args) {
            int weeks;
            Scanner years = new Scanner(System.in);
            int year = years.nextInt();
            int month = years.nextInt();
            //int day = years.nextInt();
            Integer[][] arr;
            arr = new Integer[7][6];
            int daynum = 0;
            if (month == 1||month == 3||month == 5||month == 7||month == 8||month == 10||month == 12){
                daynum = 31;
            }else if (month ==4||month == 6||month == 9||month == 11){
                daynum = 30;
            }else if (month == 2 &&(year%100==0)&&year%400!=0){
                daynum = 28;
            }else if (month == 2 &&(year%4==0)||year%400==0){
                daynum = 29;
            }
            weeks = week(year,month,1);
            System.out.println("     星期一  星期二   星期三   星期四   星期五   星期六   星期日");
            int  work=1;
            for (int i = 0, j =1; i <= 6; i++) {
                if (i < weeks){
                    arr[i][0]= null;
                    System.out.print("        ");
                }else {
                    arr[i][0] = j;
                    j++;
                    work ++;
                    System.out.printf( "  %6d",arr[i][0]);
                }

            }
            System.out.println();
            Lesson_06_Demo.work(work,arr,daynum);
        }


}
