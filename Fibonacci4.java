import java.util.Scanner;
public class Fibonacci4 {
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bulan ke: ");
        int bulanKe = sc.nextInt();

        System.out.println("Jumlah pasangan marmut pada bulan ke-" + bulanKe + " adalah: " + fibonacci(bulanKe));
    }
}
