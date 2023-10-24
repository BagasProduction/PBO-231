package Gemastik;
import java.util.*;


public class SoalC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah karakter yang diinginkan (2-1000)
        int totalCharacters = 0;
        while (totalCharacters < 2 || totalCharacters > 1000) {
            System.out.print("Masukkan jumlah karakter (2-1000): ");
            totalCharacters = scanner.nextInt();
            scanner.nextLine();
            if (totalCharacters < 2 || totalCharacters > 1000 || totalCharacters % 2 != 0) {
                System.out.println("Masukkan jumlah karakter genap yang valid (2-1000).");
            }
        }
        // Meminta pengguna untuk memasukkan string
        System.out.print("Masukkan sebuah string: ");
        String input = scanner.nextLine();
        // Memastikan jumlah karakter string sesuai dengan jumlah karakter yang diinginkan
        if (input.length() > totalCharacters) {
            input = input.substring(0, totalCharacters);
        }

        // Memisahkan string menjadi 2 karakter per variabel
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i += 2) {
            String karakter1 = input.substring(i, i + 2);
            karakter1 = gantiKarakter1(karakter1);
            karakter1 = gantiKarakter2(karakter1); // Apply the second character switch
            result.append(karakter1);
        }

        System.out.println(result);

        scanner.close();
    }


    public static String gantiKarakter2(String karakter) {
        switch (karakter) {
            case "AB":
                return "AA";
            case "DC":
                return "AB";
            case "CC":
                return "AC";
            case "CB":
                return "AD";
            case "CA":
                return "BA";
            case "DA":
                return "BB";
            case "CD":
                return "BC";
            case "DD":
                return "BD";
            case "BC":
                return "CA";
            case "AA":
                return "CB";
            case "BA":
                return "CC";
            case "DB":
                return "CD";
            case "BD":
                return "DA";
            case "AD":
                return "DB";
            case "BB":
                return "DC";
            case "AC":
                return "DD";
            default:
                return karakter; // Jika karakter tidak terdapat dalam tabel pengganti, biarkan karakter aslinya
        }
    }

    public static String gantiKarakter1(String karakter) {
        switch (karakter) {
            case "CD":
                return "AA";
            case "BB":
                return "AB";
            case "AC":
                return "AC";
            case "CC":
                return "AD";
            case "CB":
                return "BA";
            case "DB":
                return "BB";
            case "AD":
                return "BC";
            case "DD":
                return "BD";
            case "DA":
                return "CA";
            case "DC":
                return "CB";
            case "BC":
                return "CC";
            case "BD":
                return "CD";
            case "AA":
                return "DA";
            case "BA":
                return "DB";
            case "CA":
                return "DC";
            case "AB":
                return "DD";
            default:
                return karakter; // Jika karakter tidak terdapat dalam tabel pengganti, biarkan karakter aslinya
        }
    }
}
