package StarFigure;

public class StarFigure_02 {
    //Shatunova Kateryna CS-12
    public static void main(String[] args) {
        int n = 5;
        int m = 32;
        int p = 4;
        for (int i=0;i<n; i++){
            int stars=i*p;
            int slashes=(m-stars)/2;
            for (int j=0;j<slashes;j++){
                System.out.print("/");
            }
            for (int j=0;j<stars;j++){
                System.out.print("*");
            }
            for (int j=0;j<slashes;j++){
                System.out.print("\\");
            }
            System.out.println();
        }
    }
}
