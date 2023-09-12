public class Tutorial4_1 {

    public static void main(String[] args) {
        System.out.println("The numbers divisible by 8 and multiple of 5 between 1000 and 2000 are: ");
        for(int i=1000;i<=2000;i++) {
            if((i%8==0) && (i%5==0)) {
                System.out.println(i);
            }
        }
    }
}
