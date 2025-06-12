import java.util.Scanner;

public class SumNaturalCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0, i = 1;
            while (i <= n) sum += i++;
            int formulaSum = n * (n + 1) / 2;
            System.out.println("While Loop Sum: " + sum);
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println("Are both sums equal? " + (sum == formulaSum));
        } else {
            System.out.println("Not a natural number");
        }
        sc.close();
    }
}
