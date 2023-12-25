import java.util.Scanner;
import java.lang.Math;
public class atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=10000,withdraw,deposit;
        System.out.println("Atm Machine\n");
        while(true){
            System.out.println("\n\ntype 1 for Withdrawing money");  
            System.out.println("type 2 for Depositing money");  
            System.out.println("type 3 for Checking Balance");  
            System.out.println("type 4 for EXIT");  
            
            int ch = sc.nextInt();
            while(ch<0 && ch>4){
                System.out.println("please enter a valid operation");
                ch = sc.nextInt();
            }
            if(ch==1){
                System.out.println("Enter amount to be withdrawn :");
                withdraw = sc.nextInt();
                if(balance >= withdraw)  
                {  
                    
                    balance = balance - withdraw;  
                    System.out.println("Please collect your money");  
                }  
                else  
                {  
                    //show custom error message   
                    System.out.println("Insufficient Balance");  
                }  
            }
            else if(ch==2){
                System.out.println("Enter amount to be deposited :");
                deposit = sc.nextInt();
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully deposited");   
            }
            else if(ch==3)
            System.out.print("your balance is :"+balance);
            else{
                System.exit(0);
            }

        }
    }
    
}
