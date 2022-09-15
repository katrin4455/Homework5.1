import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource (resources = {"/testdata.csv"})
    public void test(int limitMin, int limitMax, int expected) {
        SQRService service = new SQRService();

        int actual = service.squareRobot(limitMin, limitMax);

        Assertions.assertEquals(expected, actual);
    }
}
