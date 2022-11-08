import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CounterTest {

    //Testar antalet tecken utan mellanslag
    @Test
    public void CountCharacters() {
        //Arrange
        Counter count = new Counter();
        long expected = 3;

        //Act
        long actual = count.CountCharacters("hej");

        //Assert
        assertEquals(expected, actual);
    }

    //Testar antalet tecken med mellanslag. Mellanslag räknas inte som tecken.
    @Test
    public void CountCharacters2() {
        //Arrange
        Counter count = new Counter();
        long expected = 8;

        //Act
        long actual = count.CountCharacters("hej på dig");

        //Assert
        assertEquals(expected, actual);
    }

    //Testar rad men fångar inte upp om radräkningen sker korrekt
    @Test
    public void CountRows() {
        //Arrange
        Counter count = new Counter();
        long expected = 1;

        //Act
        long actual = count.CountRows("hej hej");

        //Assert
        assertEquals(expected, actual);
    }

    //Testar rader
    @Test
    public void CountRows2() {
        //Arrange
        Counter count = new Counter();
        long expected = 2;

        //Act
        long actual = count.CountRows("hej\ndå");

        //Assert
        assertEquals(expected, actual);
    }
}




