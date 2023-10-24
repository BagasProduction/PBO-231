package Tugas;

import java.util.Scanner;

public class Quiz2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Peserta Lomba Lari Bebek = ");
        int X = input.nextInt();
        input.nextLine();
        String[] nomor = new String[X];
        String[] nama = new String[X];
        int[] usia = new int[X];
        int[] bb = new int[X];
        String[] kategori = new String[X];
        int[] Jum = new int[X];

        for (int i = 0; i < X; i++) {
            System.out.print("Masukkan nomor bebek ke-" + (i + 1) + " = ");
            nomor[i] = input.nextLine();
            System.out.print("Masukkan nama bebek ke-" + (i + 1) + " = ");
            nama[i] = input.nextLine();
            System.out.print("Masukkan usia bebek ke-" + (i + 1) + " = ");
            usia[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan berat badan bebek ke-" + (i + 1) + " = ");
            bb[i] = input.nextInt();
            input.nextLine();
            if (usia[i] < 3  && bb[i] < 1) {
                kategori[i] = "Jarak Pendek ";
            } else if (3 >= usia[i] || usia[i] <= 6 && bb[i] >= 1 || 3 <= bb[i]) {
                kategori[i] = "Jarak Menengah ";
            } else if (usia[i] > 6 && bb[i] > 3) {
                kategori[i] = "Jarak Panjang ";
            }
            System.out.print("Masukkan Jumlah jarak yang berhasil ditempuh oleh setiap bebek ke-" +(i+1)+ " = ");
            Jum[i] = input.nextInt();
            input.nextLine();
        }
        for (int i = 0; i < X; i++) {
            System.out.println(" nomor bebek ke-" + (i + 1) + " = " + nomor[i]);
            System.out.println(" nama Bebek ke-" + (i + 1) + " = " + nama[i]);
            System.out.println(" Usia bebek ke-" + (i + 1) + " = " + usia[i]+  " Bulan ");
            System.out.println(" Berat Badan bebek ke-" + (i + 1) + " = " + bb[i]+ " kg ");
            System.out.println("Jumlah jarak yang berhasil ditempuh oleh setiap bebek ke-" +(i+1) + " = " + Jum[i]+ " meter");
            System.out.println("Kategori = " + kategori[i]);

        }
    }
}
