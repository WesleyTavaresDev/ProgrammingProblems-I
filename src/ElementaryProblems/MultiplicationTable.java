package ElementaryProblems;

import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please, enter the multiplicand: ");
        int multiplicand = sc.nextInt();

        table(multiplicand);
    }

    public static void table(int multiplicand)
    {
       for(int i = 0; i <= 10; i ++)
           System.out.printf("%s x %s -> %s %n", multiplicand, i, multiplicand * i);

    }
}
