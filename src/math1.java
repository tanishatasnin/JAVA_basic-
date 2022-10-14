import java.util.Scanner;

public class math1 {
               public static void main(String[] args) {

                              Scanner input = new Scanner(System.in);
                              System.out.println("Enter the First num =");
                              int num1 = input.nextInt();
                              System.out.println("Enter the second num=");
                              int num2 = input.nextInt();

                              System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                              System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                              System.out.println(num1 + "*" + num2 + "=" + num1 * num2);
                              System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
                              System.out.println(num1 + "%" + num2 + "=" + num1 % num2);
               }
}
