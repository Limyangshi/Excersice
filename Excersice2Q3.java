import java.util.Scanner;
   public class Excersice2Q3{
   
      static Scanner scan = new Scanner(System.in);
      
         public static void main(String [] args){
         
            String word;
            int i=0;
            
            System.out.print("Enter a sentence:");
            word=scan.nextLine();
            
               for(i=word.length()-1;i>=0;i--){
                  System.out.print(word.charAt(i));
                  }
                 }//end main 
          }//end class