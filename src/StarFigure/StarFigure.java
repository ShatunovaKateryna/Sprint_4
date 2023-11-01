package StarFigure;

public class StarFigure {
    //Shatunova Kateryna CS-12
    public static final int HEIGHT=5;
    public static final int WIDTH=2;
    public static void main(String[] args) {
        for (int j=1;j<=WIDTH*8;j++){
            System.out.print("/");
            }
        for (int j=1;j<=WIDTH*8;j++){
            System.out.print("\\");
        }
        System.out.println();
        for (int j=1;j<=WIDTH*6;j++){
            System.out.print("/");
        }
        for (int j=1;j<=WIDTH*4;j++){
            System.out.print("*");
        }
        for (int j=1;j<=WIDTH*6;j++){
            System.out.print("\\");
        }
        System.out.println();
        for (int j=1;j<=WIDTH*4;j++){
            System.out.print("/");
        }
        for (int j=1;j<=WIDTH*8;j++){
            System.out.print("*");
        }
        for (int j=1;j<=WIDTH*4;j++){
            System.out.print("\\");
        }
        System.out.println();
        for (int j=1;j<=WIDTH*2;j++){
            System.out.print("/");
        }
        for (int j=1;j<=WIDTH*12;j++){
            System.out.print("*");
        }
        for (int j=1;j<=WIDTH*2;j++){
            System.out.print("\\");
        }
        System.out.println();
        for (int j=1;j<=WIDTH*16;j++){
            System.out.print("*");
        }
    }
    }

