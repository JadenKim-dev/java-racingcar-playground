import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {
    @Test
    @DisplayName("지정한 이름이 1-5자 사이인지 검증하는 로직")
    void create() {
        assertThatThrownBy(() -> new Car("")).isInstanceOf(IllegalArgumentException.class);
        new Car("1");
        new Car("12345");
        assertThatThrownBy(() -> new Car("123456")).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("랜덤한 값에 따라서 전진 여부를 결정하는 로직")
    void go() {
        Car car = new Car("test1");

        car.go(() -> true);
        assertThat(car.getPosition()).isEqualTo(new Position(1));
    }
}
