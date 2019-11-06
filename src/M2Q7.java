import java.util.Scanner;

public class M2Q7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int listen,read,speak,failNum;
        for (int i=0;i<n;i++){
            failNum = 0;
            listen = scn.nextInt();
            read = scn.nextInt();
            speak = scn.nextInt();
            if (listen <60){
                failNum++;
            } if (read <60){
                failNum++;
            }if (speak <60){
                failNum++;
            } if (failNum ==0){
                System.out.println("P");
            } else if (failNum ==1){
                if (listen+read+speak>=200){
                    System.out.println("P");
                }
            } else {
                System.out.println("M");
            }
        }
    }
}
