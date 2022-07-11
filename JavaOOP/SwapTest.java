public class SwapTest {

    public static void main(String[] args) {
        int a = 4; //5
        int b = 5; //4
        swap(a,b);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
