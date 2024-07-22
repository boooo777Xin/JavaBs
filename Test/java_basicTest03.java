import java.util.Random;

class java_basicTest03 {
    public static void main(String[] args) {

        Random r = new Random();
        int tenki = r.nextInt(3);
        System.out.println("取得した値：" + tenki);

        System.out.print("今日の天気：");
        // if文ver
        if (tenki == 1) {
            System.out.print("曇り");
        } else if (tenki == 2) {
            System.out.print("雨");
        } else {
            System.out.print("晴れ");
        }

        // switch文ver
        switch (tenki) {
            case 1:
                System.out.print("曇り");
                break;
            case 2:
                System.out.print("雨");
                break;
            default:
                System.out.print("晴れ");
                break;
        }
    }
}