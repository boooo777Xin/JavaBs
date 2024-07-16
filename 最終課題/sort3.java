import java.util.Random;

class sort3 {

	// 挿入ソート
	public static void main(String[] args) {

		int data[] = new int[10]; // 使用する配列

		init(data); // 配列の初期化
		disp(data); // 配列の表示

		System.out.println("昇順にソート");

		sort_a(data); // 昇順にソート
		disp(data); // 配列の表示

		System.out.println("降順にソート");

		sort_b(data); // 降順にソート
		disp(data); // 配列の表示

	}

	// 要素数10の配列を昇順にソート
	static void sort_a(int array[]) {

		// -- ここから記入 --//
		// 配列の左端の1つ右から配列の左端までjをカウントアップ
		for (int j = 1; j < array.length; j++) {
			// jの1つ前から配列の左端までiをカウントダウン
			// 配列のi番目の内容が、1つ右隣の内容より大きい間、入れ替え処理を継続
			for (int i = j - 1; i >= 0 && array[i] > array[i + 1]; i--) {
				// 入れ替え処理
				int w = array[i];
				array[i] = array[i + 1];
				array[i + 1] = w;

			}
		}
		// -- ここまで記入 --//
	}

	// 要素数10の配列を降順にソート
	static void sort_b(int array[]) {

		// -- ここから記入 --//
		// 配列の左端の1つ右から配列の左端までjをカウントアップ
		for (int j = 1; j < array.length; j++) {
			// jの1つ前から配列の左端までiをカウントダウン
			// 配列のi番目の内容が、1つ右隣の内容より大きい間、入れ替え処理を継続
			for (int i = j - 1; i >= 0 && array[i] < array[i + 1]; i--) {
				int w = array[i];
				array[i] = array[i + 1];
				array[i + 1] = w;
			}
		}
		// -- ここまで記入 --//
	}

	// 配列を0～99の乱数で初期化する処理
	static void init(int array[]) {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			array[i] = random.nextInt(99);
		}
	}

	// 引数で渡された配列を表示する
	static void disp(int array[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n\n");
	}

}
