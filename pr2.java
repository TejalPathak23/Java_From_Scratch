// Getting Input from User
import java.util.Scanner;

public class pr2 {
    public static void main(String[] args) {

        System.out.println("Taking Input from the user !");
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        int sum = a + b ;
        System.out.println("Sum is " + sum);
        String str = sc.next();
        System.out.println(str);
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
