package polls;
import java.util.Scanner;

public class PollScanners
{
    public void getPolls()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String name = myObj.nextLine();
        PollInitialArrays pollInitialArrays = new PollInitialArrays();
        String[][] polls = pollInitialArrays.getPolls();
        int answer = 0;
        for (int first = 0; first < polls.length; first++)
        {
            for (int second = 0; second < polls[first].length; second++)
            {
                System.out.print(polls[first][second]);
                if (second == 4)
                {
                    System.out.println();
                    answer = myObj.nextInt();
                    answer = answer - 1;
                    System.out.print("답) "+polls[1][answer]);
                    PollStatistics pollStatistics = new PollStatistics();
                    pollStatistics.getNum();
                }
            }
            System.out.println();
        }
    }
}
