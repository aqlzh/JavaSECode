package lesson;

public class Lesson07_cfb {
    public static void main(String[] args) {
        String str = new String("");
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= i; j++) {
                str = str + '*';
            }
            str += '\n';
//            System.out.print(str);
        }
        System.out.print(str);
    }
}
