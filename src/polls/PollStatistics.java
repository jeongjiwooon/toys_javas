package polls;
import java.util.Scanner;

public class PollStatistics
{
    Scanner myObj = new Scanner(System.in);
    PollInitialArrays pollInitialArrays = new PollInitialArrays();
    String[][] polls = pollInitialArrays.getPolls();
    int count = 0;
    public void getNum()
    {
        PollScanners pollScanners = new PollScanners();
        System.out.println();

                if (count >= 4)
                {
                    System.out.println("입력 개수가 4개 이상이므로 종료합니다.");
                }
    }
}