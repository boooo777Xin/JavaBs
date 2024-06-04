public class If2 {

    public static void main(String[] args) {
        
        String id = "吉武 凌我";
        int pw  = 19970731;

        //&&　一致したとき
        if(id == "吉武 凌我" && pw == 19970731){

            System.out.println("ログイン");

        //||　どっちかが一致しなかったとき
        } else if (id != "吉武 凌我" || pw != 19970731){

            System.out.println("ユーザー名かパスワードが違います");

        } 
    }
}
