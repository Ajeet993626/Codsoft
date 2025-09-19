import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Total Subjects");
        int n=sc.nextInt();
        int[]marks=new int[n];
        int total=0;
        for(int i=0; i<n; i++){
            System.out.println("Enter marks for Subject="+(i+1)+".");
            marks[i]=sc.nextInt();
            while (marks[i]<0||marks[i]>100) {
                System.out.println("Not Invalid. Enter Marks 0 and 100.");
                marks[i]=sc.nextInt();
            }
            total+=marks[i];
        }
        double average=total/n;
        char grade;
        if(average>=81){
            grade='A';
        }
        else if(average>=61){
            grade='B';
        }
        else if(average>=51){
            grade='C';
        }
        else if(average>=33){
            grade='D';
        }
        else
        {
            grade='F';
        }
        System.out.println("\nTotal Marks:"+total);
        System.out.println("Average Pecentage:"+average);
        System.out.println("Grade:"+grade);

        sc.close();
    }
}

