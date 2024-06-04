public class k02Ex {

    public static void main(String[] args) {

        int y ,m ,d;
        y = 2100;
        m = 12;
        d = 31;

        // 超追加課題
		// 第9問
		int errCnt = 0;
		if (y < 1) {
			System.out.println("年の入力が正しくありません");
			errCnt = errCnt + 1;
		}
		if (m < 0 || m > 12) {
			System.out.println("月の入力が正しくありません");
			errCnt = errCnt + 1;
		}


        int endDay = 31; // 月末日
		switch(m) {
			// 2月の場合
			case 2:
			if ( y % 400 == 0) {
				endDay = 29;
			} else if ( y % 100 == 0) {
				endDay = 28;
			} else if ( y % 4 == 0) {
				endDay = 29;
			} else {
				endDay = 28;
			}
			break;
			// 4,6,9,11月(月末日が30日)の場合
			case 4:
			case 6:
			case 9:
			case 11:
			endDay = 30;
			break;
			// 上記以外の場合(月末日が31日)
			default:
		}
		if (d < 1 || d > endDay) {
			System.out.println("日の入力が正しくありません");
			errCnt = errCnt + 1;
		}
		if (errCnt == 0) {
			System.out.println("年月日の入力は正しいです");
		}
        
    }

}
