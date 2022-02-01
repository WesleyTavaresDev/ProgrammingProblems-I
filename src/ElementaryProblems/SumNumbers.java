package ElementaryProblems;

import java.util.Scanner;

public class SumNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, digit an integer number");
        System.out.println(Sum(scanner.nextInt()));
    }

    public static int Sum(int n)
    {
        return  n + 1;
    }
}
