package Tugas;
import java.util.Scanner;
public class Quiz1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Peserta Lomba Lari Bebek = ");
        int jum = input.nextInt();
        input.nextLine();
        String nama ="";
        String nomor = "";
        int usia = 0;
        int bb = 0;
        String kategori = "";
        int jumJarak = 0;

        for(int i=1; i<=jum; i++){
            System.out.println("Masukkan nomor bebek ke-" +i+ " = ");
            nomor = input.nextLine();
            System.out.println("Masukkan nama Bebek ke-" +i+ " = ");
            nama = input.nextLine();
            System.out.println("Masukkan Usia bebek ke-" +i+ " = ");
            usia = input.nextInt();
            input.nextLine();
            System.out.println("Masukkan Berat Badan bebek ke-" +i+ " = ");
            bb = input.nextInt();
            input.nextLine();
            if (usia < 3 && bb <1){
                kategori ="Jarak Pendek ";
            }else if (3 >= usia || usia <= 6 && bb >= 1 && 3 >= bb){
                kategori ="Jarak Menengah ";
            }else if (usia >6 && bb > 3){
                kategori ="Jarak Panjang ";
            }
            System.out.println("Masukkan Jumlah jarak yang berhasil ditempuh oleh setiap bebek");
            jumJarak = input.nextInt();
            input.nextLine();


        }
        for(int i=1; i<=jum; i++){
            System.out.println(" nomor bebek ke-" +i+ " = " +nomor);
            System.out.println(" nama Bebek ke-" +i+ " = " +nama);
            System.out.println("M Usia bebek ke-" +i+ " = " +usia+ " bulan");
            System.out.println(" Berat Badan bebek ke-" +i+ " = " +bb+ " kg");
            System.out.println("Jumlah jarak yang berhasil ditempuh oleh setiap bebek ke-" +i+ " = " +jumJarak+ " meter");
            System.out.println("Kategori = " +kategori);


        }

    }
}
