import java.util.Random;
import java.util.Scanner;
public class rockpaperscissor{
    public static void main(String[]args){
        Random rand = new Random();
        System.out.println("Enter 0 for Rock, 1 for Paper, and 2 for Scissors:");
        Scanner userchoice=new Scanner(System.in);
        for(int i=0;i<5;i++){
        int user = userchoice.nextInt();
        int computer = rand.nextInt(3);
        System.out.println("You chose: " + user);
        System.out.println("Computer chose: " + computer);
        if(user==computer){
            System.out.println("It's a tie!");
        }
        else if(user==0 && computer==2){
            System.out.println("computer win!");}
        
        else if(user==1 && computer==0){
            System.out.println("you win!");}
        
        else if(user==2 && computer==1){
            System.out.println("You win!");}
        
        else{
            System.out.println("Computer wins!");
        }

    }
    
}}
