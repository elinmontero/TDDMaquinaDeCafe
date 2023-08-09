package tests;



import org.junit.Assert;
import org.junit.Test;

public class TestVaso {
    
    @Test

    public void deberiaDevolverVerdaderoSiExistenVasos(){
        Vaso vasosPequenos = new Vaso(2, 10);

        boolean resultado = vasosPequenos.hasVasos(1);

        Assert.assertEquals(true, resultado);        
        
    }

    @Test
    public void deberiaDevolverFalsoSiNoExistenVasos(){
        Vaso vasosPequenos = new Vaso(1, 0);

        boolean resultado = vasosPequenos.hasVasos(1);

        Assert.assertEquals(false , resultado);
        
    }

    @Test
    public void deberiaRestarCantidadDeVasos(){
        Vaso vasosPequenos = new Vaso(5, 5);

        vasosPequenos.giveVasos(1);

        Assert.assertEquals(4, vasosPequenos.getCantidadVasos());
        
    }
}

