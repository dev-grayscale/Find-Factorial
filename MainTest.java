import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void factorialV1() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.factorialV1(-1));
    Assertions.assertEquals(1, Main.factorialV1(0));
    Assertions.assertEquals(1, Main.factorialV1(1));
    Assertions.assertEquals(2, Main.factorialV1(2));
    Assertions.assertEquals(6, Main.factorialV1(3));
    Assertions.assertEquals(24, Main.factorialV1(4));
    Assertions.assertEquals(120, Main.factorialV1(5));
    Assertions.assertEquals(720, Main.factorialV1(6));
    Assertions.assertEquals(5040, Main.factorialV1(7));
    Assertions.assertEquals(40320, Main.factorialV1(8));
    Assertions.assertEquals(362880, Main.factorialV1(9));
    Assertions.assertEquals(39916800, Main.factorialV1(11));
    Assertions.assertEquals(479001600, Main.factorialV1(12));
    Assertions.assertEquals(6227020800L, Main.factorialV1(13));
  }

  @Test
  void factorialV2() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> Main.factorialV2(-1));
    Assertions.assertEquals(1, Main.factorialV2(0));
    Assertions.assertEquals(1, Main.factorialV2(1));
    Assertions.assertEquals(2, Main.factorialV2(2));
    Assertions.assertEquals(6, Main.factorialV2(3));
    Assertions.assertEquals(24, Main.factorialV2(4));
    Assertions.assertEquals(120, Main.factorialV2(5));
    Assertions.assertEquals(720, Main.factorialV2(6));
    Assertions.assertEquals(5040, Main.factorialV2(7));
    Assertions.assertEquals(40320, Main.factorialV2(8));
    Assertions.assertEquals(362880, Main.factorialV2(9));
    Assertions.assertEquals(39916800, Main.factorialV2(11));
    Assertions.assertEquals(479001600, Main.factorialV2(12));
    Assertions.assertEquals(6227020800L, Main.factorialV2(13));
  }
}
