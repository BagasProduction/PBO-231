package ID.Jawa;
import java.util.*;

public class KasusArray1D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang =");
        int J = input.nextInt();
        input.nextLine();
        int total = 0;
        String[] kode = new String[J];
        String[] nama = new String[J];
        int[] hrgsat = new int[J];
        int[] qty = new int[J];
        int[] sub = new int[J];
        for(int i=0; i<J; i++) {
            System.out.print("Masukkan kode barang ke-"+(i+1)+ "=");
            kode[i] = input.nextLine();
            System.out.print("Masukkan nama barang ke-"+(i+1)+ "=");
            nama[i] = input.nextLine();
            System.out.print("Masukkan harga satuan ke-"+(i+1)+ "=");
            hrgsat[i] = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan Jumlah barang ke-"+(i+1)+ "=");
            qty[i] = input.nextInt();
            input.nextLine();
            sub[i] = qty[i]*hrgsat[i];
            total += sub[i];


        }
        for(int i=0; i<J; i++) {
            System.out.println("Kode barang ke-"+(i+1)+ "=" +kode[i]);
            System.out.println("Nama barang ke-"+(i+1)+ "=" +nama[i]);
            System.out.println("Harga satuan barang ke-"+(i+1)+ "=" +hrgsat[i]);
            System.out.println("Jumlah barang ke-"+(i+1)+ "=" +qty[i]);
            System.out.println("Sub total barang ke-"+(i+1)+ "=" +sub[i]);
        }
        System.out.println("Total Keseluruhan =" +total);

    }

}
