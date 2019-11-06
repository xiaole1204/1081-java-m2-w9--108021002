import java.util.Scanner;

public class M2Q9hehe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = 0;
        for (int i = a;i>=2;i--){
            if (a % i==0 && b%i == 0){
                c=i;
                break;
            }
        }
        System.out.println(c);
        System.out.println((a*b) / c);
    }
}
