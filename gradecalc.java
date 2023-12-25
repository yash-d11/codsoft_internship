import java.util.Scanner;

public class gradecalc {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Grade Calculator\n");
        while (true) {
            
        
            System.out.println("Enter the number of subjects : ");
            int n = sc.nextInt();
            System.out.println("Enter marks obtained in each subject(out of 100)");
            int sum = 0;
            for(int i=1;i<=n;i++){
                System.out.println("Subject"+i+": ");
                int x = sc.nextInt();
                
                    while(x < 0 || x > 100){
                        System.out.print("invalid number :( try again :");
                        x = sc.nextInt();
                    }
                    sum+=x;
                }
            

            System.out.println("\nResult:\n Total marks = "+sum);
            int perc = sum/n;
            System.out.println("Average Percentage :"+perc);
            char grade;
            if (perc >= 85 && perc <= 100) {
                grade = 'A';
            } else if (perc >= 70 && perc < 85) {
                grade = 'B';
            }else if (perc >= 55 && perc < 70) {
                grade = 'C';
            }else if (perc >= 40 && perc < 55) {
                grade = 'D';
            } else {
                grade = 'F'; // Default grade for percentages outside the specified ranges
            }
            if(grade=='F')
            System.out.println("You Failed :(");
            else{
                System.out.println("Grade : "+grade);
            }
            

            System.out.println("If you want to calculate again enter any number OR If you want to stop enter -1");
            int x = sc.nextInt();
            if(x==-1)
            break;
        }
        
    }
    }

