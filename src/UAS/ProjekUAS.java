package UAS;
import java.util.*;

public class ProjekUAS {
    public static void wisata(Vector<String> IDWisata,Vector<String> NamaKota,
                              Vector<String> Destinasi,Vector<String> Transportasi,
                              Vector<Integer> HargaTrip){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            System.out.print("Masukkan ID Wisata ke-"+i+": ");
            String id = input.nextLine();
            IDWisata.add(id);
            System.out.print("Masukkan Nama Kota ke-"+i+": ");
            String namaKota = input.nextLine();
            NamaKota.add(namaKota);
            System.out.print("Masukkan Destinasi ke-"+i+": ");
            String destinasi = input.nextLine();
            Destinasi.add(destinasi);
            System.out.print("Masukkan Transportasi ke-"+i+": ");
            String transportasi = input.nextLine();
            Transportasi.add(transportasi);
            System.out.print("Masukkan Harga Trip ke-"+i+": ");
            int hargaTrip = Integer.parseInt(input.nextLine());
            HargaTrip.add(hargaTrip);

        }


    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Vector<String> IDWisata = new Vector<>();
        Vector<String> NamaKota = new Vector<>();
        Vector<String> Destinasi = new Vector<>();
        Vector<String> Transportasi = new Vector<>();
        Vector<Integer> HargaTrip = new Vector<>();
        Vector<String> IDWisatawan = new Vector<>();
        Vector<String> NamaWisatawan = new Vector<>();
        Vector<String> Alamat = new Vector<>();
        Vector<String> JenisKelamin = new Vector<>();
        Vector<String> NoTelepon = new Vector<>();
        Vector<String> IDPembelian = new Vector<>();
        Vector<String> TglPendaftaran = new Vector<>();
        Vector<String> IDWisatawan2 = new Vector<>();
        Vector<String> NamaWisatawan2 = new Vector<>();
        Vector<String> IDWisata2 = new Vector<>();
        Vector<String> NamaKota2 = new Vector<>();
        Vector<String> JadwalBrngkt = new Vector<>();
        Vector<String> JnsPembayaran = new Vector<>();
        Vector<Integer> JmlhTiket = new Vector<>();
        Vector<Integer> SubTotal = new Vector<>();
        Vector<Double> Diskon = new Vector<>();
        Vector<Double> Total = new Vector<>();

        wisata(IDWisata,NamaKota,Destinasi,Transportasi,HargaTrip);
        System.out.println("===========================================================");
        System.out.println("Data Wisata");
        for(int i=0; i<IDWisata.size(); i++){
            System.out.println("ID Wisata ke-" + (i + 1) + ": " + IDWisata.get(i));
            System.out.println("Nama Kota ke-" + (i + 1) + ": " + NamaKota.get(i));
            System.out.println("Destinasi ke-" + (i + 1) + ": " + Destinasi.get(i));
            System.out.println("Transportasi ke-" + (i + 1) + ": " + Transportasi.get(i));
            System.out.println("Harga Trip ke-" + (i + 1) + ": " + HargaTrip.get(i));
        }
        System.out.println("===========================================================");



    }
}
