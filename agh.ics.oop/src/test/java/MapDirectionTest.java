import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MapDirectionTest {
    @Test
    public void nextTest(){
        Assertions.assertTrue(MapDirection.NORTH.next() == MapDirection.EAST);
        Assertions.assertTrue(MapDirection.EAST.next() == MapDirection.SOUTH);
        Assertions.assertTrue(MapDirection.SOUTH.next() == MapDirection.WEST);
        Assertions.assertTrue(MapDirection.WEST.next() == MapDirection.NORTH);
    }

    @Test
    public void previousTest(){
        Assertions.assertTrue(MapDirection.NORTH.previous() == MapDirection.WEST);
        Assertions.assertTrue(MapDirection.EAST.previous() == MapDirection.NORTH);
        Assertions.assertTrue(MapDirection.SOUTH.previous() == MapDirection.EAST);
        Assertions.assertTrue(MapDirection.WEST.previous() == MapDirection.SOUTH);
    }
}
