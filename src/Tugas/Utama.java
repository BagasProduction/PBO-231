package Tugas;
import java.util.*;

public class Utama {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Informasi mengenai alat-alat musik yang sering digunakan");
        System.out.println("Masukkan nama alat musik");
        String musik = input.nextLine();
        switch (musik){
            case"gitar":
                System.out.println("Gitar adalah alat musik yang dimainkan dengan cara dipetik. ");
                System.out.println("Gitar umumnya digunakan dalam berbagai genre musik, termasuk rock, blues, jazz, pop, dan lain-lain.");
                break;
            case"bass":
                System.out.println("Bass atau bass guitar adalah alat musik yang mirip dengan gitar namun memiliki nada yang lebih rendah dan sering digunakan untuk memberikan dasar atau ritme pada musik.");
                System.out.println("ass umumnya memiliki empat senar (tetapi ada juga yang memiliki 5 atau 6 senar) dan memiliki ukuran yang lebih besar daripada gitar.");
                System.out.println(" Suara bass yang dalam dan resonan sering kali menjadi dasar pengiring dalam sebuah band atau orkestra musik.");
                break;
            case"drum":
                System.out.println("Drum adalah salah satu alat musik perkusi yang paling penting dan populer di dunia.");
                System.out.println("Drum adalah alat musik perkusi yang terdiri dari satu atau beberapa drum yang dipasang secara horizontal dan vertikal. ");
                System.out.println("Drum ditepuk dengan stik atau alat pemukul lainnya dan dapat memiliki beberapa komponen tambahan seperti cymbal, hi-hat, snare drum, tom-tom, dan bass drum. ");
                System.out.println("Drum sering menjadi bagian penting dalam sebagian besar genre musik, dan dapat memberikan efek ritmis yang kuat dan menarik serta memperkuat nuansa emosi dalam musik. ");
                break;
            case"keyboard":
                System.out.println("Keyboard adalah sebuah alat musik elektronik yang dirancang untuk meniru atau menghasilkan suara dari berbagai jenis instrumen musik seperti piano, organ, synthesizer, dan lain-lain.");
                System.out.println("Keyboard memiliki tuts yang diatur dalam jarak oktaf dan dapat dimainkan dengan menggunakan jari atau tangan, sehingga memungkinkan pemain untuk memainkan akord, melodi, atau arpeggio.");

        }
    }

}
