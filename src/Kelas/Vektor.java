package Kelas;
import java.util.*;
public class Vektor {
    public static void main(String[] args){
        Vector<String> kota = new Vector<>();
        kota.addElement("Surabaya");
        kota.addElement("Trenggalek");
        kota.addElement("Situbondo");
        for (int i=0; i<kota.size(); i++){
            System.out.println("Kota ke-"+i+"="+kota.elementAt(i));

        }
        System.out.println("Kota pertama = "+kota.firstElement());
        System.out.println("Kota terakhir = "+kota.lastElement());
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama kota yang ingin di cari = ");
        String cari = input.nextLine();
        int indeks = 0;
        for (int i=0; i<kota.size(); i++){
            if(kota.elementAt(i).equals(cari)){
                indeks = 1;
            }
        }
        System.out.println("Posisi Indeks Kota"+cari+" = " +indeks);
        int indeks2 =kota.indexOf(cari);
        System.out.println("Posisi Indeks2 Kota"+cari+" = " +indeks2);
    }

}
