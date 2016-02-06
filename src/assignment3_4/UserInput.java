package assignment3_4;
import java.util.Scanner;
public class UserInput {

	   
    public static void main(String args[]) {
     
       //Java Exmaple to get input from user from command prompt
        System.out.println("Please enter input from command prompt: ");
     
        Scanner inputReader = new Scanner(System.in);
       
        //Getting input in String format
        String name = inputReader.nextLine();
        System.out.println("Hi " + name);
     
        //Getting number as input from command line in Java
        System.out.println("Please enter a number from command line? ");
        int number = inputReader.nextInt();
        System.out.println("You have entered : " + number);
     
        //Getting floating point as input from command line in Java
        System.out.println("Please enter a floating point number from command line? ");
        float decimal = inputReader.nextFloat();
        System.out.println("You have entered : " + decimal);
     
        /*//Java Example to get input from user using GUI
        String input = JOptionPane.showInputDialog("Enter any number of your choice");
        System.out.println("User has entered: " + input);
//
*/        
   
    }
   
}

//Read more: http://javarevisited.blogspot.com/2012/10/java-program-to-get-input-from-user.html#ixzz3zMeWk4pO
