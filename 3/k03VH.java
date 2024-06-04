import java.util.Scanner;
class k03VH {
    public static void main(String[] args) {
        // 第1問
        System.out.println("第1問");
        // while文を使用し、1から順番に表示をしていく。
        // その際に3の倍数の個数をカウントし、
        // 10個目の3の倍数が表示された後に繰り返しを終了するようにせよ。
        int cnt1 = 1;
        int cnt3bai = 0;
        while (cnt3bai<10) {
            System.out.print(cnt1 + " ");
            if (cnt1%3 == 0) {
                cnt3bai++;
            }
            cnt1++;
        }
        System.out.println();

        // 第2問
        System.out.println("第2問");
        // FizzBuzz
        for (int i = 1;i<=30;i++) {
            if ((i%3 == 0) && (i%5 == 0)) {
                System.out.print("FizzBuzz ");
            } else if (i%3 == 0) {
                System.out.print("Fizz ");
            } else if (i%5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // 第3問
        System.out.println("第3問");
        // for文を2つ使用し2重ループをさせ、以下の表示をせよ
        //     1
        //    12
        //   123
        //  1234
        // 12345
        for (int i=1;i<=5;i++) {
            for (int j=5;j>0;j--) {
                if (j>i) {
                    System.out.print(" ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        System.out.println();

        // 追加課題
        System.out.println("追加課題");
        Scanner sc = new Scanner(System.in);
        int lineCnt;
        while(true) {
            System.out.print("行数入力 : ");
            lineCnt = sc.nextInt();     // 行数を変数に代入
            if (lineCnt % 2 == 1) {
                break;//奇数が入力されたらwhileループを抜ける
            }
            System.out.println("行数は奇数で入力してください");
        }
        int halfCnt = lineCnt / 2 + 1;  // 中間の行番号を変数に代入
        // 前半部分(中間行まで)の出力
        for(int i = 1;i<=halfCnt;i++){
            int k = (i - 1) * 2 + 1;//@印字個数
            int s = lineCnt / 2 + 1 - i;  //@印字前の半角スペース個数
            for (int j = 1;j<=lineCnt;j++){
                if (s > 0) {
                    System.out.print(" ");
                    s--;//1個出力したのでスペース個数を引く
                } else if (k > 0) {
                    System.out.print("@");
                    k--;//1個出力したので@印字個数を引く
                }
            }
            System.out.println();
        }
        // 後半部分(中間行より後)の出力
        for(int i = 1;i<=(lineCnt-halfCnt);i++){
            int k = lineCnt - (2 * i);//@印字個数
            int s = i;  //@印字前の半角スペース個数
            for (int j = 1;j<=lineCnt;j++){
                if (s > 0) {
                    System.out.print(" ");
                    s--;//1個出力したのでスペース個数を引く
                } else if (k > 0) {
                    System.out.print("@");
                    k--;//1個出力したので印字個数を引く
                }
            }
            System.out.println();
        }
    }
}