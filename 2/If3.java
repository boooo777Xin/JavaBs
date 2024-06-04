import java.util.Random;

public class If3 {

   public static void main(String[] args) {

    //0 <= i < "()の中の数より小さい"の数字をランダムに返す。
    Random rmd = new Random();
    int i = rmd.nextInt(5) ;

    System.out.println("数字は" + i + "です");

    if(i == 1){
        System.out.println("UR");
    } else if (i == 2){
        System.out.println("SSR");
    } else if (i == 3){
        System.out.println("SR");
    }else if (i == 4){
        System.out.println("R");
    } else {
        System.out.println("N");
    }
   }

}
