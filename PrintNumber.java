public class PrintNumber{
    public static void main(String[] args) {
        int myNum=0;
        System.out.print("Enter a number: ");
        try {
            myNum=System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("My Number Is "+myNum);
    }
}