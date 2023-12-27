import java.util.Scanner;
public class AdvCalc {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap\n"
                + "Yapmak istediğiniz işlemi tuşlayın.";


        do {
            System.out.println(menu);
            select = scan.nextInt();
            if (!(select >=0 && select <=8)) {
                System.out.println("Hatalı tuşlama yaptınız!"); break; }
            System.out.println("İlk değeri girin: ");
            int a = scan.nextInt();
            System.out.println("İkinci değeri girin: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    plus(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                    System.out.println(a+ " üssü " + b+ " = " + power(a,b));
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a,b);
                    break;
                case 8:
                    rectangle(a,b);
                    break;
                case 0:
                    break;
            }

        }while (select!=0);
    }

    static int plus(int a, int b) {
        int result;
        result = a+b;
        System.out.println(result);
        return result;


    }
    static int minus(int a, int b) {

        int result;
        result = a-b;
        System.out.println(result);
        return result;

    }
    static int times(int a, int b) {

        int result;
        result = a*b;
        System.out.println(result);
        return result;

    }
    static int divide(double a, double b) {

        double result;

        if (b != 0) {
            result = a/b;
            System.out.println(result);
            return (int) result;

        }
        else {
            System.out.println("Bölen sıfır olamaz!!!!");
        }
        return 0;
    }
    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i<=b; i++) {
            result*=a;
        }
        System.out.println(result);
        return result;

    }
    static int factorial(int a) {
        int result = 1;
        for (int i = 1; i<=a; i++) {
            result*=i;

        }
        System.out.println(result);
        return result;


    }
    static int mod(int a, int b) {

        if (b==0) {
            System.out.println("Bölen sıfır olamaz!!!");
            return 0;
        }
        int result = a%b;
        System.out.println(result);
        return result;

    }
    static void rectangle(int a, int b) {

        System.out.println("Alanı: " + a*b);
        System.out.println("Çevresi: " + 2*(a+b));


    }

}
