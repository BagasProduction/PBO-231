package ID.Jawa;
import java.util.Scanner;
public class Analisa_arr {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Kata : ");
        int n = input.nextInt();
        String kata[] = new String[n];
        for (int i = 0; i < kata.length; i++) {
            System.out.print("Kata Ke-" + (i + 1) + " : ");
            kata[i] = input.next();
        }
        System.out.print("Tampilkan Kata = ");
        for (String kata1 : kata) {
            System.out.print(kata1 + " ");
        }
    }
}