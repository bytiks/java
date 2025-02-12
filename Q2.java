public class Q2 {
    public static void main(String[] args) { //0 1 1 2 3 5 8 ....
        int a = 0, b = 1, next;
        System.out.print(a  + " " + b + " ");
        for(int i = 3; i<=10; i++ ){
            next = a + b;
            System.out.print(next + " ");
            a = b;
            b = next;
        }
    }
}
