import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("Cars 생성 로직")
    void create() {
        Car pobi = new Car("pobi", 1);
        Car crong = new Car("crong", 2);
        Car honux = new Car("honux", 2);
        Cars cars = new Cars(pobi, crong, honux);

        
    }
}
