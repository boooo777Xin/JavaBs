import java.util.Random;

public class If4 {

    public static void main(String[] args) {
        
        //0 <= i < "()の中の数より小さい"の数字をランダムに返す。
        Random rmd = new Random();
        int i = rmd.nextInt(5);

        System.out.println("数字は" + i + "です");

        switch (i) {
            case 0:
            System.out.println("大吉");
            break;
            case 1:
            System.out.println("中吉");
            break;
            case 2:
            System.out.println("小吉");
            break;
            case 3:
            System.out.println("吉");
            break;
            default:
            System.out.println("凶");
            break;
        }
   }
}
