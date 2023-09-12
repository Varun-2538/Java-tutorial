import java.util.*;
public class Tutorial4_3 {
    int calculateNum(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>=48 && str.charAt(i)<=57) {
                count++;
            }
        }
        return count;
    }

    int calculateLetter(String str) {
        int count = 0;
        for(int i=0;i<str.length();i++) {
            if((str.charAt(i)>=65 && str.charAt(i)<=90)
                || (str.charAt(i)>=97 && str.charAt(i)<=122)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Tutorial4_3 obj = new Tutorial4_3();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inp = sc.nextLine();
        int numCount = obj.calculateNum(inp), letterCount = obj.calculateLetter(inp);
        System.out.println("No. of numbers: "+numCount);
        System.out.println("No. of letters: "+letterCount);
    }
}
