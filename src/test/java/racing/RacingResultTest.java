package racing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racing.domain.RacingResult;
import racing.view.CarDTO;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingResultTest {
    @Test
    @DisplayName("해당 경주 결과에서 승자를 뽑아내는 로직")
    void findCurrentWinners() {
        CarDTO winner1 = new CarDTO("winner1", 3);
        CarDTO winner2 = new CarDTO("winner2", 3);
        CarDTO loser = new CarDTO("loser", 2);
        RacingResult result = RacingResult.from(List.of(winner1, winner2, loser));

        assertThat(result.findCurrentWinners()).containsExactly(winner1, winner2);
    }
}
