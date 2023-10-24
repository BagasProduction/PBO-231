package Kelas;

import java.util.Arrays;

public class FungsiProsedurArray {
    public static void CetakArray(int [] bil){
        for(int i=0; i<bil.length; i++){
            System.out.println("Angka ke-"+i+" = " +bil[i]);



        }
    }
    public static int elemenpertama(int[] bil){
        int pertama = 0;
        for(int i=0; i<bil.length; i++){
            if (i==0){
                pertama = bil[0];
            }
        }
        return(pertama);
    }
    public static int elementerakhir(int[] bil){
        int terakhir = 0;
        for(int i=0; i<bil.length; i++){
            if(i==bil.length-1){
                terakhir = bil[bil.length-1];
            }
        }
        return(terakhir);
    }
    public static int elementerbesar(int[] bil){
        int maks = 0;
        for(int i=0; i<bil.length; i++){
            if(bil[i]>maks){
                maks = bil[i];
            }
        }
        return(maks);
    }
    public static int elementersmall(int[] bil){
        int min = bil[0];
        for(int i=0; i<bil.length; i++){
            if(bil[i]<min){
                min = bil[i];
            }
        }
        return(min);
    }
    public static void main(String[] args){
        int[] angka = {10, 3, 5, 9, 6, 308, 205};
        CetakArray(angka);
        int angkapertama = elemenpertama(angka);
        int angkaterakhir = elementerakhir(angka);
        int angkaterbesar = elementerbesar(angka);
        int angkatersmall = elementersmall(angka);
        System.out.println("Elemen angka pertama = " +angkapertama);
        System.out.println("Elemen angka terakhir = " +angkaterakhir);
        System.out.println("Elemen angka terbesar = " +angkaterbesar);
        System.out.println("Elemen angka tersmall = " +angkatersmall);
    }
}
