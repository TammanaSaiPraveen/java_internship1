import java.util.*;
import java.lang.*;
class NumberGuessing
{
    public static void main(String args[])
    {
        int i,guess_number;
        Scanner sc=new Scanner(System.in);
        int trails=3;
        int rand=(int)(100*Math.random());
        int number=1+rand;
        System.out.println("A number is chosen between 1 to 100. Guess the number within 3 trials.");
        for(i=0;i<trails;i++)
        {
            System.out.println("Enter Guess number : ");
            guess_number=sc.nextInt();
            if(number==guess_number)
            {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
            else if(number>guess_number && i!=trails-1)
            {
                System.out.println("The number is greater than guessnumber ");
            }
            else 
            {
                System.out.println("The number is lessthan the guessnumber");
            }
        }
        if(i==trails)
        {
            System.out.println("You have completed 3 trails");
        }
    }
}
