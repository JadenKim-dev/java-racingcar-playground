package racing.view;

import racing.domain.Car;
import racing.domain.Cars;

import java.util.List;

public class ResultView {
    public static void start() {
        System.out.println(System.lineSeparator() + "실행 결과");
    }

    public static void outputCurrentResult(Cars cars) {
        StringBuilder sb = new StringBuilder();
        cars.stream().map(CarDTO::from)
                .forEach(carDTO -> sb.append(carDTO).append(System.lineSeparator()));
        System.out.println(sb);
    }

    public static void outputWinners(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        winners.stream().map(CarDTO::from)
                .forEach(carDTO -> sb.append(carDTO.getName()).append(", "));
        sb.delete(sb.length() - 2, sb.length()).append("가 최종 우승했습니다.");
        System.out.println(sb);
    }
}
