import java.util.Scanner; 
public class PrintANumber { 
 public static void main(String[] args) 
{ 
 Scanner reader = new Scanner(System.in); 
 System.out.print("Enter a number: "); 
 int number = reader.nextInt(); 
 // println() prints the following line to the output screen
 System.out.println("You entered: " + number); 
 } 
} 
