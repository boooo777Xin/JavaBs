public class k03N {

    public static void main(String[] args) {

        // ①
        int cnt = 1;
        while (cnt <= 10) {
            System.out.print(cnt + " ");
            cnt++;
        }
        // ②
        System.out.println("");
        cnt = 10;
        while (cnt >= 1) {
            System.out.print(cnt + " ");
            cnt--;
        }
        // ③
        System.out.println("");
        cnt = 2;
        while (cnt <= 20) {
            System.out.print(cnt + " ");
            cnt = cnt + 2;
        }
        // ④
        System.out.println("");
        cnt = 1;
        for (cnt = 1; cnt <= 20; cnt = cnt + 2) {
            System.out.print(cnt + " ");
        }
        // ⑤
        System.out.println("");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
        // ⑥
        System.out.println("");
        for (int i = 1; i <= 5; i++) {
            int j = 1;
            while(j <= 5){
                System.out.print(i);
                j++;
            }
            j = 1;
            System.out.println("");
        }
    }
}
