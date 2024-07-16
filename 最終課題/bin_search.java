import java.util.Scanner;
import java.util.Random;

class bin_search {

	public static void main(String[] args) {

		int data[] = new int[20]; // 使用する配列
		int in; // 検索する値

		init(data); // 配列の初期化
		disp(data); // 配列の表示

		// キーボードから探す値を入力
		Scanner scan = new Scanner(System.in);
		System.out.print("探す値入力：");
		in = scan.nextInt();

		seq_b(data, in); // 配列から入力値を探す
		scan.close();
	}

	// 配列を昇順にして初期化する処理
	static void init(int array[]) {
		Random random = new Random();
		array[0] = random.nextInt(5);
		for (int i = 1; i < 20; i++) {
			array[i] = array[i - 1] + random.nextInt(5) + 1;
		}
	}

	// 引数で渡された配列を表示する
	static void disp(int array[]) {
		for (int i = 0; i < 20; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("\n\n");
	}

	// 配列から入力した値xが何番目に
	// あるか2分探索をする
	// 結果は何番目にあるかを表示する
	// 存在しない場合は"ありません"を表示する
	static void seq_b(int array[], int x) {

		// -- ここから記入 --//
		int low = 0; // 範囲の左端の添え字(番号)
		int high = array.length - 1; // 範囲の右端の添え字(番号)
		int middle = (low + high) / 2; // 範囲の中央の添え字(番号)
		// 探索範囲が残っている(左端が右端を追い抜いていない)、
		// かつ入力値が探索範囲の中央の値と同じでない(見つかっていない)間繰り返し
		while (low <= high && x != array[middle]) {
			if (x < array[middle]) {
				// 入力値が範囲の中央の値より小さい場合
				high = middle - 1; // 右端を現在の範囲の中央の1つ左にする
			} else {
				// 入力値が範囲の中央の値より大きい場合
				low = middle + 1; // 左端を現在の範囲の中央の1つ右にする
			}
			middle = (low + high) / 2; // 新しい範囲の中央を算出
		}

		if (low <= high) {
			// 探索範囲が残っている(左端が右端を追い抜いていない)場合
			System.out.println(middle + "番目にありました");
		} else {
			// 探索範囲が残っていない(左端が右端を追い抜いた)場合
			System.out.println("ありません");
		}
		// -- ここまで記入 --//
	}

}
