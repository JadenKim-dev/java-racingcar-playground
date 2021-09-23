package racing.view;

import racing.domain.Car;
import racing.domain.Cars;

import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    public static final String POSITION_UNIT = "-";
    public static final String SEPARATOR = " : ";
    public static final String WINNER_DELIMITER = ",";

    public static void start() {
        System.out.println(System.lineSeparator() + "실행 결과");
    }

    public static void outputCurrentResult(Cars cars) {
        StringBuilder sb = new StringBuilder();
        cars.stream().map(CarDTO::from)
                .forEach(carDTO -> sb.append(formatPosition(carDTO)));
        System.out.println(sb);
    }

    private static String formatPosition(CarDTO carDTO) {
        StringBuilder sb = new StringBuilder();
        sb.append(carDTO.getName()).append(SEPARATOR);
        for (int i = 0; i < carDTO.getPosition(); i++) {
            sb.append(POSITION_UNIT);
        }
        return sb.append(System.lineSeparator()).toString();
    }

    public static void outputWinners(List<Car> winners) {
        System.out.println(formatWinners(winners));
    }

    private static String formatWinners(List<Car> winners) {
        StringBuilder sb = new StringBuilder();
        String winnerNames = winners.stream().map(CarDTO::from)
                .map(CarDTO::getName).collect(Collectors.joining(WINNER_DELIMITER));
        return sb.append(winnerNames).append("가 최종 우승했습니다.").toString();
    }
}
