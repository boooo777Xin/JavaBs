class k03H {
    public static void main(String[] args) {
        // 第1問
        System.out.println("第1問");
        // while文を使用し、1から20まで表示せよ。
        // なお、その際5で割り切れる数値を表示した後に改行を入れること
        int cnt1 = 1;
        while (cnt1<=20) {
            System.out.print(cnt1 + " ");
            if (cnt1%5 == 0) {
                System.out.println();
            }
            cnt1++;
        }
        System.out.println();

        // 第2問
        System.out.println("第2問");
        // for文を使用し、1から30まで表示せよ。
        // ただし、3の倍数のみ表示をしないこと
        // その際、continue文を使用すること
        for (int cnt2=1;cnt2<=30;cnt2++) {
            if (cnt2%3==0) {
                continue;
            }
            System.out.print(cnt2 + " ");
        }
        System.out.println();
        System.out.println();

        // 第3問
        System.out.println("第3問");
        // for文を2つ使用し2重ループをさせ、以下の表示をせよ
        // 12345
        // 12345
        // 12345
        for (int i=1;i<=3;i++) {
            for (int j=1;j<=5;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // 第4問
        System.out.println("第4問");
        // for文を2つ使用し2重ループをさせ、以下の表示をせよ
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for (int i=1;i<=5;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}