import racing.RacingService;
import racing.domain.Car;
import racing.domain.Cars;
import racing.domain.RacingResults;
import racing.domain.RepeatNumber;
import racing.domain.strategy.RacingStrategyImpl;
import racing.view.InputView;
import racing.view.ResultView;
import racing.view.SplitedNames;

public class RacingMain {
    public static void main(String[] args) {
        RacingStrategyImpl strategy = new RacingStrategyImpl();
        RacingService service = new RacingService(strategy);

        InputView inputView = InputView.newInstance();
        Car[] carArray = SplitedNames.of(inputView.inputCarName()).stream()
                .map(Car::of).toArray(Car[]::new);
        Cars cars = new Cars(carArray);
        RepeatNumber repeatNumber = RepeatNumber.of(inputView.inputNum());

        RacingResults racingResults = service.play(repeatNumber, cars);

        ResultView resultView = ResultView.of(racingResults);
        resultView.printResult();
    }
}
