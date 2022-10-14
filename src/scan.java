import java.util.Scanner;

public class scan {
               public static void main(String[] args) {

                              Scanner in = new Scanner(System.in);
                              System.out.println("Enter the first num=");
                              int num1 = in.nextInt();
                              System.out.println("Enter the Second num=");
                              int num2 = in.nextInt();

                              System.out.println(num1 + "x" + num2 + "=" + num1 * num2);

               }
}
