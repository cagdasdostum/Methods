import java.util.Scanner;
public class UsRecursive {

    static int power(int a, int b) {


        int result = 1;

        if(b==0) {
            return 1;
        } else if (a==1) {
            return 1;
        } else {
            return result = a*power(a,b-1);

        }




    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban girin: ");
        int a = scan.nextInt();
        System.out.print("Üs girin: ");
        int b = scan.nextInt();

        System.out.println(power(a,b));


    }
}
