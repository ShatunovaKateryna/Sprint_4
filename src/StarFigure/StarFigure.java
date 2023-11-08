package StarFigure;

public class StarFigure {
    //Shatunova Kateryna CS-12
    public static final int HEIGHT = 5;
    public static void main(String[] args) {
        for (int i = 1; i <= HEIGHT; i++) {
            for (int j = 1; j <= 4 * (-i + HEIGHT); j++) {
                System.out.print("/");
            }
            for (int k = 1; k <= 8 * i - 8; k++) {
                System.out.print("*");
            }
            for (int l = 1; l <= 4 * (-i + HEIGHT); l++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
