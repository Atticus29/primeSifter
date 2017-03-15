import org.junit.*;
import static org.junit.Assert.*;

public class PrimeSiftingTest {
  @Test
  public void getPrimeList_nGreaterThanOne_false(){
    PrimeSifting newPrimeTest = new PrimeSifting();
    assertEquals(false,newPrimeTest.getPrimeList(1));
  }
}
