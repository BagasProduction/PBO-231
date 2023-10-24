package Tugas;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Masukkan jumlah data = ");
        int jum = input.nextInt();
        input.nextLine();

        System.out.println("Simulasi penggunaan Metode Stack");
        int pil;
        do {
            System.out.println("1. Push data");
            System.out.println("2. Pop data");
            System.out.println("3. Cetak hasil output");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pil = input.nextInt();
            input.nextLine();

            switch (pil) {
                case 1:
                    if (stack.size() < jum) {
                        System.out.print("Masukkan data: ");
                        int data = input.nextInt();
                        input.nextLine();
                        stack.push(data);
                        System.out.println("Data berhasil ditambahkan ke Stack");
                    } else {
                        System.out.println("Stack penuh, tidak bisa menambahkan data");
                    }
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        int data = stack.pop();
                        System.out.println("Data yang dikeluarkan dari Stack: " + data);
                    } else {
                        System.out.println("Stack kosong, tidak ada data yang dapat dikeluarkan");
                    }
                    break;

                case 3:
                    System.out.println("Data dalam Stack:");
                    for (Integer data : stack) {
                        System.out.println(data);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
            System.out.println();
        } while (pil != 4);
    }
}
