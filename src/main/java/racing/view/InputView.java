package racing.view;

import java.util.Scanner;

public class InputView {

    private final Scanner sc;

    public InputView() {
        this.sc = new Scanner(System.in);
    }

    public String inputCarName() {
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        return sc.nextLine();
    }

    public int inputNum() {
        System.out.println("시도할 회수는 몇회인가요?");
        return sc.nextInt();
    }
}
