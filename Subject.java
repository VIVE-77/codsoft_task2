import java.util.*;
public class Subject{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Subject obj=new Subject();
        System.out.println("enter how many subjects");
        
        int s1=sc.nextInt();
        int sm=0;
        for(int i=1;i<=s1;i++){
            System.out.println("enter the subject"+i+"marks");
            int marks=sc.nextInt();
            sm+=marks;
        }
        double avg=sm/s1;
        
        System.out.println("the total mark is "+sm);
        System.out.println("the average marks is "+avg);
        //System.out.println(avgma/10);
        System.out.println("grade is "+obj.grade(avg));
    }
    static String grade(double s){
        double b=s/10;
        int d=(int) b;
       switch(d){
          case 10:
               return "A+";
          case 9:
               return "A";
          case 8:
               return "B+";
         case 7:
               return "B";  
         case 6:
               return "C";
         case 5:
               return "D";  
         default:
               return "F";     
       }
    }
}