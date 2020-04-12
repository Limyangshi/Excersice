import java.util.Scanner;
   public class Excersice2Q2{
   
      static Scanner scan =new Scanner(System.in);
      
         public static void main(String [] args){
         String word;
         int n=0;
         
         System.out.print("Enter a sentence:");
         word=scan.nextLine();
         n=0;
            for(int i=0;i<word.length();i++){
               if(word.charAt(i)=='A' || word.charAt(i)=='a'){
                  n++;
                  }
            }
            System.out.print("Number of character 'A' and 'a' found:" +n);
            }//end main 
            
         
                             
    }//end class
                     
      
      
      
   