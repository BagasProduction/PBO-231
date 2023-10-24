package Tugas;
import java.util.Random;
public class AngkaAcak {
    public static void main(String[] args){
        int i = 10;
        Random acak = new Random();
        int[] bilacak = new int[i];
        System.out.print("Bilangan acak = ");
        for(i=0; i<10; i++){
            bilacak[i] = acak.nextInt(10);
            System.out.print(" " +bilacak[i]);

        }
        System.out.println("");
        System.out.print("Bilangan genap = " );
        for(i=0; i<10; i++){
            if(bilacak[i]%2==0){
                System.out.print(" "+bilacak[i]);
            }
        }
        System.out.println("");
        System.out.print("Bilangan ganjil = " );
        for(i=0; i<10; i++){
            if(bilacak[i]%2!=0){
                System.out.print(" "+bilacak[i]);
            }
        }


    }
}
