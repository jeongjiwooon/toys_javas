package pollsus;

public class PollsStatistics
{
    String[] answers;
    public String[] printAnswer(String[] answers)
    {
        try
        {
            for (int first = 0; first < answers.length; first = first + 1)
            {
                System.out.println(answers[first]);
            }
        }
        catch (Exception e)
        {
            
        }
        return answers;
    }
}
