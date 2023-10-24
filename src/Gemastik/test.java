package Gemastik;

public class test {
    static class Edge implements Comparable<KolamIkan.Edge> {
        int sumber, tujuan, bobot;

        public Edge(int sumber, int tujuan, int bobot) {
            this.sumber = sumber;
            this.tujuan = tujuan;
            this.bobot = bobot;
        }


        public int compareTo(KolamIkan.Edge lain) {
            return this.bobot - lain.bobot;
        }
    }
}
