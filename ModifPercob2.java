import java.util.Scanner;
public class ModifPercob2 {
    static int hitungPangkat(int x, int y) { 
        if (y == 0) { 
            System.out.print("1"); 
            return (1); 
        } else { 
            System.out.print(x + "x"); 
            return (x * hitungPangkat(x, y - 1)); 
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bilangan yang dihitung: ");
        int bilangan = 2;
        System.out.print("Pangkat: ");
        int pangkat = 5;

        System.out.print(bilangan + "^" + pangkat + " = ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }
}