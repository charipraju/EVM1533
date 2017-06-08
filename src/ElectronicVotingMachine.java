
import java.io.*;
public class ElectronicVotingMachine 
{
  public static void main(String args[])
       {
        
        try
        {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int n;
        int num;
        int max;
 
   
    System.out.println(" Electronic Voting Machine. " );
   
   
         System.out.println("\n Enter the starting seriel no.: ");
         num = Integer.parseInt(b.readLine());
 
 
            do
              {
              System.out.printf("%s%d%s","\n\t Enter your vote ",num,"");
     	      System.out.println("\n\t Press 1 for Bharatiya Janata Party");
              System.out.println("\n\t Press 2 for Indian National Congress");
              System.out.println("\n\t Press 3 for Independant");
              System.out.println("\n\t Press 4 for NOTA ");
              System.out.println("\n\t Enter 0 to stop voting and display the result");
              n = Integer.parseInt(b.readLine());
              System.out.printf("\t%s%d%s",num," Your Vote Has Been Succesfully Casted "); 
              num++;
 
              if ( n == 1)
               {
                c1++;
               }
               else if ( n == 2 )
                 {
                  c2++;
                 }
                 else if ( n == 3 )
                   {
                   c3++;
                   }
                   else if ( n == 4 )
                     {
                     c4++;
                     }
 
             }
              while ( n != 0 );
            
            
             
            max = c1;
 
              if ( c2 > max )
                 {
                  max = c2;
                 }
                 else if ( c3 > max )
                  {
                   max = c3;
                  }
                  else if ( c4 > max )
                      {
                       max = c4; 
                      }
 
 
 
 
 
               if ( max == c1 )
                 {
                  System.out.printf("%s%d%s%s"," Winner Of The Election Is Bharatiya Janata Party with ",c1," votes ");
                 }
                  else  if ( max == c2 )
                   {
                   System.out.printf("%s%d%s%s"," Winner Of The Election Is Indian National Congress with ",c2," votes ");
                   }
                    else  if ( max == c3 )
                    {
                    System.out.printf("%s%d%s%s"," Winner Of The Election Is Independant with ",c3," votes ");
                    }
                     else  if ( max == c1 )
                     {
                     System.out.printf("%s%d%s%s"," Winner Of The Election Is NOTA with ",c4," votes ");
                     }
 
 
 
 
 
              System.out.println("\nElection Results In Detail ");
              System.out.printf("%s%d%s","\n\tBharatiya Janata Party HAs Got ",c1," Votes");
              System.out.printf("%s%d%s","\n\tIndian National Congress HAs Got ",c2," Votes");
              System.out.printf("%s%d%s","\n\tIndependant HAs Got ",c3," Votes");  
              System.out.printf("%s%d%s","\n\tNOTA HAs Got ",c4," Votes");
               
 
 
 
      }
      catch (Exception e){} 
     }
 
 
 
}
