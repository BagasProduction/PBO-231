package Kelas;
// angka++ itu sama dengan angka + 1
// angka-- itu sama dengan angka - 1

public class Looping {
    public static void main(String[] args){
        System.out.println("====FOR INCREASE====");
        for(int angka = 1; angka <= 10; angka++) {
            System.out.print(angka + ",");
        }
        System.out.println("");
        System.out.println("====FOR DECREASE====");
        for(int angka = 10; angka >= 1; angka--){
            System.out.print(angka+ ",");
        }
        System.out.println("");
        System.out.println("====DO WHILE INCREASE====");
        int angka = 1;
        do {
            System.out.print(angka + ",");
            angka++;
        } while (angka <= 10) ;
        System.out.println("");
        System.out.println("====DO WHILE DECREASE====");
        angka = 10;
        do {
            System.out.print(angka+ ",");
            angka--;
        }while (angka >= 1);
        System.out.println("");
        System.out.println("====WHILE DO INCREASE====");
        int nilai =1;
        while(nilai<=10) {
            System.out.print(nilai+ ",");
            nilai++;
        }
        System.out.println("");
        System.out.println("====WHILE DO DECREASE====");
        nilai = 10;
        while(nilai>=1) {
            System.out.print(nilai+ ",");
            nilai--;
        }
        System.out.println("");
        System.out.println("====NESTED FOR1=====");
        for(int baris = 1; baris <= 5; baris++) {
            for(int kolom = 1; kolom <= 3; kolom++) {
                System.out.print("o ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("====NESTED FOR2=====");
        for(int baris = 1; baris <= 5; baris++) {
            for(int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("o ");
            }
            System.out.println("");
        }




    }
}
