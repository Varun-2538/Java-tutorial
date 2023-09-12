import java.util.*;
public class Tutorial4_2 {
    String reverse(String str) {
        String ans = "";
        for(int i=str.length()-1;i>=0;i--) {
            ans+=str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Tutorial4_2 obj = new Tutorial4_2();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original string: ");
        String str = sc.nextLine();
        String ans = obj.reverse(str);
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+ans);
    }
}
