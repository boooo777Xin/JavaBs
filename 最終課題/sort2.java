
import java.util.Random;
class sort2{

		//バブルソート(隣同氏を交換しまくる)
	public static void main(String[] args){
		
		int data[] = new int[10];	// 使用する配列
		
		init(data);		// 配列の初期化
		disp(data);		// 配列の表示
		
		System.out.println("昇順にソート");
		
		sort_a(data);	// 昇順にソート
		disp(data);		// 配列の表示
		
		
		System.out.println("降順にソート");

		sort_b(data);	// 降順にソート
		disp(data);		// 配列の表示

	}

	
	// 要素数10の配列を昇順にソート
	static void sort_a(int array[]){
		
		//-- ここから記入 --//
		//配列の右端から順にjを1までカウントダウン
		for(int j = array.length - 1;j > 0;j--) {
			//配列の左端から順にiをj未満の間カウントアップ
			for(int i=0;i < j;i++) {
				//i番目の値がi+1番目の値より大きい(昇順でない)場合、配列の中身を入れ替える
				if (array[i] > array[i+1]) {
					int w = array[i+1];
					array[i+1] = array[i];
					array[i] = w;
				}
			}
		}
		//-- ここまで記入 --//
	}

	// 要素数10の配列を降順にソート
	static void sort_b(int array[]){
		
		//-- ここから記入 --//
		//配列の右端から順にjを1までカウントダウン
		for(int j = array.length - 1;j > 0;j--) {
			//配列の左端から順にiをj未満の間カウントアップ
			for(int i=0;i < j;i++) {
				//i番目の値がi+1番目の値より小さい(降順でない)場合、配列の中身を入れ替える
				if (array[i] < array[i+1]) {
					int w = array[i+1];
					array[i+1] = array[i];
					array[i] = w;
				}
			}
		}
		//-- ここまで記入 --//
	}		
	
	
	// 配列を0～99の乱数で初期化する処理
	static void init(int array[]){
		Random random = new Random();
		for(int i=0;i<10;i++){
			array[i]=random.nextInt(99);
		}
	}

	// 引数で渡された配列を表示する
	static void disp(int array[]){
		for(int i=0;i<10;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println("\n\n");
	}
	

}
