package ID.Jawa;

import java.util.Scanner;

public class Playing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] toys = {{"1", "Mazda Rx-7", "Premium", "Rp125.000"},
                {"2", "Nissan Skyline R-34", "Premium", "Rp150.000"},
                {"3", "Toyota Supra", "Reguler", "Rp32.500"},
                {"4", "Mitsubishi Eclipse", "Reguler", "Rp32.500"},
                {"5", "Cybertruck", "Reguler", "Rp32.500"}};

        System.out.println("Selamat Datang Di Rico_Garage!");
        System.out.println("HotWheels Yang Tersedia:");

        for (String[] toy : toys) {
            System.out.println(toy[0] + ". " + toy[1] + ", " + toy[2] +  " (" + toy[3] + ")");
        }

        int total = 0;
        int diskon = 0;
        int jasaPacking = 4000;
        int quantity = 0;
        int ongkir = 0;

        while (true) {
            System.out.print("Masukkan Nomor HotWheels yang dipilih: ");
            String input = sc.next();
            int index = -1;

            for (int i = 0; i < toys.length; i++) {
                if (toys[i][0].equals(input)) {
                    index = i;
                    break;
                }
            }

            if (index == -1) {
                System.out.println("Nomor yang dimasukkan tidak sesuai!");
                continue;
            }

            System.out.print("Masukkan berapa pcs: ");
            int pcs = sc.nextInt();

            switch (toys[index][1]) {
                case "Mazda Rx-7":
                    total += pcs * 125000;
                    break;
                case "Nissan Skyline R-34":
                    total += pcs * 150000;
                    break;
                case "Toyota Supra":
                    total += pcs * 32500;
                    break;
                case "Mitsubishi Eclipse":
                    total += pcs * 32500;
                    break;
                case "Cybertruck":
                    total += pcs * 32500;
                    break;
                default:
                    break;
            }

            quantity += pcs;

            System.out.println("Ditambahkan " + pcs + " " + toys[index][1] + " Ke Keranjang.");
            System.out.print("Masukkan HotWheels Yang Lain? (y/n): ");
            String pilihan = sc.next();

            if (pilihan.equalsIgnoreCase("n")) {
                break;
            }
        }

        if (quantity > 0) {
            if (quantity > 0) {
                System.out.print("Masukkan Kota Pembeli: ");
                String kota = sc.next();

                switch (kota) {
                    case "jakarta":
                        ongkir = 20000;
                        break;
                    case "bandung":
                        ongkir = 15000;
                        break;
                    case "surabaya":
                        ongkir = 5000;
                        break;
                    case "yogyakarta":
                        ongkir = 10000;
                        break;
                    default:
                        ongkir = 25000;
                        break;
                }

                System.out.println("Harga Ongkos Kirim: Rp" + ongkir);
                total += ongkir;

                System.out.println("Packing cost: Rp" + jasaPacking);
                total += jasaPacking;

                if (quantity >= 5) {
                    diskon = total * 5 / 100;
                    System.out.println("Diskon (5%): Rp" + diskon);
                    total -= diskon;
                }
                System.out.println("Sub Total: Rp" + total);
                System.out.print("Pilih Metode Pembayaran (1. Transfer Bank, 2. Tokopedia): ");
                int metodePembayaran = sc.nextInt();
                if (metodePembayaran == 1) {
                    System.out.println("Tolong Transfer Ke No-Rekening Tersebut 1234567890");
                } else if (metodePembayaran == 2) {
                    System.out.println("Gratis ongkos kirim untuk metode pembayaran Tokopedia!");
                    System.out.println("Silakan selesaikan pembayaran di Tokopedia");
                } else {
                    System.out.println("Metode pembayaran tidak valid!");
                }
            }

            System.out.println("Terima kasih telah membeli di Rico_Garage!");
        }
    }
}
