import java.util.Random;

class marge_sort {

	// -- 関数を作成する場合はここから --//
	// 二つの配列の内容を一つの配列にする処理
	public static void main(String[] args) {

		int data[] = new int[20]; // 使用する配列
		int a[] = new int[10]; // 使用する配列
		int b[] = new int[10]; // 使用する配列

		// 配列を0で初期化
		for (int i = 0; i < 20; i++) {
			data[i] = 0;
		}

		init(a); // 配列の初期化
		init(b); // 配列の初期化

		// 配列の表示
		System.out.print("配列a : ");
		disp10(a);

		// 配列の表示
		System.out.print("配列b : ");
		disp10(b);

		// -- main関数の作成はここから --//
		data = marge(a, b); // margeメソッドを呼び出して、作成した昇順の統合版配列をdataに代入
		// -- main関数の作成はここまで --//

		// 配列の表示
		System.out.print("配列data : ");
		disp20(data);
	}

	// 統合した一つの配列に値を入れる際は、配列の内容が昇順になるように入れていく
	static int[] marge(int array1[], int array2[]) {
		int data[] = new int[20]; // 統合版の配列(今は空っぽ)
		int i = 0, j = 0, k = 0; // 各配列のカウント用変数

		/*
		 * array1の要素を全て見終わっていないか、
		 * array2の要素を全て見終わっていない間は繰り返し継続
		 */
		while (i < array1.length || j < array2.length) {
			if (i == array1.length) {
				/*
				 * array1の要素を全て見終わっている場合
				 * array2の残りをdataへ入れていく
				 */
				data[k] = array2[j];
				j++;
			} else if (j == array2.length) {
				/*
				 * array2の要素を全て見終わっている場合
				 * array1の残りをdataへ入れていく
				 */
				data[k] = array1[i];
				i++;
			} else {
				/*
				 * array1とarray2どちらも要素を全て見終わっていない場合
				 * それぞれの今のカウント番目の配列の中身で、より小さい方を先に入れる
				 * 値を入れたら、使った方の配列のカウントを進める
				 */
				if (array1[i] < array2[j]) {
					// array1側の方が小さい場合
					data[k] = array1[i];
					i++;
				} else {
					// array2側の方が小さい場合
					data[k] = array2[j];
					j++;
				}
			}
			// どのルートでも、統合版の配列のカウントは進める
			k++; 
		}
		// 昇順に値が入った状態の統合版配列を戻り値として返却
		return data;
	}

	// -- 関数の作成はここまで --//

	// 配列を昇順に初期化する処理
	static void init(int array[]) {
		Random random = new Random();
		array[0] = random.nextInt(5);
		for (int i = 1; i < 10; i++) {
			array[i] = array[i - 1] + random.nextInt(5) + 1;
		}
	}

	// 引数で渡された配列を表示する
	static void disp10(int array[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

	// 引数で渡された配列を表示する
	static void disp20(int array[]) {
		for (int i = 0; i < 20; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n");
	}

}