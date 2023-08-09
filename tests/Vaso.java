package tests;
public class Vaso {
    public static int cantidadVasos = 0;
    public int contenido;

    public Vaso(int contenido, int cantidadVasos){
        this.contenido = contenido;
        Vaso.cantidadVasos = cantidadVasos;
    }
   

    // METODO PARA VERIFICAR SI HAY VASOS SUFICIENTES
    public boolean hasVasos(int vasosSuficientes){
        return cantidadVasos >= vasosSuficientes;
    }

    // METODO PARA ENTREGAR LOS VASOS
    public  void giveVasos(int vasosEntregados){
        if(hasVasos(vasosEntregados)){
            cantidadVasos -= vasosEntregados;
        } else{System.out.println("No hay vasos suficientes");}
    }
    
    // SETTERS y GETTERS
    public int getContenido(){
        return this.contenido;
    }

    public void setContenido(int contenido){
        this.contenido = contenido;
    }

    public  int getCantidadVasos(){
        return cantidadVasos;
    }
    
 
}
