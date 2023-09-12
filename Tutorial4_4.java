import java.util.*;
public class Tutorial4_4 {
    void printPattern(int n) {
        for(int i=n;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tutorial4_4 obj = new Tutorial4_4();
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        obj.printPattern(n);
    }
}
