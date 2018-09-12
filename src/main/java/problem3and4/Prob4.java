package problem3and4;

import java.util.Scanner;

public class Prob4
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in) ;

        System.out.println("enter a starting number:");
        int start = inp.nextInt() ;
        System.out.println("ok now gimme an ending number");
        int end = inp.nextInt() ;
        if (start <= end)
        {

            while (start <= end)
            {

                System.out.print(start + ",") ;
                start++ ;
            }
            System.out.print("\b") ;
        }
        else
        {
            System.out.println("first number has to be less, bro");
        }
    }
}
