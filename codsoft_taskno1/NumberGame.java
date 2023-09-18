
package number_game;

import java.util.Scanner;

public class Number_game {

    public static void main(String[] args) 
    {
        
        int highest_score=0;
        boolean next_time=true;
        
        
        while(next_time)
        {  
            
           int random_number=(int)(Math.random()*(100-1))+1;
           Scanner s=new Scanner(System.in);
           int score=10;
           int count=10;
           
           
           while(count>0)
           {
               
                System.out.print("Enter the number to guess: ");
                int given_value=s.nextInt();
                
                
                if(random_number==given_value)
                {
                    
                    System.out.println("Correct Number");
                    System.out.println("Your Score : "+score);
                    break;
                    
                }
                else{
                    
                    if(random_number>given_value)
                    {
                        
                        System.out.println("Given Number is too Low");
                        score--;
                        
                    }
                    else
                    {
                        score--;
                        System.out.println("Given Number is too High");
                    
                    }
                } 
                count--;
            }
      
            if(highest_score<score)
            {
                
                 highest_score=score;
            
            }
      
            System.out.println("Current Score "+score);
            System.out.println("Highest Score"+highest_score);
            System.out.print("Are you want to play again (yes: 1 / No : 0): ");
            int ss=s.nextInt();
  
            if(ss==1)
            {
                
                next_time=true;
            
            }
            else
            {
             
                break;   
            
            }
        }
        
     
        System.out.println("Thank you for play this Game, We will meet next time.....");
    
    }
}
