public class k02 {

    public static void main(String[] args) {
        int y ,m ,d;
        y = 2100;
        m = 12;
        d = 31;

        System.out.println( y + "年" + m + "月" + d + "日");
        //yの今年かどうかチェック
        if(y == 2024){
            System.out.println("今年です");
        }else{
            System.out.println("今年じゃないです。");
        }
        //mの前後チェック
        if(m <= 6){
            System.out.println("前半です");
        } else{
            System.out.println("後半です");
        }
        //dの偶奇チェック
        if(d % 2 == 0){
            System.out.println("偶数です");
        } else{
            System.out.println("奇数です");
        }
        //mとdの比較
        if(m > d){
            System.out.println("mが大きい");
        } else if(m < d){
            System.out.println("dが大きい");
        } else {
            System.out.println("同じです");
        }
        //月の入力チェック、12以下かつ0じゃない = 正しい
        if(m != 0 && m <= 12 ){
            System.out.println("月の入力は正しいです");
        } else {
            System.out.println("月の入力が正しくありません");
        }
        //-----以下追加課題------
        //四季チェック
        if(m == 3|| m == 4 || m == 5){
            System.out.println("春です。");
        } else if(m == 6|| m == 7 || m == 8){
            System.out.println("夏です。");
        } else if(m == 9|| m == 10 || m == 11){
            System.out.println("秋です。");
        } else if(m == 12|| m == 1 || m == 2){
            System.out.println("冬です。");
        }
        //うるう年チェック
        if((y % 4 != 0) || 
          ((y % 4 == 0) && (y % 100 == 0) && (y % 400 != 0))){
            System.out.println("うるう年ではない");
        } else {
            System.out.println("うるう年です。");
        }
        //switch文による月の別名判定※参考程度に、書かなくてよし
        switch (m) {
            case 1:
            System.out.println("睦月");
            break;
            case 2:
            System.out.println("如月");
            break;
            case 3:
            System.out.println("弥生");
            break;
            case 4:
            System.out.println("卯月");    
            break;
            case 5:
            System.out.println("皐月");
            break;
            case 6:
            System.out.println("水無月");
            break;
            case 7:
            System.out.println("文月");
            break;
            case 8:
            System.out.println("葉月"); 
            break;
            case 9:
            System.out.println("長月");
            break;
            case 10:
            System.out.println("神無月");
            break;
            case 11:
            System.out.println("霜月");
            break;
            case 12:
            System.out.println("師走"); 
            break;
            default:
            System.out.println("そんな月はないです");
            break;
        }
    }
}
