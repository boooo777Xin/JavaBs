public class Jihankiex {

    public static void main(String[] args) {
        
        int sumKingaku =1990;
        int nedan = 160;
        int honsu = 2;
        
        int sagaku = sumKingaku - nedan * honsu;

        System.out.println("「飲み物を"+ honsu +"本購入しました。" + "おつりは" + sagaku + "円です」");

        int[] coins = {500,100,50,10};
        int coin; 
        int maisu;
        String result = "「返却硬貨は、";
        for(int i = 0 ; i < coins.length ; i++){

            coin = coins[i];
            maisu = sagaku / coin;
            sagaku = sagaku % coin; 

            result = result + coin+ "円玉は" + maisu + "枚";

            if (coin != 10) {
                result = result + "、";
            } else{
                result = result + "」";
            }
        }
        System.out.println(result);

    }
}
