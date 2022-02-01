package ElementaryProblems;

import java.util.Scanner;

public class SumOrProductProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want the sum or the product of your number? [sum/product]");
        String decision = scanner.next();

        System.out.println("Please, enter a number: ");
        int number = scanner.nextInt();

        switch (decision)
        {
            case "sum" -> System.out.printf("Result: %s %n", number + 1);
            case "product" ->
                    {
                        System.out.println("Please, enter another number: ");
                        int multiplier = scanner.nextInt();
                        System.out.printf("Result: %s", number * multiplier);
                    }
            default -> throw new IllegalStateException("Invalid operation, choose only sum or product");
        }
    }
}
