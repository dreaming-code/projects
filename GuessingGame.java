/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class  GuessingGame
{
    static void game(int n)
    {
         Scanner sc=new Scanner(System.in); 
        int l=0,r=0,i=0;
        if(n==1){
             System.out.println("EASY LEVEL ");
        l=10;}
        else if(n==2){
              System.out.println("MEDIUM LEVEL ");
        l=5;}
        else{
              System.out.println("DIFFICULT LEVEL ");
        l=3;
        }
        int y=1+(int)(Math.random()*((100-1)+1));
        for(i=0;i<l;i++)
        {
            System.out.print("YOU HAVE "+(l-i)+" ATTEMPTS LEFT TO GUESS THE NUMBER\nYOUR GUESS :");
            int u=sc.nextInt();
            if(u==y)
            {
                System.out.println("YOU GUESSED IT RIGHT!!");
                break;
            }
            else if(u>y)
            {
                System.out.println("TOO HIGH");
            }
            else
            {
                System.out.println("TOO LOW");
            }
        }
        if(i==l)
        System.out.println("YOU LOST.\nTHE NUMBER WAS "+y+" .\nBETTER LUCK NEXT TIME !!");
        else
        {
            System.out.println("YOUR SCORE : "+(10*(l-i))+" out of "+(10*l));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
        boolean ch=true;
        while(ch==true)
        {
             System.out.println("\t\tWELCOME!!! LET'S BEGIN \nGUESS A NUMBER BETWEEN 1 TO 100");
             System.out.print("CHOOSE :\nFOR EASY LEVEL : 1\nFOR MEDIUM LEVEL : 2\nFOR DIFFICULT LEVEL : 3\nTO EXIT : 4\nEnter your Choice : ");
             int n=sc.nextInt();
             if(n<4 && n>0){
             game(n);
             System.out.println("\t\tWANNA PLAY AGAIN !! : YES OR NO");
             String s=sc.next();
             if(s.equalsIgnoreCase("yes"))
             ch=true;
             else
             ch=false;}
             else if(n<1 || n>4)
             {
                 System.out.println("WRONG CHOICE.");
             }
             else
             ch=false;
        }
        System.out.println("THANKS FOR PLAYING");
    }
}
