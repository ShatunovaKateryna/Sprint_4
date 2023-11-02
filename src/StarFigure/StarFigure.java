package StarFigure;

public class StarFigure {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        for (int i = 1; i <= 16; i++) {
            System.out.print("/");
        }
        for (int j = 1; j <= 16; j++) {
            System.out.print("\\");
        }
        System.out.println();
        for (int k = 0; k < 4; k++) {
            for (int j = 0; j < 12 - k * 4; j++) {
                System.out.print("/");
            }
            for (int i = 0; i < 8 + k * 8; i++) {
                System.out.print("*");
            }
            for (int i = 0; i < 12 - k * 4; i++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}