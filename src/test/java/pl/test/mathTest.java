package pl.test;

import java.util.List;

/**
 * Created by RENT on 2017-01-05.
 */
public class mathTest {

    public void Math_Test(){
        //given
        int x = 1;
        int y = 10;
        //when
        Factors factors = new Factors(x, y)
        List<Factors>  factors = Factors.getFactors();

        //then

        assertEquals(factors.size())
        for (int i = 0; i < factors.size(); i++) {
            assertTrue(x = factors.get())
        }




    }

}
