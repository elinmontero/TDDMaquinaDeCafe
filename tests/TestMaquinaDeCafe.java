package tests;

// ELIN ALGENES ENCARNACION MONTERO  /  2019-8580

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestMaquinaDeCafe {
    
    MaquinaDeCafe maquinaDeCafe;
    

    @Before
    public void setUp(){
        
        maquinaDeCafe = new MaquinaDeCafe(new Cafetera(1000), new Vaso(100, 10), new Vaso(100, 10), new Vaso(100, 10), new Azucarero(500));
       

    }

    @Test

    public void deberiaDevolverUnVasoPequeno(){
        
        assertEquals("pequeno", maquinaDeCafe.getTipoVaso("pequeno"));
                        
       
            }

    @Test

    public void deberiaDevolverUnVasoMediano(){
       
        assertEquals("mediano", maquinaDeCafe.getTipoVaso("mediano"));
    }

    @Test

    public void deberiaDevolverUnVasoGrande(){
       
       assertEquals("grande", maquinaDeCafe.getTipoVaso("grande"));
    }
    


}
