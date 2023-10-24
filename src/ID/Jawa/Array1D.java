package ID.Jawa;
import java.util.*;

public class Array1D {
    public static void main(String[] args){
        String[] nama = new String[3];
        nama[0] = "Agus";
        nama[1] = "Budi";
        nama[2] = "Yanto";
        System.out.println("Nama mahasiswa ke-1 " +nama[0]);
        System.out.println("Nama mahasiswa ke-2 " +nama[1]);
        System.out.println("Nama mahasiswa ke-3 " +nama[2]);
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa =");
        int N = input.nextInt();
        input.nextLine();
        String[] namaMhs = new String[N];
        String[] jurusMhs = new String[N];
        for(int i=0; i<N; i++) {
            System.out.print("Masukkan nama Mhs ke-" +(i+1)+ "=");
            namaMhs[i] = input.nextLine();
            System.out.print("Masukkan jurusan Mhs ke-"+(i+1)+ "=");
            jurusMhs[i] = input.nextLine();
        }
        for(int i=0; i<N; i++) {
            System.out.println("Nama Mhs ke-" +(i+1)+ "="+namaMhs[i]);
            System.out.println("Jurusan Mhs ke-" +(i+1)+ "="+jurusMhs[i]);
        }


    }
}
