package Tugas;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Selamat datang di Yanto Music Store");
        System.out.println("Silakan masukkan identitas anda");
        String nama = input.nextLine();
        System.out.println("Masukkan data tanggal akses ke situs ini");
        String tgl = input.nextLine();
        System.out.println("Barang apa yang ingin anda beli");
        String brng = input.nextLine();
        System.out.println("Jenis pembayaran yang ingin digunakan");
        String Byr = input.nextLine();
        System.out.println("Layanan yang diambil");
        String ambil = input.nextLine();
        System.out.println("Berapa jumlah barang yang anda ingin beli");
        int jmlh = input.nextInt();
        int hrg = 7500000;
        int tot = jmlh * hrg;
        System.out.println("Nama pelanggan = " +nama);
        System.out.println("Tanggal akses pelanggan = " +tgl);
        System.out.println("Barang yang anda beli = " +brng);
        System.out.println("Jumlah barang yang anda beli = " +jmlh);
        System.out.println("Harga " +brng+ " adalah = " +hrg);
        System.out.println("Harga barang keseluruhan =" +tot);
        System.out.println("Jenis pembayaran yang diambil = " +Byr);
        System.out.println("Layanan pengambilan yang diambil =" +ambil);





    }
}
