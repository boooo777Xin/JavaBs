import java.util.Random;

public class method2 {

    public static void main(String[] args) {

        //ほかのクラスから引っ張ってくるメソッド
        Random rmd = new Random();
        int x = rmd.nextInt(100);
        int y = rmd.nextInt(100);
        
        //記述クラス配下のメソッド
        int z = max(x, y);
        System.out.println(z);
    }

    public static int max(int a, int b) {

        if (a < b) {
            return b;
        } else {
            return a;
        }
    }
}
