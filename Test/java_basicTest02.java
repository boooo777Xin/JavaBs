public class java_basicTest02 {
    public static void main(String[] args) {

        int T10[] = new int[10];

        for (int i = 0; i < 10; i++) {
            T10[i] = 10 * i;
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(T10[i]);
            System.out.print(" ");
        }
    }
}
