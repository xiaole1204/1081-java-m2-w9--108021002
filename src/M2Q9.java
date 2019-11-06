import java.util.Scanner;

public class M2Q9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int p = Math.max(m,n);
        int g = Math.min(m,n);
        while (true){
            if (p % g == 0){
                break;
            }
            int tmp = p%g;
            p=g;
            g=tmp;
        }
        System.out.println(g);
        System.out.println((n*m) / g);
    }
}
