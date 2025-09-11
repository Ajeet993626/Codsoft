import java.util.Scanner;
import java.util.Random;
public class NumberGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int MyNumber=(int)(Math.random()*100);
        int userNum=0;

       do{
             System.out.println("Guess my Number(1-100)??");

              userNum=sc.nextInt();

             if(userNum==MyNumber){
                System.out.println("WOOHOO (^.^) Currect Number.");
                break;
             }
              else if(userNum > MyNumber){
                 System.out.println("Your No. is too High. ");
              }
              else{
                System.out.println("Your No. is too Low. ");
              }
            
        }while(userNum >= 0);

    System.out.println("My number was : ");
    System.out.print(MyNumber);
    }
}