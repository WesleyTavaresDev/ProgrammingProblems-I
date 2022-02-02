package ElementaryProblems;

public class LeapYears
{
    public static void main(String[] args)
    {
        System.out.println(nextLeapYears(2024));
    }

    public static int nextLeapYears(int year)
    {
        System.out.println(year);

        if(year == 2100)
            return year;
        else
            return  nextLeapYears( year + 4);

    }
}

