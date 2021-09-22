package racing.domain;

import racing.domain.strategy.RacingStrategy;

public class Car {
    private final CarName name;
    private final Position position;

    private Car(String name) {
        this.name = CarName.of(name);
        this.position = Position.newInstance();
    }

    public static Car of(String name) {
        return new Car(name);
    }

    public Car(String name, int position) {
        this.name = CarName.of(name);
        this.position = new Position(position);
    }

    public void go(RacingStrategy strategy) {
        if(strategy.goOrStop()) {
            this.position.go();
        }
    }

    public Position getPosition() {
        return position;
    }

    public boolean isPositionLargerThan(Position position) {
        return this.position.compareTo(position) > 0;
    }

    public boolean isPositionSameAs(Position position) {
        return this.position.compareTo(position) == 0;
    }

    public CarName getName() {
        return name;
    }
}
