package Tugas;

import java.util.*;
public class Posyandu {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Sebutkan usia anak yang datang ke Posyandu");
        int usia = input.nextInt();
        System.out.println("POSYANDU SURABAYA");
        System.out.println("Usia Anak = " +usia);
        if (usia <= 1){
            System.out.println("Bayi");
        }else if (usia >= 2 && usia <= 3){
            System.out.println("Batita");
        }else if (usia >= 4 && usia <= 5){
            System.out.println("Balita");
        }else if (usia >= 6 && usia <= 18){
            System.out.println("Anak-Anak");
        }else {
            System.out.println("Harus ke rumah Sakit");
        }

    }
}
