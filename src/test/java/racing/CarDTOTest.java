package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.Car;
import racing.view.CarDTO;

import static org.assertj.core.api.Assertions.assertThat;

public class CarDTOTest {
    @Test
    @DisplayName("뷰에 전달할 DTO 생성")
    void create() {
        Car pobi = new Car("pobi", 4);
        CarDTO carDTO = CarDTO.from(pobi);

        Assertions.assertThat(carDTO.getName()).isEqualTo("pobi");
        Assertions.assertThat(carDTO.getPosition()).isEqualTo("----");
    }
}
