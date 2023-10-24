package Tugas;
import java.util.*;


    public class TugasRekursif {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Masukkan banyak deret bilangan prima = ");
            int bil1 = input.nextInt();
            input.nextLine();
            System.out.println("Deret bilangan prima:");
            tampilkanDeretPrima(bil1, 2);
        }

        public static void tampilkanDeretPrima(int jumlah, int bilangan) {
            if (jumlah <= 0) {
                return;
            }
            if (cekBilanganPrima(bilangan)) {
                System.out.print(bilangan + " ");
                tampilkanDeretPrima(jumlah - 1, bilangan + 1);
            } else {
                tampilkanDeretPrima(jumlah, bilangan + 1);
            }
        }

        public static boolean cekBilanganPrima(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


