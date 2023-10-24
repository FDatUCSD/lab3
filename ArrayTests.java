import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {

  @Test
  public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 3 }, input1);
  }

  @Test
  public void testReversed() {
    int[] input1 = {};
    assertArrayEquals(new int[] {}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlace2() {
    int[] input1 = { 1, 2, 3, 4 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, input1);
  }

  @Test
  public void testReversed2() {
    int[] input1 = { 1, 2, 3, 4 };
    assertArrayEquals(new int[] { 4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest0Length() {
    double[] input1 = {};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWithoutLowest1Length() {
    double[] input1 = { 1 };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);
  }

  @Test
  public void testAverageWithoutLowestDuplicates() {
    double[] input = { 1, 1, 5, 6 };
    assertEquals(11.0 / 2, ArrayExamples.averageWithoutLowest(input), 0.01);
  }
}
