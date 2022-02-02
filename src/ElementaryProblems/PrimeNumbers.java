package ElementaryProblems;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        for(int i = 1; i < 100; i ++)
        {
            if(isPrimeNumber(i))
            {
                System.out.print(" " + i);
            }
        }
    }
    public static boolean isPrimeNumber(int number)
    {
        if(number <= 1)
            return  false;

        for(int i = 2; i <= Math.sqrt(number); i ++)
        {
            if(number % i == 0)
                return false;
        }
        return  true;
    }
}
