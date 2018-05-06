package CalcTest;

import com.calculadora;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author White
 */
public class CalculadoraTest {
    calculadora calc;
    public CalculadoraTest() {
    }
    @Before
    public void antes(){
        calc = new calculadora();
    }
    
    @Test
    public void testSoma(){
        
        assertEquals(5, calc.soma(2, 3));
    }

}
