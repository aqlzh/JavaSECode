package other;

import java.util.Scanner;

class Student {
    private String name=" ";
    private String number=" ";
    private double[] score=new double[4];
    private int t=0;//用于表示当前下表的数组中是否储存了数据
    //构造函数
    public Student(String name,String number,double [] score) {
        this.name=name;
        this.number=number;
        int i=0;
        for(i=0;i<4;i++) {
            this.score[i]=score[i];
        }
    }

    public Student() {
    }
    //普通方法

    public int i=0,j,num=0;int k;
    Scanner in=new Scanner(System.in);
    public void create (Student[] st) {

        if(num>20)
            System.out.println("内存已满，无法创建！");
        else{
            for(i=0, k=0;i<20&&i==k;i++,k++){
                if(st[i].t==0){
                    System.out.println("输入新的学生信息：");
                    System.out.printf("name=");st[i].name=in.nextLine();
                    System.out.printf("number=");st[i].number=in.nextLine();
                    for(j=0;j<4;j++){
                        System.out.printf("score["+j+"]=");
                        st[i].score[j]=in.nextDouble();
                    }
                    in.nextLine();
                    st[i].t=1;
                    k++;
                }



            }
            num++;
        }

    }
    public void delete(Student[]st){

        System.out.println("输入要删除的学生学号：");
        String n=in.nextLine();
        for(i=0;i<20;i++){
            if(st[i].number.equals(n)&&st[i].t==1){
                System.out.println("已找到该学生的信息并对其进行删除：");
                st[i].number=" ";
                st[i].t=0;
            }
            else{
                if(i==19){
                    System.out.println("找不到该学生的信息！");
                }
                else{
                    continue;
                }
            }
            break;
        }
        num--;
    }
    public double aver(Student []st) {
        double total = 0;

        System.out.println("输入要计算成绩的学生学号：");

        String n=in.nextLine();

        for(i=0;i<20;i++) {
            if(st[i].number.equals(n)&&st[i].t!=0) {
                for(j=0;j<4;j++){
                    total+=st[i].score[j];
                }
            }
            else{
                if(i==19){
                    System.out.println("找不到该学生的信息！");
                }
                else{
                    continue;
                }

            }
            break;

        }
        System.out.println("平均成绩="+total/4);

        return total/4;
    }



    public void find(Student st[]) {

        System.out.println("输入要查找的学生学号：");
        String n=in.nextLine();
        for(i=0;i<20;i++){
            if(st[i].number.equals(n)&&st[i].t!=0){
                System.out.println("该学生信息为：");
                System.out.println("name="+st[i].name);
                System.out.println("number="+st[i].number);
                for(j=0;j<4;j++)
                    System.out.println("score["+j+"]="+st[i].score[j]);
                break;
            }
            else{
                if(i==19){
                    System.out.println("找不到该学生的信息！");
                }
                else{
                    continue;
                }
            }
        }
    }

    public void change(Student[] st) {
        String n=in.nextLine();
        for(i=0;i<20;i++){
            if(st[i].t!=0&&st[i].number.equals(n)){
                System.out.println("已找到该学生信息，并对其进行修改");
                System.out.printf("name=");st[i].name=in.nextLine();
                System.out.printf("number=");st[i].number=in.nextLine();
                for(j=0;j<4;j++){
                    System.out.printf("score["+j+"]=");
                    st[i].score[j]=in.nextDouble();
                }
                in.nextLine();
            }
            else{
                if(i>=19)
                    System.out.println("找不到该学生的信息！");
                else
                    continue;
            }
        }
    }
}



public class Student_manage {

    public static void main(String[]args) {
        boolean n=true;int serial;
        Scanner sc=new Scanner(System.in);
        Student stu1=new Student();
        Student[] stu =new Student[20];
        for (int i = 0; i <20 ; i++) {
             stu[i]=new Student();
        }

        while(n){
            System.out.printf("\n**********************************************");
            System.out.printf("\n*               进程演示系统                 *");
            System.out.printf("\n**********************************************");
            System.out.printf("\n     1.输入新的学生信息          2.查找学生信息");
            System.out.printf("\n     3.计算学生的平均成绩        4.删除学生信息");
            System.out.printf("\n     5.更改学生的信息           6.退出系统");
            System.out.printf("\n**********************************************");
            System.out.printf("\n请选择(1～6):");
            serial=sc.nextInt();
            switch(serial)
            {
                case 1: stu1.create(stu);stu1.i++; break;
                case 2 :stu1.find(stu); break;
                case 3 :stu1.aver(stu);break;
                case 4 :stu1.delete(stu);break;
                case 5 :stu1.change(stu);break;
                case 6 :n=false;break;
                //default: n=false;break;

            }
        }
    }

}
