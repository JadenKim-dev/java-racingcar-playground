package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.Car;
import racing.domain.Cars;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("우승자를 결정하는 로직")
    void getWinner() {
        Car pobi = new Car("pobi", 1);
        Car crong = new Car("crong", 2);
        Car honux = new Car("honux", 2);
        Cars cars = new Cars(pobi, crong, honux);

        Assertions.assertThat(cars.getWinners()).containsExactly(crong, honux);
    }
}
