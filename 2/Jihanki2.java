public class Jihanki2 {

    public static void main(String[] args) {

        int coin = 980;
        int nedan = 160;
        int honsu = 2;

        if (coin < nedan * 2) {

            System.out.println("投入金額が" + (nedan * honsu - coin) + "円不足しています。");

        } else {

            int sagaku = coin - nedan * honsu;

            System.out.println("「飲み物を" + honsu + "本購入しました。" + "おつりは" + sagaku + "円です」");
            int maisu = sagaku / 500;
            System.out.print("返却硬貨は、");
            if (maisu != 0) {
                System.out.print("500円玉は" + maisu + "枚, ");
            }

            sagaku = sagaku % 500;
            maisu = sagaku / 100;
            if (maisu != 0) {
                System.out.print("100円玉は" + maisu + "枚, ");
            }

            sagaku = sagaku % 100;
            maisu = sagaku / 50;
            if (maisu != 0) {
                System.out.print("50円玉は" + maisu + "枚, ");
            }

            sagaku = sagaku % 50;
            maisu = sagaku / 10;
            if (maisu != 0) {
                System.out.print("10円玉は" + maisu + "枚」");
            }
        }
    }
}
