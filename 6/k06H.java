class k06H {
    public static void main(String[] args) {
        // 第1問
        System.out.println("課題1");
        check(5);
        check(10);
        check(15);
        System.out.println();

        // 第2問
        System.out.println("課題2");
        print_x(7);
        print_x(-7);
        print_x(-10);
        System.out.println();

        // 第3問
        System.out.println("課題3");
        System.out.println("1～5までの合計は"+ sum_x(5) );
        System.out.println("1～10までの合計は"+ sum_x(10) );
        System.out.println("1～20までの合計は"+ sum_x(20) );    
    }

    static void check(int x){
        if(x % 2 == 0) {
            System.out.println("偶数です");
        } else {
            System.out.println("奇数です");
        }
    }

    static void print_x(int x){
        if(x>=0) {
            for(int i=0;i<=x;i++) {
                System.out.print(i + " ");
            }
        } else {
            for(int i=0;i>=x;i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static int sum_x(int x) {
        int sum = 0;
        for(int i=1;i<=x;i++) {
            sum += i;
        }
        return sum;
        // 別解(再帰を使ったやり方)
        // if (x == 1) {
        //     return 1;
        // }
        // return x + sum_x(x - 1);
    }
}