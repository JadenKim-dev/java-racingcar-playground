package racing;

import racing.domain.*;
import racing.domain.strategy.RacingStrategy;
import racing.domain.strategy.RacingStrategyImpl;
import racing.view.CarDTO;
import racing.view.InputView;
import racing.view.ResultView;
import racing.view.SplitedNames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RacingService {

    private final InputView inputView;
    private final RacingStrategy strategy;

    public RacingService(RacingStrategy strategy) {
        this.strategy = strategy;
        this.inputView = InputView.newInstance();
    }

    public RacingResults play(RepeatNumber repeatNumber, Cars cars) {
        List<RacingResult> racingResultList = new ArrayList<>();
        for (int i = 0; i < repeatNumber.get(); i++) {
            cars.go(strategy);
            List<CarDTO> carDTOList = cars.stream()
                    .map(CarDTO::from).collect(Collectors.toList());
            racingResultList.add(RacingResult.from(carDTOList));
        }
        return RacingResults.of(racingResultList);
    }
}
