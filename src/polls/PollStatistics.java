package polls;
import java.util.Scanner;

public class PollStatistics
{
    Scanner myObj = new Scanner(System.in);
    PollInitialArrays pollInitialArrays = new PollInitialArrays();
    String[][] polls = pollInitialArrays.getPolls();
    public void getNum(int count, int[] answers, String name) // PollScanner 파일에서 선언한 count, answer 변수 불러오기
    {
        PollScanners pollScanners = new PollScanners();
        if (count == 4) // 모든 질문과 답이 끝나면~ 이라는 명령어 추가
        {
            System.out.println(); // 최종으로 모든 입력값 출력 예정
            System.out.println("최종 결과) ");
            System.out.println();
            System.out.println("이름: "+name);
            for (int second = 0; second < answers.length; second++) {
                System.out.print(polls[1][answers[second]] + " ");
            }
            System.out.println();
        }
    }
}