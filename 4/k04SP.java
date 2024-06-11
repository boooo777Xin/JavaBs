import java.util.Random;

public class k04SP {

    public static void main(String[] args) {

        Random rm = new Random();
        int T[] = new int[20];
        for (int i = 0; i < 20; i++) {
            T[i] = rm.nextInt(50);
            System.out.println(i + "番目 : " + T[i]);
        }

        int max = 0;
        int min = 50;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < T.length; i++) {

            if (max < T[i]) {
                max = T[i];
                maxIndex = i;
            }

            if (min > T[i]) {
                min = T[i];
                minIndex = i;
            }
        }
        System.out.println("最大値 : " + max + " 場所 : " + maxIndex);
        System.out.println("最小値 : " + min + " 場所 : " + minIndex);

        // 昇順ソート(基本選択法)
        for (int i = 0; i < T.length - 1; i++) {
            max = 0;
            int j = 0;
            for (; j < T.length - i; j++) {
                if (T[max] < T[j]) {
                    max = j;
                }
            }
            j--;
            int temp = T[j];
            T[j] = T[max];
            T[max] = temp;
        }

        System.out.print("ソート後の配列の内容：");
        for(int i=0;i<T.length;i++) {
            System.out.print(T[i]+" ");
        }
        System.out.println();

    }
}
