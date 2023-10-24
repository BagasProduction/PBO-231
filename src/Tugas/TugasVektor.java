package Tugas;
import java.util.*;

public class TugasVektor {
    public static void main(String[] args){
        Vector<String> Makanan = new Vector<>();
        Scanner input = new Scanner(System.in);
        Makanan.addElement("Nasi Uduk");
        Makanan.addElement("Sayur Bening");
        Makanan.addElement("Nasi Campur");
        Makanan.addElement("Nasi Goreng");
        Makanan.addElement("Soto ayam");
        Makanan.addElement("Nasi Rawon");

        System.out.println("Banyak menu sekarang : "+Makanan.size());
        for (int i=0; i<6; i++){
            System.out.println("Menu ke - " + i + " : " + Makanan.get(i));
        }
        System.out.print("Jumlah menu yang ini ditambahkan = ");
        int x = input.nextInt();
        input.nextLine();
        for(int i=0; i<x; i++) {
            System.out.print("Menu baru yang ingin ditambahkan oleh penjual = ");
            String y = input.nextLine();
            Makanan.add(y);
        }
        System.out.println("Banyak menu setelah diperbarui : "+Makanan.size());
        for (int i=0; i<Makanan.size(); i++){
            System.out.println("Menu ke - " + i + " : " + Makanan.get(i));
        }
        System.out.println("Penjual ingin menghapus menu sayur bening sementara dikarenakan");
        System.out.println("kenaikan inflasi harga bahan baku pakan sayuran yang melejit");
        Makanan.remove(1);
        System.out.println("Banyak menu setelah menghapus salah satu menu : "+Makanan.size());
        for (int i=0; i<Makanan.size(); i++){
            System.out.println("Menu ke - " + i + " : " + Makanan.get(i));
        }




    }
}
