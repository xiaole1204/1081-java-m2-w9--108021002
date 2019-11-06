import java.util.Scanner;

public class M2Q18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0,j=0;
        String str = " ";
        for (int i = 1;i < n;i++){
            j = i;
            str = " ";
            sum = 0;
            while (sum<n && j<n){
                sum +=j;
                if (sum == n){
                    str = str +Integer.toString(j);
                    System.out.println(str);
                }
            }
        }
    }
}
