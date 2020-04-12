import java.util.Scanner;
   public class Excersice2Q1{
   
      static Scanner input = new Scanner(System.in);
      
         public static void main (String [] args){
            
            double[][] num = new double [11][3];
            int i,j;
            int x=1;
            
            for(i=0;i<num.length;i++){
               for(j=0;j<num[i].length;j++){
               
                  num[i][j]=Math.pow(i,x);
                  x++;
                  }
                  
                  x=1;
                  }
                  System.out.println("Number Square Cube");
                     for(i=0;i<num.length;i++){
                        for(j=0;j<num[i].length;j++){
                           System.out.print((int)num[i][j]+"\t\t\t");
                           }
                              System.out.println();
                              }
                             }//end main
    }//end class 
                  