import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Bir sayı girin: ");
        int number = scanner.nextInt();

        
        if (number % 2 == 0) {
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number.");
        }

        
        scanner.close();
    }
}
