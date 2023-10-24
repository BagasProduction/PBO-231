package Kelas;
import java.util.Scanner;

public class Fibo {
    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        } else {
            return (fibo(n-1) + fibo(n-2));
        }
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String kondisi;
        do {
            System.out.println("MENU");
            System.out.println("1. Deret Fibonacci yang diinputkan");
            System.out.println("2. Menentukan bilangan Fibonaci atau bukan");
            System.out.println("3. Keluar ");
            System.out.println("Pilihan yang ingin diambil :");
            int pil = input.nextInt();
            input.nextLine();
            switch (pil) {
                case 1:
                    int i, j = 0;
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Masukkan jumlah deret bilangan fibonacci: ");
                    int n = scan.nextInt();
                    System.out.print("Hasil bilangan fibonacci: ");
                    for (i = 0; i < n; i++) {
                        if (i == n - 1) {
                            System.out.print(fibo(j) + " ");
                            j++;
                        } else
                            System.out.print(fibo(j) + ", ");
                        j++;
                    }
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Menentukan bilangan Fibonacci");
                    System.out.print("Masukkan bilangan = ");
                    int bil = input.nextInt();
                    input.nextLine();

                    boolean isFibonacci = false;
                    int fib1 = 0;
                    int fib2 = 1;
                    int fibonacci = fib1 + fib2;

                    while (fibonacci <= bil) {
                        if (bil == fibonacci) {
                            isFibonacci = true;
                            break;
                        }

                        fib1 = fib2;
                        fib2 = fibonacci;
                        fibonacci = fib1 + fib2;
                    }

                    if (isFibonacci) {
                        System.out.println("Bilangan " + bil + " merupakan bilangan Fibonacci");
                    } else {
                        System.out.println("Bilangan " + bil + " bukan merupakan bilangan Fibonacci");
                    }
                    break;
                case 3:
                    System.out.println("Keluar");
                    break;
            }
            System.out.print("Apakah Anda ingin melanjutkan program ini (Y/T)? ");
            kondisi = input.nextLine();
        }while(kondisi.equalsIgnoreCase("Y"));
    }


}

