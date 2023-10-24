package Kelas;
import java.util.*;
public class Array2D {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah barang yang akan dibeli");
        int N = input.nextInt();
        input.nextLine();
        String[][] data01 = new String[N][2];
        int[][] data02 = new int[N][3];
        int total = 0;
        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                System.out.println("Masukkan data barang01 ke-[" +i+"] ["+j+"]");
                data01[i][j]= input.nextLine();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                System.out.println("Masukkan data barang02 ke-[" +i+"] ["+j+"]");
                data02[i][j]= input.nextInt();
                input.nextLine();
            }
        }
        for(int i=0; i<N; i++){
            data02[i][2] = data02[i][0]*data02[i][1];
            total = total+data02[i][2];
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<2; j++){
                System.out.println("Data barang01 ke-[" +i+"] ["+j+"]" +data01[i][j]);

            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++){
                System.out.println("Data barang02 ke-[" +i+"] ["+j+"]" +data02[i][j]);

            }
        }
        System.out.println("total = "+total);




    }
}
