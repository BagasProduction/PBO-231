package Pertemuan6_V2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainLaundry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Create an instance of the CRUD class
        CRUD crud = new CRUD();

        do {
            System.out.println("--Laundry Production--");
            System.out.println("1. Menu Master");
            System.out.println("2. Menu Transaksi");
            System.out.println("3. Menu Cari Data");
            System.out.println("4. Menu Keluar");
            int menu = Integer.parseInt(br.readLine());

            switch (menu) {
                case 1:
                    // Call the insertMasterData method from the CRUD instance
                    crud.insertMasterData();
                    break;
                case 2:
                    // Call the insertTransaksi method from the CRUD instance
                    crud.insertTransaksi();
                    break;
                case 3:
                    // Call the cariData method from the CRUD instance
                    crud.cariData();
                    break;
                default:
                    System.exit(0);
            }
        } while (true);
    }
}

