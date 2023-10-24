package Tugas;
import java.util.Scanner;

public class Praktikum09 {
    public static float CkeF(float a) {
        float hasil = (a * 9/5) + 32;
        return hasil;
    }

    public static int penjumlahan(int b, int c) {
        int hasil = (b + c);
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kondisi;

        do {
            System.out.println("Program dengan 3 menu");
            System.out.println("1. Function menghitung konversi dari Celsius ke Fahrenheit");
            System.out.println("2. Function penjumlahan 2 bilangan yang diinputkan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan nomor yang akan Anda pilih = ");
            int nomor = input.nextInt();
            input.nextLine();

            switch (nomor) {
                case 1:
                    System.out.print("Masukkan nilai Celsius yang akan dikonversikan ke Fahrenheit = ");
                    float celcius = input.nextFloat();
                    input.nextLine();
                    System.out.println("Hasil konversi C ke F = " + CkeF(celcius));
                    break;
                case 2:
                    System.out.print("Masukkan bilangan pertama = ");
                    int bil1 = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan bilangan kedua = ");
                    int bil2 = input.nextInt();
                    input.nextLine();
                    System.out.println("Hasil penjumlahan = " + penjumlahan(bil1, bil2));
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
            }

            System.out.print("Apakah Anda ingin melanjutkan program ini (Y/T)? ");
            kondisi = input.nextLine();
        } while(kondisi.equalsIgnoreCase("Y"));
    }
}
