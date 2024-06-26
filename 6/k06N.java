class k06N {
    public static void main(String[] args) {
        // 第1問
        System.out.println("課題1");
        disp();
        System.out.println();

        // 第2問
        System.out.println("課題2");
        print_x(5);
        print_x(7);
        print_x(10);
        System.out.println();

        // 第3問
        System.out.println("課題3");
        System.out.println("5の2乗は"+ sq(5) );
        System.out.println("10の2乗は"+ sq(10) );
        System.out.println("20の2乗は"+ sq(20) );
        System.out.println();

        // 第4問
        System.out.println("課題4");
        System.out.println("3と5と7の合計は"+ sum3(3, 7, 5) );
        System.out.println("10と5と20の合計は"+ sum3(10, 5, 20) );
        System.out.println("10と20と30の合計は"+ sum3(10, 20, 30) );
        System.out.println();
    }

    static void disp(){
        System.out.println("難易度はNormalです"); 
    }

    static void print_x(int x){
        for(int i=1;i<=x;i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int sq(int x){
        return x * x;
    }

    static int sum3(int x,int y,int z){
        return x + y + z;
    }
}