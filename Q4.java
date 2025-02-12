import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Cube root of number = " + Math.cbrt(n));
        System.out.println("Square root of number = " + Math.sqrt(n));
        System.out.println("Absolute Value of number = " + Math.abs(n));
        System.out.println("Random numbers between 0 and 1 = " + Math.random());
        sc.close();
    }
}
