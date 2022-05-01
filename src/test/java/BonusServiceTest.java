import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    public void shouldCalcBonusIfSmallAmountAndIsReg() {
        BonusService service = new BonusService();
        long actual = service.calculate(1000_60, true);
        long expected = 30;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldCalcBonusIfHugeAmountAndIsReg() {
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_000_60, true);
        long expected = 500;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBonusIfSmallAmountAndNotReg() {
        BonusService service = new BonusService();
        long actual = service.calculate(1000_60, false);
        long expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBonusIfHugeAmountAndNotReg() {
        BonusService service = new BonusService();
        long actual = service.calculate(1_000_000_60, false);
        long expected = 500;
        Assertions.assertEquals(expected, actual);
    }
}
