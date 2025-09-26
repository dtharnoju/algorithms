import java.util.Scanner;

public class Fibonnacci {
    public static void printFibonnacci(int terms){
        int n =1;
        int A =1;
        int B =1;
        System.out.println("A= "+A+" B= "+B);
        do {
            int C =A+B;
            System.out.println("n= "+n+" C= "+C);
            n=n+1;
            A=B;
            B=C;
        } while (n<terms);
        
        }
    public static void main(String[] args) {
        int myNum=0;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a Number <44:");
            myNum=scanner.nextInt();
        }
        printFibonnacci(myNum);
    }

}