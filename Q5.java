import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sides of a triangle:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("It forms a triangle");


            int max = Math.max(a, Math.max(b, c));
            int x, y;

            if (max == a) {
                x = b;
                y = c;
            } else if (max == b) {
                x = a;
                y = c;
            } else {
                x = a;
                y = b;
            }


            int lhs = x * x + y * y;
            int rhs = max * max;

            if (lhs == rhs) {
                System.out.println("It is a right-angled triangle");
            } else if (lhs > rhs) {
                System.out.println("It is an acute-angled triangle");
            } else {
                System.out.println("It is an obtuse-angled triangle");
            }
        } else {
            System.out.println("It does not form a triangle");
        }
        sc.close();
    }
}
