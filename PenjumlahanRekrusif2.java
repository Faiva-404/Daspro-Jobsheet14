import java.util.Scanner;
public class PenjumlahanRekrusif2 {
    //Fungsi rekrusif menghitung penjumlahan
    public static int penjumlahan(int n) {
        if (n == 0) {
            return 0;
        }
        return n + penjumlahan(n - 1);
    }

    public static void main(String[] args) {
        int f = 8;
        System.out.println("Hasil Penjumlahan 1 + 2 + ... + " + f + " = " + penjumlahan(f));
    }
}
