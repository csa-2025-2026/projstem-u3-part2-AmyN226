import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */

    System.out.println("Enter a number");
    double target = 12.345;
    double user_input = scan.nextDouble();

    if (user_input == target)
    {
      System.out.println("YES!");
    }

    
    System.out.println("Enter a number");
    int target2 = 48;
    int user_input2 = scan.nextInt();

    if (user_input2 == target2)
    {
      System.out.println("YES!");
    }

    System.out.println("Enter a number");
    int val1 = scan.nextInt();
    System.out.println("Enter another number");
    int val2 = scan.nextInt();

    if ((2 * val1) == val2)
    {
      System.out.println("YES!");
    }



     System.out.println("Enter a number");
    int val3 = scan.nextInt();



    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
