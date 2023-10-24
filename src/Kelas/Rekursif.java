package Kelas;
import java.util.*;
public class Rekursif {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan faktorial = ");
        int bil = input.nextInt();
        input.nextLine();
        int hasil = HitungFaktorial(bil);
        System.out.println("Hasil perhitungan Faktorial dari " +bil+" = " +hasil);
        System.out.print("Masukkan bilangan pertama = ");
        int bil1 = input.nextInt();
        System.out.print("Masukkan bilangan kedua = ");
        int bil2 = input.nextInt();
        input.nextLine();
        int hasil2 = HitungKelipatan5(bil1,bil2);
        System.out.println("Hasil perkalian dari "+bil1+" dan "+bil2+" = " +hasil2);
        System.out.print("Masukkan bilangan yang dipangkatkan = ");
        int bil3 = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan pangkat bilangan = ");
        int bil4 = input.nextInt();
        input.nextLine();
        int hasil3 = HitungBilPangkat(bil3,bil4);
        System.out.println("Hasil pangkat dari "+bil3+" dengan pangkat " +bil4+ " = " +hasil3);
    }
    public static int HitungFaktorial(int x){
        if (x==1){
            return(1);
        }
        else {
            return(x*HitungFaktorial(x-1));
        }
    }
    public static int HitungKelipatan5(int x, int y){
        if (y==1){
            return(x);
        }
        else {
            return(x+HitungKelipatan5(x,y-1));
        }
    }
    public static int HitungBilPangkat(int x, int y){
        if (y==0){
            return(1);
        } else {
            return (x*HitungBilPangkat(x,y-1));
        }
    }
}
