import com.clara.DistanceConverter;
import org.junit.Test;
import static org.junit.Assert.*;

public class MetersToFeetTest {

    @Test
    public void testMetersToFeet()
    {
        // Check to see if the expected result is the same
        // as the actual result from the method.
        // So we expect metersToFeet with an argument of 10 to return 32.8084.
        assertEquals(0, DistanceConverter.metersToFeet(0), 0.001);
        assertEquals(32.8084, DistanceConverter.metersToFeet(10), 0.001);
        assertEquals(164.042, DistanceConverter.metersToFeet(50), 0.001);
        assertEquals(3235.95801, DistanceConverter.metersToFeet(986.32), 0.001);
        assertEquals(24383.931540200865, DistanceConverter.metersToFeet(7432.2223334532236549), 0.001);
    }
}
