package ElementaryProblems;

import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, digit an integer number");
        System.out.println(multiplesOfThreeOrFiveSum(scanner.nextInt()));
    }

    public static int sum(int n)
    {
        return  n + 1;
    }

    public static  int multiplesOfThreeOrFiveSum(int n)
    {
        if(n % 3 == 0 || n % 5 == 0)
            return  n + 1;
        else
            return  n;
    }
}
