import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarDTOTest {
    @Test
    @DisplayName("뷰에 전달할 DTO 생성")
    void create() {
        Car pobi = new Car("pobi", 4);
        CarDTO carDTO = new CarDTO(pobi);

        assertThat(carDTO.getName()).isEqualTo("pobi");
        assertThat(carDTO.getPosition()).isEqualTo("----");
    }
}
