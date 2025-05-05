import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
      String name = input.nextLine();
      System.out.println("your name : "+ name);   
        


   System.out.println( "enter your age:");
   int age = input.nextInt();
   System.out.println("your age is: "+ age);

   System.out.println( "enter your height: ");
   double height = input.nextDouble();
   System.out.println("\nyour height is:"+  height);
   System.out.println("enter your weight: ");
   float weight = input.nextFloat();
   System.out.println("\n your weaght is : " + weight);


    }
}
