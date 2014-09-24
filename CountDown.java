
import java.util.Scanner;
/**
 * Write a description of class CountDown here.
 * 
 * @author Billy Martin 12406742
 * @version 1.0 05/03/2014
 */
public class CountDown
{

  
   
   public static void Count()
   
   {
       
       
       FileIO reader = new FileIO(); 
       String[] contents = reader.load("dictionary.txt"); //LOADS IN DICTIONARY.TXT TO CONTENTS
       
       Scanner n = new Scanner(System.in);
       System.out.println("Enter the string of random letters: ");
       String letters= n.nextLine();
       
       int highest =0; //DECLARING THE HIGHEST STRING
       int[] ASCIIarray = new int[256]; //ARRAY TO STORE NUMBER OF SPECIFIC LETTERS I GET
       String [] storeArray = new String [contents.length]; //ARRAY TO STORE STRINGS WHICH HAVE SOME OF THE LETTERS IN IT
       
       for(int i=0;i<letters.length();i++) //RUNS THROUGH EACH LETTER
       {
           int p = (int)letters.charAt(i); //CHANGES EACH LETTER INTO INT FORM 
           ASCIIarray[p]++; //INCREMENTS EACH DIFFERENT SLOT ACCORDING TO WHAT LETTER IS FOUND
       
       }
       
       for(int k=0; k<contents.length; k++) //GOES THROUGH EVERY STRING IN DICTIONARY.TXT
       {
         int[]compareArray = new int[256]; //ARRAY TO COMPARE EACH STRING AGAINST ENTERED LETTERS
     
          for(int i=0;i<contents[k].length();i++) //GOING THROUGH THE LENGTH OF THE STRING AT POSITION K
         {
            int q = (int)contents[k].charAt(i); //CHANGES IT TO ITS INT FORM
          
            compareArray[q]++; //INCREMENTS SLOTS FOR EACH STRING IN THE DICTIONARY 
       
         }
       
       int count =0; //DECLARING COUNT
       for(int j=0; j<ASCIIarray.length;j++) //COMPARING THE TWO ARRAYS
       {
           if(compareArray[j]>0)//IF A LETTER OCCURS
           {
             
               if(compareArray[j]>ASCIIarray[j])//OCCURS MORE THAN ONCE IN THE STRING
               {
                   count++; //INCREMENT COUNT
                }
            }
           
        }
        
       
         
         if(count<=1) //IF THE LETTER OCCURS
         {
         
             
             if(contents[k].length()-1>highest) //GETTING THE HIGHEST STRING POSSIBLE
              {
               highest=contents[k].length()-1; //SET HIGHEST TO THAT STRING
               
               for(int h=0; h<storeArray.length; h++)
               {
                   storeArray[h] = null;
                   
                }
                
               
              }
             
              
              if(contents[k].length()-1==highest)
              {
             
                 storeArray[k] = contents[k]; //UPDATE THE HIGHEST
              }
            
          }
         
    }
    
    
    for(int x=0; x<storeArray.length;x++) //PRINT OUT ALL VALUES 
    {
        if(storeArray[x]!=null)
        { 
           System.out.println(storeArray[x]); //PRINT OUT THE STRING WHICH HAS THE MAXIMUM AMOUNT OF LETTERS ENTERED
    
        }  
    }
    
  }

}
