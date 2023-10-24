package Kelas;
import java.util.Scanner;

public class ContohFungsi2 {
    public static int SPP(String jurusan,int angkat){
        int spp=0;
        if(jurusan.equalsIgnoreCase("S1 SI")){
            if(angkat == 2020 ){
                spp = 13000000;
            }
            else if(angkat == 2021){
                spp = 14000000;
            }
            else {
                spp = 17000000;
            }
        }
        else if(jurusan.equalsIgnoreCase("S1 TK")){
            if(angkat == 2020 ){
                spp = 10000000;
            }
            else if(angkat == 2021){
                spp = 11000000;
            }
            else {
                spp = 15000000;
            }
        }
    return(spp);
    }
    public static String Kaprodi(String jurusan, int angkat){
        String kaprodi=null;
        if(jurusan.equalsIgnoreCase("S1 SI")){
            if(angkat == 2020 ){
                kaprodi = "Tono";
            }
            else if(angkat == 2021){
                kaprodi = "Yono";
            }
            else {
                kaprodi = "Mono";
            }
        }
        else if(jurusan.equalsIgnoreCase("S1 TK")){
            if(angkat == 2020 ){
                kaprodi = "Sono";
            }
            else if(angkat == 2021){
                kaprodi = "Lono";
            }
            else {
                kaprodi = "Rono";
            }
        }
    return(kaprodi);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama mhs = ");
        String nama = input.nextLine();
        System.out.print("Masukkan jurusan mhs = ");
        String jurusan = input.nextLine();
        System.out.print("Masukkan tahun angkatan mhs = ");
        int angkat = input.nextInt();
        input.nextLine();
        System.out.println("Nama mhs = "+nama);
        System.out.println("Angkatan mhs = "+angkat);
        System.out.println("Jurusan mhs = "+jurusan);
        System.out.println("SPP anda = " +SPP(jurusan,angkat));
        System.out.println("Kaprodi anda = "+Kaprodi(jurusan,angkat));
    }
}
