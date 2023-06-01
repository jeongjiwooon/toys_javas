package polls;
import java.util.Scanner;

public class PollScanners
{
    int count = 0;
    public void getPolls()
    {
        Scanner myObj = new Scanner(System.in);
        System.out.println("이름을 입력해주세요.");
        String name = myObj.nextLine();
        PollInitialArrays pollInitialArrays = new PollInitialArrays();
        String[][] polls = pollInitialArrays.getPolls(); // InitialArrays 파일에서 polls 불러오기
        int answer = 0;
        int[] answers = new int[4];
        for (int first = 0; first < polls.length; first++)
        {
            for (int second = 0; second < polls[first].length; second++)
            {
                System.out.print(polls[first][second]); // polls 배열에 있는 문항 출력
                if (second == 4) // 문제 출력이 끝나면 답 입력
                {
                    System.out.println();
                    answer = myObj.nextInt();
                    answer = answer - 1; // 배열 = 0, 1, 2 순서니까 입력값에서 - 1
                    System.out.print("답) "+polls[1][answer]);
                    answers[count] = answer;
                    count ++; // count 변수 + 1
                    PollStatistics pollStatistics = new PollStatistics();
                    pollStatistics.getNum(count, answers, name);
                }
            }
            System.out.println();
        }
    }
}
