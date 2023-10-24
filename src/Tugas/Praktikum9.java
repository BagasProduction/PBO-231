package Tugas;
import java.util.*;
public class Praktikum9 {
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        String DataAntrian[] = new String[5];
        int indeks = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Simulasi alur antrian pada warnet");
            System.out.println("1. Data Masuk");
            System.out.println("2. Data keluar");
            System.out.println("3. Cetak antrian");
            System.out.println("4. Program selesai");

            int pil = input.nextInt();
            input.nextLine();

            switch (pil) {
                case 1:
                    if (indeks < 5) {
                        System.out.print("Masukkan antrian ke-" + indeks + " = ");
                        DataAntrian[indeks] = input.nextLine();
                        antrian.offer(DataAntrian[indeks]);
                        indeks++;
                    } else {
                        System.out.println("Antrian telah penuh");
                    }
                    break;
                case 2:
                    if (!antrian.isEmpty()) {
                        DataAntrian[i-indeks] = antrian.remove();
                        indeks--;
                    } else {
                        System.out.println("Antrian kosong");
                    }
                    break;
                case 3:
                    System.out.println("========================================");
                    int j = 0;
                    for (String data : antrian) {
                        System.out.println("Antrian ke-" + j + " = " + data);
                        j++;
                    }
                    break;
                case 4:
                    System.out.println("Progam selesai");
                    return;
                default:
                    System.out.println("Pilihan menu tidak valid");
                    break;
            }
        }


        }
        }
