import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite N: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.println("N = " + n);
    }
}
