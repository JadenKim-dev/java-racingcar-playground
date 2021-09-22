import java.util.Arrays;

public class RacingController {

    private final InputView inputView;

    public RacingController() {
        this.inputView = new InputView();
    }

    public void play() {
        String[] names = InputConverter.splitNames(inputView.inputCarName());
        Car[] carArray = Arrays.stream(names)
                .map(Car::new).toArray(Car[]::new);
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
