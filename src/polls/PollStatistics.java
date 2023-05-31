package polls;
import java.util.Scanner;
import java.util.Arrays;

//문항과답항이 있는 항목 , 임의로 받은 답항 5개 변수 2개 만들고
// 파라미터로 문항과 클라이언트에서 받은 항목을 2개로 넘겨야한다. print해야함 
// 1번에 1번 2번문항에 2번째 프린트, 3번항목에 3번받은거 


// Scanner scanner = new Scanner(System.in);
// System.out.print("이름을 입력하세요: ");
// String name = scanner.nextLine();

// PollStatistics pollStatistics = new PollStatistics(name);
// pollStatistics.printName();
// }


public class PollStatistics {


    String [] answers = {"1","2","3","4"}; //임의 답 배열 
    private String name; 

    public PollStatistics(){
    }

    public PollStatistics(String name){ 
        this.name = name;
    }

    public void printName(){
        System.out.println("입력한 이름: " + name); //이름 출력
    }

    public void printanswers(String[] answers) {
        System.out.println(Arrays.toString(answers)); //답 출력
    }
}

// main에서
//  pollStats.printName(); 
//  pollStats.printanswers(answers); 