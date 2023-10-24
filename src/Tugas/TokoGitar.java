package Tugas;
import java.util.*;
public class TokoGitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di Surabaya Guitar Store");
        System.out.println("Jenis Gitar apa yang ingin anda beli?");
        String jenis = input.nextLine();
        String jenis2 = "";
        String brand = "";

        if (jenis.equalsIgnoreCase("Akustik")) {
            System.out.println("Bila anda ingin membeli gitar akustik maka jenis gitar akustik apa yang anda akan beli");
             jenis2 = input.nextLine();
            if (jenis2.equalsIgnoreCase("Nylon")) {
                jenis2 = "Nylon";
            } else if (jenis2.equalsIgnoreCase("String")) {
                jenis2 = "String";
            }

        } else if (jenis.equalsIgnoreCase("Elektrik")) {
            System.out.println("Bila anda ingin membeli gitar elektrik maka jenis gitar akustik apa yang anda akan beli");
            jenis2 = input.nextLine();
            if (jenis2.equalsIgnoreCase("Gibson")) {
                System.out.println("Jika anda membeli gitar Gibson maka brand apa yang akan anda pilih");
                 brand = input.nextLine();
                if (brand.equalsIgnoreCase("Les Paul")) {
                    brand = "Gibson Les Paul";
                }else if (brand.equalsIgnoreCase("SG")) {
                    brand = "Gibson SG";
                }
            }else if (jenis2.equalsIgnoreCase("Fender")){
                System.out.println("Jika anda membeli gitar Fender maka brand apa yang akan anda pilih");
                 brand = input.nextLine();
                if (brand.equalsIgnoreCase("Stratocaster")){
                    brand = "Fender Stratocaster";
                }else if (brand.equalsIgnoreCase("Telecaster")){
                    brand = "Fender Stratocaster";
                }
            }

            System.out.println("Jenis Gitar yang akan dipilih =" +jenis);
            System.out.println("Jenis Gitar " +jenis+ " yang akan dipilih = " +jenis2);
            System.out.println("Brand gitar " +jenis2+ " yang akan dipilih = " +brand );
        }

    }
}