package Base;				/** Указываем на то, что класс принадлежит пакету */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Тест формулы расчета срока вложения
 * @author Токарева, Портнов
 *
 */
class CalculationTest_Calk {

    @Test
    void sroc() {
        assertEquals(30.0, Calculation.Calk(15000, 12000, 10));
    }
    
    @Test
    void sroc1() {
        assertEquals(1380.0, Calculation.Calk(15000, 1200, 10));
    }
    
    @Test
    void sroc2() {
        assertEquals(1380.0, Calculation.Calk(15000, 1200, 10));
    }
  
    @Test
    void sroc3() {
        assertEquals(30.0, Calculation.Calk(15000, 12000, 10));
    }
    
    @Test
    void sroc4() {
        assertEquals(155.3986231401288, Calculation.Calk(265000, 90060, 15));
    }
}
