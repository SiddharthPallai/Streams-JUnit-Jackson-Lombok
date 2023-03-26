/**
 * @author Sidharth
 */

import org.example.jackson.Car;
import org.example.jackson.Parser;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestParser {
    Parser testParser = new Parser();

    @Test
    public void testJsonToObject_isObjectSame() {
        File file = new File("src/test/java/TestCar.json");
        Car c1 = (Car) testParser.jsonToObject(file, Car.class);
        Car c2 = new Car("Maruti", "white", "auto", 25);
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode() == c2.hashCode());
        assertEquals(c1, c2);
    }

//    @Test
//    public void testObjectToJson_isFileCreated() {
//        Car c = new Car("x", "y", "b", 1);
//        File file = new File("TestFile.json");
//        testParser.objectToJson(file, c.getClass());
//        assertTrue(file.exists());
//    }
}
