package Kelas;

public class ContohFungsi {
    public static int Jumlah(int a, int b){
       int jumlah = a+b;
        return(jumlah);
    }
    public static int Kali(int b, int c){
        int kali = b*c;
        return(kali);
    }
    public static void main(String [] Args){
        int bil1 = 10;
        int bil2 = 3;
        int bil3 = 6;
        int hasil = Jumlah(bil1, bil2);
        int hasil2 = Kali(bil2, bil3);
        System.out.println(" fungsi Penjumlahan = " +hasil);
        System.out.println(" fungsi Perkalian = " +hasil2 );
    }
}
