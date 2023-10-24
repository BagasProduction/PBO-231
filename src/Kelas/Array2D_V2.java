package Kelas;
import java.util.*;
public class Array2D_V2 {
        public static void main (String [] dim) {
            Scanner inputan = new Scanner (System.in);
            System.out.println("Masukkan Jumlah Barang yang akan dibeli = ");
            int N = Integer.parseInt(inputan.nextLine());
            String[][] data01 = new String [N][2];
            int[][] data02 = new int [N][3];
            int total = 0;
            //input data01
            for (int i = 0; i<N; i++) {
                System.out.println("Masukkan Data Barang01 ke-[" +i+"] [0]=" );
                data01 [i][0] = inputan.nextLine();
                System.out.println("Masukkan Data Barang01 ke-[" +i+"] [1]=" );
                data01 [i][1] = inputan.nextLine();
            }
            //input data02
            for (int i = 0; i<N; i++) {
                System.out.println("Masukkan Data Barang01 ke-[" +i+"] [0]=" );
                data02 [i][0] = Integer.parseInt(inputan.nextLine());
                System.out.println("Masukkan Data Barang01 ke-[" +i+"] [1]=" );
                data02 [i][1] = Integer.parseInt(inputan.nextLine());
                //Hitung SubTotal
                data02 [i][2] = data02[i][0] * data02[i][1];
                //Hitung Total Keseluruhan
                total = total + data02[i][2];
            }
            for (int i=0; i<N; i++) {
                System.out.println("Kode Barang ke-[" +i+"] [0]=" +data01[i][0]);
                System.out.println("Nama Barang ke-[" +i+"] [1]=" +data01[i][1]);
                System.out.println("Harga Barang ke-[" +i+"] [0]=" +data02[i][0]);
                System.out.println("Qty Barang ke-[" +i+"] [1]=" +data02[i][1]);
                System.out.println("Sub Total Barang ke-[" +i+"] [2]=" +data02[i][2]);
            }
            System.out.println("Total Keseluruhan = Rp " +total);
        }
}

