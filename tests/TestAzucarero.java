package tests;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class TestAzucarero {
    Azucarero azucarero;

    @Before
    public void setUp(){
        azucarero = new Azucarero(10);
    }

    @Test

    public void deberiaDevolverVerdaderoSiHaySuficienteAzucarEnELAzucarero(){
        

        boolean resultado = azucarero.hasAzucar(5);
        Assert.assertEquals(true , resultado);

        resultado = azucarero.hasAzucar(10);
        Assert.assertEquals(true , resultado);

        
    }

    @Test
    public void deberiaDevolverFalsoPorqueNoHaySuficienteAzucarEnElAzucarero(){
        

        boolean resultado = azucarero.hasAzucar(15);

        Assert.assertEquals(false , resultado);
        
    }

    @Test
    public void deberiaRestarAzucarAlAzucarero(){
        azucarero.giveAzucar(5);

        Assert.assertEquals(5, azucarero.getCantidadDeAzucar());

        azucarero.giveAzucar(2);

        Assert.assertEquals(3, azucarero.getCantidadDeAzucar());
        
    }

}
