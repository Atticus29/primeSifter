import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class PrimeSiftingTest {
  @Test
  public void isValidInput_nGreaterThanOne_falseIfNotTrueIfSo(){
    PrimeSifting newPrimeTest = new PrimeSifting();
    assertEquals(false,newPrimeTest.isValidInput(1));
    assertEquals(true,newPrimeTest.isValidInput(4));
  }

  @Test
  public void getPrimeList_returnsArrayList_true(){
    PrimeSifting newPrimeTest = new PrimeSifting();
    assertEquals(true, newPrimeTest.getPrimeList(3) instanceof ArrayList);
  }

  @Test
  public void getPrimeList_returns2asFirstEntry_true(){
    PrimeSifting newPrimeTest = new PrimeSifting();
    assertEquals((Integer)2, newPrimeTest.getPrimeList(10).get(0));
    // assertEquals(1, newPrimeTest.getPrimeList(10).size());
  }

  @Test
  public void getPrimeList_removesNonPrimesFromListOfNumbers_true(){
    PrimeSifting newPrimeTest = new PrimeSifting();
    List<Integer> expectedArray = new ArrayList<Integer>();
    expectedArray.add(2);
    expectedArray.add(3);
    expectedArray.add(5);
    expectedArray.add(7);
    expectedArray.add(11);
    expectedArray.add(13);
    expectedArray.add(17);
    expectedArray.add(19);
    assertEquals(expectedArray, newPrimeTest.getPrimeList(21));
  }



}
