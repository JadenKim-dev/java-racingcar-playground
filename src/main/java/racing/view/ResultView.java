package racing.view;

import racing.domain.RacingResult;
import racing.domain.RacingResults;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    private static final String POSITION_UNIT = "-";
    private static final String SEPARATOR = " : ";
    private static final String WINNER_DELIMITER = ",";
    private final RacingResults racingResults;

    public ResultView(RacingResults racingResults) {
        this.racingResults = racingResults;
    }

    public static ResultView of(RacingResults racingResults) {
        return new ResultView(racingResults);
    }

    public void printResult() {
        StringBuilder sb = new StringBuilder();

        sb.append(System.lineSeparator()).append("실행 결과").append(System.lineSeparator());

        Iterator<RacingResult> resultIterator = racingResults.iterator();
        while(resultIterator.hasNext()) {
            RacingResult result = resultIterator.next();
            result.carDTOStream().forEach(carDTO -> sb.append(formatPosition(carDTO)));
        }

        sb.append(formatWinners(racingResults.findWinners()));

        System.out.println(sb);
    }

    private String formatPosition(CarDTO carDTO) {
        StringBuilder sb = new StringBuilder();
        sb.append(carDTO.getName()).append(SEPARATOR);
        for (int i = 0; i < carDTO.getPosition(); i++) {
            sb.append(POSITION_UNIT);
        }
        return sb.append(System.lineSeparator()).toString();
    }

    private String formatWinners(List<CarDTO> winners) {
        StringBuilder sb = new StringBuilder();
        String winnerNames = winners.stream()
                .map(CarDTO::getName).collect(Collectors.joining(WINNER_DELIMITER));
        return sb.append(winnerNames).append("가 최종 우승했습니다.").toString();
    }


}
