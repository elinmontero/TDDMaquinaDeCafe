package tests;

import org.junit.Test;
import org.junit.Assert;

public class TestCafetera {
    @Test

    public void deberiaDevolverVerdaderoSiExistenCafe(){
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(5);

        Assert.assertEquals(true , resultado);
        
    }

    @Test
    public void deberiaDevolverFalsoSiNoExisteCafe(){
        Cafetera cafetera = new Cafetera(10);

        boolean resultado = cafetera.hasCafe(11);

        Assert.assertEquals(false , resultado);
        
    }

    @Test
    public void deberiaRestarCafeAlaCafetera(){
        Cafetera cafetera = new Cafetera(10);

       cafetera.giveCafe(7);

        Assert.assertEquals(3, cafetera.getCantidadCafe());
        
    }

}
