import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversedInPlace2(){
    int[] input2= {1,2,3,4};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{4,3,2,1}, input2);
  }

  @Test
  public void testReversedInPlace3(){
    int[] input3= {1,0};
    ArrayExamples.reverseInPlace(input3);
    assertArrayEquals(new int[]{0,1},input3);

  }

  @Test
  public void testReversed2(){
    int[] input2= {2,4,6};
    assertArrayEquals(new int[]{6,4,2}, ArrayExamples.reversed(input2));
  }
}
