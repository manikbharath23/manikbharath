import java.util.Scanner;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int num = 1;
        boolean status = true;
        while (num <= a) {
            if (!status) {
                System.out.print(", ");
            }
            System.out.print(num);
            num += 2;
            status = false;
        }
    }
}
