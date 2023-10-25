package Pertemuan3;
import java.util.Scanner;
public class Utama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = input.next();
        System.out.print("Masukkan password: ");
        String password = input.next();

        Tiket tiket = new Tiket("", "");

        if (tiket.login(username, password)) {
            int pilihan;
            do {
                System.out.println("\nMenu:");
                System.out.println("1. Input Data Transaksi");
                System.out.println("2. Lihat Data Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1/2/3): ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        tiket.inputDataTransaksi();
                        break;
                    case 2:
                        tiket.lihatDataTiket();
                        break;
                    case 3:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 3);
        } else {
            System.out.println("Login gagal. Username atau password salah.");
        }
    }
}


