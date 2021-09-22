package racing;

import racing.domain.Car;
import racing.domain.Cars;
import racing.view.InputView;
import racing.view.ResultView;
import racing.view.SplitedNames;

import java.util.Arrays;

public class RacingController {

    private final InputView inputView;

    public RacingController() {
        this.inputView = new InputView();
    }

    public void play() {
        SplitedNames names = SplitedNames.of(inputView.inputCarName());
        Car[] carArray = names.stream()
                .map(Car::of).toArray(Car[]::new);
        Cars cars = new Cars(carArray);

        int num = inputView.inputNum();

        ResultView.start();
        for (int i = 0; i < num; i++) {
            cars.go();
            ResultView.outputCurrentResult(cars);
        }

        ResultView.outputWinners(cars.getWinners());
    }
}
