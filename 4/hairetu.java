import java.util.Random;

public class hairetu {

    public static void main(String[] args) {
        
        Random rm = new Random();
        int a,b,c;
        a = rm.nextInt(6)+1;
        b = rm.nextInt(6)+1;
        c = rm.nextInt(6)+1;

        //上を配列にしたらこうなります。
        //配列
        int i[] = new int[100];
        for(int j = 0 ; 0<100 ;j++){
            i[j] = rm.nextInt(6)+1;
        }

    }

}
