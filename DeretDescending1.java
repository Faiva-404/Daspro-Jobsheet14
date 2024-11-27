import java.util.Scanner;
public class DeretDescending1 {
    //fungsi rekrusif
    public static void deretDescendingRekrusif(int n) {
        if (n < 0) {
            return;
        }
        System.out.print (n + " ");
        deretDescendingRekrusif(n - 1);
    }
    //fungsi iteratif
    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Deret Descending Rekrusif:");
        deretDescendingRekrusif(n);

        System.out.println("\nDeret Descending Iteraktif:");
        deretDescendingIteratif(n);
    }
}
