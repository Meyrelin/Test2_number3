public class Test2_number3 {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        System.out.println("Input a = " + a);
        System.out.println("Input b = " + b);
        System.out.println("(a+b)= " + (a + b));
        if (a > b) {
            System.out.println("(a-b)= " + (a - b));

        }
        if (a < b) {
            System.out.println("(b-a)= " + (b - a));
        }
        System.out.println("(a*b)= " +(a*b));
    }
}