package Base;						/** Указываем на то, что класс принадлежит пакету */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Тест формулы расчета с капитализацией 
 * @author Мягков
 *
 */
class Calculation_CalcWithCapTest {
    @Test
    void calcWithCap() {
        assertEquals(179585.632602213, Calculation.CalcWithCap(100000, 5, 12));
    }

    @Test
    void calcWithCap1() {
        assertEquals(197544.1958624343, Calculation.CalcWithCap(110000, 5, 12));
    }

    @Test
    void calcWithCap2() {
        assertEquals(316227.66148680047, Calculation.CalcWithCap(145600, 12, 9));
    }

    @Test
    void calcWithCap3() {
        assertEquals(70010.78390953124, Calculation.CalcWithCap(65490, 9, 3));
    }

    @Test
    void calcWithCap4() {
        assertEquals(1.1593471338719502E7, Calculation.CalcWithCap(9453000, 10, 5));
    }
}
