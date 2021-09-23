package racing.view;

import racing.domain.Car;

public class CarDTO {
    private String name;
    private int position;

    public CarDTO(String name, int position) {
        this.name = name;
        this.position = position;
    }

    private CarDTO(Car car) {
        this.name = car.getName().get();
        this.position = car.getPosition().get();
    }

    public static CarDTO from(Car car) {
        return new CarDTO(car);
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public boolean isPosition(int position) {
        return this.position == position;
    }
}
