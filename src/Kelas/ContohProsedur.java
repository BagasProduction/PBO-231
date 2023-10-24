package Kelas;
import java.util.Scanner;
public class ContohProsedur {
    public static void Aritmatika(int a,int b,int c){
        int jumlah = a+b;
        int kali = b*c;
        System.out.println("Hasil penjumlahan = "+jumlah);
        System.out.println("Hasil Perkalian = "+kali);
    }
    public static void main(String [] Args){
        int bil1 = 10;
        int bil2 = 3;
        int bil3 = 8;
        Aritmatika(bil1,bil2,bil3);

    }
}
