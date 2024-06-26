public class method {

    public static void main(String[] args) {
        print_a(3,"野澤");
        print_a(2,"木本");
        print_a(1,"姉御みくさん");
    }

    public static void print_a(int n,String s) {
        for (int i = 0; i < n; i++) {
            System.out.println("@");
        }
        System.out.println(s);
    }
}
