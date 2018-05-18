package Base;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * Тесты формулы расчета без капитализации
 * @author 
 *
 */
class Calculation_CalcWithoutCapTest {

    @Test
    void calcWithoutCap() {
        assertEquals(105000.0, Calculation.CalcWithoutCap(100000, 5, 12));
    }

    @Test
    void calcWithoutCap1() {
        assertEquals(115500.0, Calculation.CalcWithoutCap(110000, 5, 12));
    }

    @Test
    void calcWithoutCap2() {
        assertEquals(158704.0, Calculation.CalcWithoutCap(145600, 12, 9));
    }

    @Test
    void calcWithoutCap3() {
        assertEquals(66963.525, Calculation.CalcWithoutCap(65490, 9, 3));
    }

    @Test
    void calcWithoutCap4() {
        assertEquals(9846875.0, Calculation.CalcWithoutCap(9453000, 10, 5));
    }
}
