public class Main {

    static int fibSequence(int num) {
        if (num == 1) { // base case
            return 1;
        }
        else if (num == 2) { // base case
            return 1;
        }
        else { // recursive case decreasing to base case
            return (fibSequence(num - 1)) + fibSequence(num - 2);
        }
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("The tenth value of the Fibonacci Sequence: " + fibSequence(num));

        System.out.println("The first 10 values of the Fibonacci Sequence: ");
        for (int i = 1; i <= num; i++) {
            System.out.println(fibSequence(i));
        }

    }
}