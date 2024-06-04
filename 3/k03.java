public class k03 {

    public static void main(String[] args) {

        for (int i = 6; i > 5; i++) {
            System.out.println("吉武");
        }

        // (例1) cnt を1から10まで，1ずつ増やして表示する
        for (int cnt = 1; cnt <= 10; cnt++) {
            System.out.println(cnt);
        }

        // (例2) cnt を10から0まで，1ずつ減らして表示する
        for (int cnt = 10; cnt >= 0; cnt--) {
            System.out.println(cnt);
        }

        // (例3) cnt を1から20まで，2ずつ増やして表示する
        for (int cnt = 1; cnt <= 20; cnt = cnt + 2) {
            System.out.println(cnt);
        }
    }
}
