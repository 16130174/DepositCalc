package Base;				/** Указываем на то, что класс принадлежит пакету */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Тест формулы расчета срока вложения
 * @author Токарева, Портнов
 *
 */
class Calculation_CalkTest {

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
    @Test
    void sroc5() {
        assertEquals(70426.66666666667, Calculation.Calk(26500, 90, 5));
    }

    @Test
    void sroc6() {
        assertEquals(438.848254791223, Calculation.Calk(54930, 15430, 7));
    }
    
    @Test
    void sroc7() {
        assertEquals(428.94784995425437, Calculation.Calk(150000, 32790, 10));
    }
    
    @Test
    void sroc8() {
        assertEquals(32670.0, Calculation.Calk(327900, 1200, 10));
    }
    
    @Test
    void sroc9() {
        assertEquals(48885.0, Calculation.Calk(6550, 32, 5));
    }
    

}
