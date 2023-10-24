package Tugas;



import java.util.*;


    public class IfElse {
        public static void main(String[] args) {
            Scanner data = new Scanner(System.in);
            System.out.println("Masukkan nominal belanja = Rp ");
            int belanja = Integer.parseInt(data.nextLine());
            double diskon = 0;
            if (belanja >= 100000) {
                diskon = 0.2 * belanja;
            }
            else if (belanja < 50000) {
                diskon = 0.1 * belanja;
            }


            double total_akhir = belanja - diskon;
            System.out.println("Nominal belanja = Rp " + belanja);
            System.out.println("Nominal diskon = Rp " + diskon);
            System.out.println("Total belanja = Rp " + total_akhir);
        }
    }




