import java.util.Scanner;
import java.lang.Math;;
class guess{
static int generaterandom(){
    
    return (int)(Math.random()*100);
}
public static void main(String[] args) {
   int score=0;
    Scanner sc = new Scanner(System.in);
    System.out.println("\nGuess the number(Game)");
    System.out.println("You will have 6 tries to guess the correct number");
    System.out.println();
    while(true){
    int count=6;
    
     int num = generaterandom();
    System.out.println("Guess a number between 1 to 100 : ");
    
    
    while(count !=0){
        int n = sc.nextInt();
        while(n<0 && n>100)
        {
            count--;
            if(count==0)
            break;
            System.out.println("The number you entered is not valid. Enter another number : ");
            n = sc.nextInt();
        }
        if(n==num){
        System.out.println("Congratulations You guessed the correct number :), Your Score is"+count);
        score = Math.max(score,count);
        break;}
        else{
            if(n>num)
            System.out.println("Too high, Try again : ");
            else
            System.out.println("Too low, Try again : ");
            count--;
            
        }
    }
    if(count==0)
    System.out.println("You failed :(");
    System.out.println("Max score :"+score);
    System.out.println("If you want to play again enter any number OR If you want to stop enter -1");
    
    int x = sc.nextInt();
    if(x==-1)
    break;
    }
}
}
