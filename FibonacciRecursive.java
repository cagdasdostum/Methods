public class FibonacciRecursive {

    public static int fib(int number) {
        if (number == 0)
            return 1;
        if (number == 1)
            return 1;

        return fib(number - 1) + fib(number - 2);


    }


    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(fib(i));
        }


    }
}
