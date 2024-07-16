class java_basicTest04 {
    public static void main(String[] args) {
        int even = 8;
        int odd = 5;
        // 変数evenの内容について判定
        if (isEvenCheck(even) == 1) {
            System.out.println(even + "は偶数です。");
        } else {
            System.out.println(even + "は奇数です。");
        }

        // 変数oddの内容について判定
        if (isEvenCheck(odd) == 1) {
            System.out.println(odd + "は偶数です。");
        } else {
            System.out.println(odd + "は奇数です。");
        }

    }

    // 引数numの中身が偶数なら1、奇数なら0を返却するメソッド
    static int isEvenCheck(int num) {
        int result = 0;
        if (num % 2 == 0) {
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }
}