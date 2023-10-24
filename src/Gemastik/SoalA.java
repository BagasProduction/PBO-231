package Gemastik;
import java.util.*;

public class SoalA {
    public static void main(String[] args){
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan pembilang A = ");
        A = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan pembilang B = ");
        B = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan penyebut A = ");
        C = Integer.parseInt(input.nextLine());
        System.out.print("Masukkan penyebut B = ");
        D = Integer.parseInt(input.nextLine());
        int hasilkali = 0;
        int hasilkali1 = 0;
        hasilkali = A*D;
        hasilkali1 = B*C;

        if(hasilkali<hasilkali1){
            System.out.println("lebih kecil");
        }else if(hasilkali == hasilkali1){
            System.out.println("Sama");
        }else if(hasilkali>hasilkali1){
            System.out.println("Lebih Besar");
        }







    }
}
