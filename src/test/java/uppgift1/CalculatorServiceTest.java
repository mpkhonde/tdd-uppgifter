package uppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    public void testAdd() {
        CalculatorService service = new CalculatorService();
        int result = service.addNumbers(4, 6);
        System.out.println("Resultatet av: 4 + 6 =  " + result);
        assertEquals(10, result); // Förväntat 4 + 6 = 10
    }
}
