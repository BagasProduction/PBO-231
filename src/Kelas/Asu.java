package Kelas;

import java.util.Scanner;


public class Asu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, kodeBarang, qty;
        String namaBarang;
        double hargaBarang, subTotal, totalKeseluruhan = 0;
        double diskon = 0;

        System.out.print("Masukkan jumlah barang: ");
        n = input.nextInt();

        do {
            System.out.println("Barang ke-" + (n - (n - 1)));
            System.out.print("Kode barang: ");
            kodeBarang = input.nextInt();
            System.out.print("Nama barang: ");
            namaBarang = input.next();
            System.out.print("Harga barang: ");
            hargaBarang = input.nextDouble();
            System.out.print("Jumlah barang: ");
            qty = input.nextInt();

            subTotal = hargaBarang * qty;
            System.out.println("Sub total: " + subTotal);

            totalKeseluruhan += subTotal;

            n--;
        } while (n > 0);

        System.out.println("Total keseluruhan: " + totalKeseluruhan);

        if (totalKeseluruhan >= 500000) {
            diskon = 0.1 * totalKeseluruhan;
            totalKeseluruhan -= diskon;
            System.out.println("Diskon 10%: " + diskon);
            System.out.println("Total setelah diskon: " + totalKeseluruhan);
        }
    }

}

