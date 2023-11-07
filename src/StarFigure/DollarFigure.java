package StarFigure;

import java.util.Scanner;
public class DollarFigure {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int HEIGHT =(int)scanner.nextDouble();
        for(int i = 1; i <= HEIGHT; i++) {
            for(int j = 0; j < 2 * i - 2; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < -i + HEIGHT + 1; j++) {
                System.out.print("$");
            }
            for(int j = 0; j < -2 * i + 2 * HEIGHT + 2; j++) {
                System.out.print("*");
            }
            for(int j = 0; j < -i + HEIGHT + 1; j++) {
                System.out.print("$");
            }
            for(int j = 0; j < 2 * i - 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
