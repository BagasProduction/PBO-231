package Gemastik;
import java.util.*;

public class KolamIkan {
    static class Edge implements Comparable<Edge> {
        int sumber, tujuan, bobot;

        public Edge(int sumber, int tujuan, int bobot) {
            this.sumber = sumber;
            this.tujuan = tujuan;
            this.bobot = bobot;
        }


        public int compareTo(Edge lain) {
            return this.bobot - lain.bobot;
        }
    }

    static class DisjointSet {
        int[] induk, peringkat;

        public DisjointSet(int ukuran) {
            induk = new int[ukuran];
            peringkat = new int[ukuran];
            for (int i = 0; i < ukuran; i++) {
                induk[i] = i;
                peringkat[i] = 0;
            }
        }

        public int cari(int x) {
            if (induk[x] != x)
                induk[x] = cari(induk[x]);
            return induk[x];
        }

        public void gabung(int x, int y) {
            int indukX = cari(x);
            int indukY = cari(y);
            if (indukX == indukY)
                return;
            if (peringkat[indukX] > peringkat[indukY])
                induk[indukY] = indukX;
            else if (peringkat[indukX] < peringkat[indukY])
                induk[indukX] = indukY;
            else {
                induk[indukY] = indukX;
                peringkat[indukX]++;
            }
        }
    }

    static int biayaMinimum(Edge[] sisi, int jumlahVertices, int saluranBaruMaks) {
        Arrays.sort(sisi);

        DisjointSet ds = new DisjointSet(jumlahVertices);
        int biayaMin = 0;
        int saluranBaru = 0;

        for (Edge sisiSekarang : sisi) {
            if (ds.cari(sisiSekarang.sumber) != ds.cari(sisiSekarang.tujuan)) {
                ds.gabung(sisiSekarang.sumber, sisiSekarang.tujuan);
                biayaMin += sisiSekarang.bobot;
            } else {
                // Jika kita menggunakan saluran baru, cari sisi dengan bobot maksimum antara dua set
                int biayaDenganSaluranBaru = biayaMin;
                for (int i = 0; i < sisi.length; i++) {
                    Edge sisiLain = sisi[i];
                    if (ds.cari(sisiLain.sumber) != ds.cari(sisiLain.tujuan)) {
                        biayaDenganSaluranBaru += sisiLain.bobot;
                        ds.gabung(sisiLain.sumber, sisiLain.tujuan);
                        break;
                    }
                }

                // Tentukan apakah akan menggunakan saluran baru atau tidak
                if (saluranBaru < saluranBaruMaks) {
                    saluranBaru++;
                    biayaMin = biayaDenganSaluranBaru;
                }
            }

            // Jika kita telah menggunakan semua saluran baru yang diizinkan, keluar dari loop
            if (saluranBaru == saluranBaruMaks) {
                break;
            }
        }

        return biayaMin;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jumlahKolam = scanner.nextInt();
        int jumlahSaluran = scanner.nextInt();
        int saluranBaruMaks = scanner.nextInt();

        int[] biayaAwal = new int[jumlahKolam];
        for (int i = 0; i < jumlahKolam; i++) {
            biayaAwal[i] = scanner.nextInt();
        }

        Edge[] sisi = new Edge[jumlahSaluran];
        for (int i = 0; i < jumlahSaluran; i++) {
            int sumber = scanner.nextInt();
            int tujuan = scanner.nextInt();
            sisi[i] = new Edge(sumber, tujuan, biayaAwal[sumber - 1] + biayaAwal[tujuan - 1]);
        }

        int totalBiayaMinimum = biayaMinimum(sisi, jumlahKolam, saluranBaruMaks);
        System.out.println(totalBiayaMinimum - 2);

        scanner.close();
    }
}


