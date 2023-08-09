package tests;
public class Azucarero {
    private int cantidadDeAzucar;

    public Azucarero(int cantidadDeAzucar){
        this.cantidadDeAzucar = cantidadDeAzucar;
    }

     // METODO PARA VERIFICAR SI HAY AZUCAR SUFICIENTE
     public  boolean hasAzucar(int azucarSuficiente){
        return cantidadDeAzucar >= azucarSuficiente;
    }

    // METODO PARA AGREGAR AZUCAR AL CAFE 
    public  void giveAzucar(int azucarEntregado){
        if(hasAzucar(azucarEntregado)){
            cantidadDeAzucar -= azucarEntregado;
        } else{System.out.println("No hay azucar suficiente");}
    }

     // SETTERS y GETTERS
     public int getCantidadDeAzucar(){
        return this.cantidadDeAzucar;
     }

     public void setCantidadDeAzucar(int cantidadDeAzucar){
        this.cantidadDeAzucar = cantidadDeAzucar;
     }
}
