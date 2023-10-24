package Tugas;
import java.util.*;
public class EntryBarang {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String pil,kd,nama;
        double diskon, diskon1, tot, hrgdis;
        int hrg, jum;
        int i = 1;
        do {
            System.out.print("Masukkan kode barang ke-" +i+ "=");
             kd = input.next();
            input.nextLine();
            System.out.print("Masukkan nama barang ke-" +i+ "=");
             nama = input.nextLine();
            System.out.print("Masukkan harga barang ke-" +i+ "=");
            hrg = input.nextInt();
            System.out.print("Masukkan jumlah barang ke-" +i+ "=");
            jum = input.nextInt();
            if (hrg >= 100000) {
                diskon = 0.25;
                diskon1 = diskon * hrg;
                hrgdis = hrg - diskon1;
                tot = hrgdis * jum;
            } else if ( hrg >= 50000 && hrg < 100000) {
                diskon = 0.1;
                diskon1 = diskon * hrg;
                hrgdis = hrg - diskon1;
                tot = hrgdis * jum;
            } else {
                tot = hrg * jum;
                diskon = 0;
            }
            System.out.println(" kode barang ke-" +i+ "=" +kd);
            System.out.println(" nama barang ke-" +i+ "=" +nama);
            System.out.println(" harga barang ke-" +i+ "=" +hrg);
            System.out.println(" jumlah barang ke-" +i+ "=" +jum);
            System.out.println("Total Keseluruhan =" +tot);
            System.out.println("Besar diskon =" +diskon);
            i++;
            System.out.println("Apakah saudara ingin melanjutkan pembelian(Y/T)?");
            pil = input.next();

        }while(pil.equals("Y"));
    }
}
