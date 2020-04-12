import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

   public class Excersice2Q4{
   
      static Scanner scan=new Scanner(System.in);
      
         public static void main(String [] args){
            System.out.print("Enter number 1:");
            int num1=scan.nextInt();
            System.out.print("Enter number 2:");
            int num2=scan.nextInt();
            int randomInt=0;
               
               if(num1>num2){
                  System.out.println("0");
                  }
                     else{
                          randomInt = ThreadLocalRandom.current().nextInt(num1,num2 +1);
                          System.out.println("Random integer between " + num1 + " and " +num2 +": " +randomInt);
                          }
                         }//end main
                      }//end class