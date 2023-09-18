
package student_grade;

import java.util.Scanner;

public class StudentGrade {

    
    public static void main(String[] args) {
      
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        String student_Name=s.nextLine();
        
        System.out.print("Enter total Number of Subject mark to be added: "); 
        int total_number_subject=s.nextInt();
        int marks[]=new int[total_number_subject];
        
        
        for(int i=0;i<marks.length;i++){
        
            System.out.print("Enter subject "+(i+1)+" mark ");
            marks[i]=s.nextInt();
        
        }
        
        
        int total_marks=0;
        float avg_marks=0;
       
        for(int i=0;i<marks.length;i++)
        {
        
            total_marks=total_marks+marks[i];
        
        }
        
        avg_marks=total_marks/marks.length;   
        System.out.println("Total Marks "+total_marks);
        System.out.println("Average Marks "+avg_marks);
        
        if(avg_marks>=90)
        {
        
            System.out.println("O grade");
        
        }
        else if(avg_marks>=80)
        {
        
            System.out.println("A+ grade");
        
        }
        else if(avg_marks>=70)
        {
        
            System.out.println("A grade");
        
        }
        else if(avg_marks>=60)
        {
        
            System.out.println("B+ grade");
        
        }
        else if(avg_marks>=50)
        {
        
            System.out.println("B grade");
        
        }
        else if(avg_marks>=40)
        {
        
            System.out.println("C+ grade");
        
        }
        else if(avg_marks>=30)
        {
        
            System.out.println("C grade");
        
        }
        else
        {
        
            System.out.println("Fail");
        
        }
    }
}
