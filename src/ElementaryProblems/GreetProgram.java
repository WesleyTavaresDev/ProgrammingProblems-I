package ElementaryProblems;

import java.util.Scanner;

public class GreetProgram
{
    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hey %s, what's going on?", name);
    }
}
