package racing;

import org.junit.jupiter.api.Test;
import racing.domain.RacingResult;
import racing.domain.RacingResults;
import racing.view.CarDTO;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingResultsTest {
    @Test
    void findWinners() {
        CarDTO firstWinner = new CarDTO("winner", 3);
        CarDTO firstLoser = new CarDTO("loser", 2);
        RacingResult firstResult = RacingResult.from(List.of(firstWinner, firstLoser));

        CarDTO secondWinner = new CarDTO("winner", 4);
        CarDTO secondLoser = new CarDTO("loser", 2);
        RacingResult secondResult = RacingResult.from(List.of(secondWinner, secondLoser));

        RacingResults racingResults = RacingResults.of(List.of(firstResult, secondResult));

        assertThat(racingResults.findWinners()).containsExactly(secondWinner);
    }
}
