package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.Car;
import racing.domain.Position;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    @DisplayName("지정한 이름이 1-5자 사이인지 검증하는 로직")
    void create() {
        assertThatThrownBy(() -> Car.of("")).isInstanceOf(IllegalArgumentException.class);
        Car.of("1");
        Car.of("12345");
        assertThatThrownBy(() -> Car.of("123456")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("랜덤한 값에 따라서 전진 여부를 결정하는 로직")
    void go() {
        Car car = Car.of("test1");

        car.go(() -> true);
        assertThat(car.isPositionSameAs(new Position(1))).isTrue();
    }
}
