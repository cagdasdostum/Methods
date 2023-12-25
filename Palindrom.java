public class Palindrom {

    public static boolean isPalindrom(int number){

        int temp = number, reversedNumber = 0, lastNumber;

        while(temp != 0) {
            lastNumber = temp % 10;


            reversedNumber = (reversedNumber * 10) + lastNumber;
            temp /= 10;
        }
        if(number == reversedNumber) {
            System.out.println(number + " Palindrom sayıdır.");
            return true;}
        else {
            System.out.println(number + " Palindrom sayı değildir.");
            return false;
        }



    }






    public static void main(String[] args) {
        isPalindrom(656);




    }





}
