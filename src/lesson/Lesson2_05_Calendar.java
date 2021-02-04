package lesson;

import java.util.Scanner;

public class Lesson2_05_Calendar {

        public static int getMonthOfDays(int year, int month){
            int days=31;
            if(month==2 && isLeapYear(year)){
                days = 29;
            }else if(month==2 && !isLeapYear(year))
            {
                days =28;
            }else if(month ==4 || month==6 ||month==9||month==11)
            {
                days=30;
            }else{
                days=31;
            }
            return days;

        }

        public static boolean isLeapYear(int year){
            if(year%4==0&&year%100!=0 || year%400==0)
                return true;
            else
                return false;
        }



        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("请输入年份月份");
            int year = in.nextInt();
//            System.out.println("请输入月份");
            int month = in.nextInt();
            //第一步：统计从1900到year年总天数
            int sum=0;
            for (int y = 1900; y < year; y++) {
                if (isLeapYear(y))
                    sum = sum + 366;
                else
                    sum = sum + 365;
            }

            //第二步：统计第year年里从1月到month-1月总天数
            for(int i=1;i<month;i++){
                sum = sum + getMonthOfDays(year,i);
            }//end of for

            //第三步：计算第month月的天数
            int dayOfMonth=getMonthOfDays(year,month);

            sum=sum+1;

//            System.out.println("星期" + sum%7);

            int space=sum%7;

//            System.out.println(space);

            //第month月1号是星期几

            int x = getMonthOfDays(year,month) ;
            System.out.println();
            System.out.println();
            System.out.println("\t\t"+year+"年"+"\t"+month+"月");
            System.out.println("___________________________");
            System.out.println("日\t一\t二\t三\t四\t五\t六");

            //第四步：显示第year年，第month月的日历
            //补充显示日历的代码

            for (int i = 1; i <= space ; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= x ; i++) {

                if( (space+i-1)%7==0){
                    System.out.println();
                }
                System.out.print(i+"\t");
            }

        }

}
