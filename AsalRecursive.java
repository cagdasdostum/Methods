import java.util.Scanner;
public class AsalRecursive {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal bir sayı değildir.");
        } else {
            if (asalKontrol(sayi, sayi / 2)) {
                System.out.println(sayi + " asal bir sayıdır.");
            } else {
                System.out.println(sayi + " asal bir sayı değildir.");
            }
        }
    }

    public static boolean asalKontrol(int sayi, int i) {
        if (i == 1) {
            return true; // 1'den küçük hiçbir pozitif sayı asal değildir.
        } else {
            if (sayi % i == 0) {
                return false; // Eğer sayı i'ye bölünüyorsa, asal değildir.
            } else {
                return asalKontrol(sayi, i - 1); // Rekürsif çağrı, bir önceki böleni kontrol etmek için.
            }
        }
    }
}
