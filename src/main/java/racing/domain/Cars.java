package racing.domain;

import racing.domain.strategy.RacingStrategyImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Cars {
    private final List<Car> carList;

    public Cars(Car... cars) {
        this.carList = new ArrayList<>();
        carList.addAll(Arrays.asList(cars));
    }

    public List<Car> getWinners() {
        Position maxPosition = new Position(0);
        for (Car car : carList) {
            if(car.isPositionLargerThan(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }

        List<Car> winners = new ArrayList<>();
        for (Car car : carList) {
            if(car.isPositionSameAs(maxPosition)) {
                winners.add(car);
            }
        }
        return winners;
    }

    public void go() {
        RacingStrategyImpl strategy = new RacingStrategyImpl();
        for (Car car : carList) {
            car.go(strategy);
        }
    }

    public Stream<Car> stream() {
        return carList.stream();
    }
}
