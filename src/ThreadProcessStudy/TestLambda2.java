package ThreadProcessStudy;

public class TestLambda2 {
    public static void main(String[] args) {
        ILove love = null;

        love = a -> System.out.println("i love you"+a);
        //调用
        love.love(520);
    }

}

// 定义一个接口
interface ILove{
    void love(int a);
}
//接口的实现类
//class Love implements ILove{
//
//    @Override
//    public void love(int a) {              简化
//        System.out.println("i love you-->"+a);
//    }
//}
