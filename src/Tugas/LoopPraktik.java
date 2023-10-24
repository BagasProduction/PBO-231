package Tugas;
import java.util.*;
public class LoopPraktik {
    public static void main(String[] args) {
        int pil;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.Kasir");
            System.out.println("2.DERET G A N J I L KEREN");
            System.out.println("3.PERULANGAN [PEMANASAN]");
            System.out.println("4.K E L U A R ");
            System.out.println("PILIHAN ANDA");
            pil = Integer.parseInt(input.nextLine());
            switch (pil) {

                case 1:
                    System.out.println("KASIR SEDERHANA");
                    System.out.print("Masukkan Nama Barang :");
                    String nama = input.nextLine();
                    System.out.print("Jumlah Barang : ");
                    int jmlh = Integer.parseInt(input.nextLine());
                    System.out.print("Harga Barang : ");
                    int hrg = Integer.parseInt(input.nextLine());
                    System.out.println("==========================");
                    System.out.println("Barang Yang Anda Beli " + nama);
                    int total = jmlh * hrg;
                    System.out.println("Total yang harus anda bayar Rp." + total);
                    System.out.print("Uang anda :");
                    int uang = Integer.parseInt(input.nextLine());
                    if (uang > total) {
                        int kemb = uang - total;
                        System.out.println("Uang Kembali RP." + kemb);
                    } else if (uang == total) {
                        System.out.println("Terima kasih, Anda membayar dengan uang Pas");
                    } else if (uang < total) {
                        System.out.println("Uang Anda Kurang");
                        System.out.println("Input uang lagi? (Y/T)");
                        String YT = input.nextLine();
                        if (YT.equals("Y")) {
                            System.out.print("Jika Y, maka input uang :");
                            uang = Integer.parseInt(input.nextLine());
                            if (uang > total) {
                                int kemb = uang - total;
                                System.out.println("Uang Kembali RP." + kemb);
                            } else if (uang == total) {
                                System.out.println("Terima kasih, Anda membayar dengan uang Pas");
                            } else if (uang < total) {
                                System.out.println("Terima kasih Kunjungan Anda, transaksi dibatalkan");
                            }
                        }else if (YT.equals("T")) {
                            System.out.println("Terima kasih Kunjungan Anda, transaksi dibatalkan");
                        }
                    }
                    break;

                case 2:
                    System.out.print("Masukkan bilangan: ");
                    int n = input.nextInt();
                    int total2 = 0;
                    System.out.print("Bilangan ganjil: ");
                    for (int i = 1; i <= n; i += 2) {
                        System.out.print(i);
                        if (i < n - 1) {
                            System.out.print(" + ");
                        } else if (i == n - 1) {
                            System.out.print(" = ");
                        } else {
                            System.out.print(" = ");
                        }
                        total2 += i;
                    }
                    System.out.print(total2);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("PERULANGAN");
                    int bil = 6;
                    for (int i = 1; i <= bil; i++) {
                        for (int k = 1; k <= i; k++) {
                            if (i % 2 == 0) {
                                if (k % 2 == 0) {
                                    System.out.print("#");
                                } else {
                                    System.out.print("*");
                                }
                            } else {
                                if (k % 2 == 0) {
                                    System.out.print("*");
                                } else {
                                    System.out.print("#");
                                }
                            }
                        }
                        System.out.println();


                    }
                    break;
                default:
                    System.exit(0);






            }



        }while(true);
    }
}


