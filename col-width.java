import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner my_scanner = new Scanner(System.in);
       int num = 12345;
      System.out.println("Choose your Selection :" + "\n" + "1. Right-Justified "+ "\n" + "2. Left-Justified" + "\n" + "3. Right-Justified with Padded Zeros on Left ");
      int userInput = my_scanner.nextInt();
      switch(userInput){
          case 1:
              //Right- Justified
              System.out.printf("%-10d", num);
              break;
          case 2:
              //Left- Justified
              System.out.printf("%10d", num);
              break;
          case 3:
              //Right-Justified with Padded Zeros on Left 
              System.out.printf("%010d", num);
              break;
      }
   }
}
