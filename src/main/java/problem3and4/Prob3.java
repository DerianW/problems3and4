package problem3and4 ;

import java.util.Scanner ;

public class Prob3
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in) ;

        System.out.println("Gimme an integer 20 or less... but not too much less!") ;

        int number = inp.nextInt() ;

        if (number <= 20)
        {
            while (number <= 20)
            {
                System.out.println(number) ;
                number++ ;
            }
        }
        else
        {
            System.out.println("Hey... that's more than 20, dude!") ;
        }
    }
}
