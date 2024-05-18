public class Reduce {
    public static void main(String[] args) {
        int n = 100;
        int count = 0;
        while (n != 0) {

            boolean divisibleBy2 = n % 2 == 0;
            boolean notDivisibleBy2 = n % 2 == 1;

            if (divisibleBy2) {
                n = n / 2;
            }
            else if (notDivisibleBy2) {
                n = n - 1;

            }

        count += 1;

        }

        System.out.println(count);
    }
}
