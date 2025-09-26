
import java.io.IOException;
import java.util.Scanner;

public class PrintNumber {

    public static void main(String[] args) throws IOException {
        int myNum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number:");
            myNum = scanner.nextInt();
        }

        System.out.println("You have entered: " + myNum);

    }
}