package ID.Jawa;
import java.util.Scanner;

public class Kompetisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan persamaan linier: ");
        String equation = input.nextLine();
        System.out.println(equation);


        equation = equation.replaceAll("\\s", "");


        String[] parts = equation.split("=");
        if (parts.length != 2) {
            System.out.println("Persamaan linier tidak valid!");
            return;
        }
        String leftSide = parts[0];
        String rightSide = parts[1];


        String[] leftParts = leftSide.split("[\\*\\-+/]");
        if (leftParts.length != 2) {
            System.out.println("Persamaan linier tidak valid!");
            return;
        }
        String variable = leftParts[1];


        int result = Integer.parseInt(rightSide) / Integer.parseInt(leftParts[0]);


        System.out.println("Nilai " + variable + ": " + result);
    }
}
