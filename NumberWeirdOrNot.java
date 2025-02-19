import java.util.Scanner;

public class NumberWeirdOrNot
{

//    private static final Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int N = scanner.nextInt();
//        if(N >= 1 && N <= 100)
//        {
//            if(N%2==0)
//            {
//                System.out.println("Not Weird");
//            }
//        else
//            {
//                System.out.println("Weird");
//            }
//        }
//
//        scanner.close();
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    // Check conditions based on the problem statement
    if (N % 2 == 1) {  // If N is odd
        System.out.println("Weird");
    } else {  // If N is even
        if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        } else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        } else if (N > 20) {
            System.out.println("Not Weird");
        }
    }

    scanner.close();
}
}
