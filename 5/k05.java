public class k05 {

    public static void main(String[] args) {

        myname("吉武");

        System.out.println("--------------");
        disp_10();

        System.out.println("--------------");
        check_num(1);
        check_num(0);
        check_num(-1);

        System.out.println("--------------");
        max_num(1, 5);
        max_num(9, 5);

        System.out.println("--------------");
        max_num3(9, 5,1);
        max_num3(3, 6,1);
        max_num3(3, 6,7);

        System.out.println("--------------");
        prime_check(11);
        prime_check(8);


    }

    // １:自分の名前を出力
    public static void myname(String n) {
        System.err.println(n);
    }

    // 2:1~10を出力
    public static void disp_10() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 3:プラスマイナスの判定を出力
    public static void check_num(int x) {
        if (x < 0) {
            System.out.println(x + "はマイナスの数です");
        } else {
            System.out.println(x + "はプラスの数です");
        }
    }

    // 4:xとyの大きいほうを出力
    public static void max_num(int x, int y) {
        if (x < y) {
            System.out.println(y);
        } else {
            System.out.println(x);
        }
    }

    // 5:xとyとzの中から一番大きい数を出力
    public static void max_num3(int x, int y, int z) {
        int a[] = { x, y, z };
        int output = 0;
        for (int i = 0; i < a.length; i++) {
            if (output < a[i]) {
                output = a[i];
            }
        }
        System.out.println(output);
    }
    // 6:引数が素数かどうかの判定をして表示
    public static void prime_check(int x) {
        if (x < 2) {
            System.out.println(x + "は2未満の数です");
        } else {
            boolean hit = false;
            // 2~x未満の値で、xで割り切れる値があるか調べる
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    hit = true;
                }
            }
            if (hit) {
                System.out.println(x + "は素数ではありません");
            } else {
                System.out.println(x + "は素数です");
            }
        }
    }

    public static void max_num1(int x,int y) {
        /*どっち*/
        if (x>y) {
            System.out.println(x);
        }else System.out.println(y);
    }

}
