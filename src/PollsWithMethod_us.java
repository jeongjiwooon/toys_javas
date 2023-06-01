import pollsus.PollsStatistics;
import pollsus.PollsInitialArrays;
import pollsus.PollsScanners;

public class PollsWithMethod_us
{
    public static void main(String[] args)
    {
        try
        {
            String[] answers = {"", ""};
            String[][] polls;
            PollsInitialArrays pollsInitialArrays = new PollsInitialArrays();
            polls = pollsInitialArrays.init(); // 설문 내용 초기화
            PollsScanners pollsScanners = new PollsScanners();
            answers = pollsScanners.pollWithAnswers(polls);
            PollsStatistics pollsStatistics = new PollsStatistics();
            pollsStatistics.printAnswer(answers);
        }
        catch (Exception e)
        {
            
        }
        // return 0;
    }
}
