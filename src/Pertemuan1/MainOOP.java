package Pertemuan1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.InputStreamReader;

public class MainOOP {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //instance of class
        UjiCoba U = new UjiCoba();

        try{
            //blok
            //input
            System.out.println("----INPUT----");
            U.setName(br.readLine());


            //output
            System.out.println("----OUTPUT----");
            U.getName();
        }catch(Exception esc){
            //blok
            System.out.println(esc.getMessage());

        }
    }
}
