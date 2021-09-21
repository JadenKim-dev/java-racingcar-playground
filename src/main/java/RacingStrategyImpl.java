import java.util.Random;

public class RacingStrategyImpl implements RacingStrategy{
    public static final int CRITERIA = 4;
    public static final int RANDOM_MAX_BOUND = 10;

    @Override
    public boolean goOrStop() {
        return getRandomValue() >= CRITERIA;
    }

    private int getRandomValue() {
        Random random = new Random();
        return random.nextInt(RANDOM_MAX_BOUND);
    }
}
