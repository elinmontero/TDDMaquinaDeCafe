package tests;
public class Cafetera {
    private int cantidadCafe;

    public Cafetera(int cantidadCafe){
        this.cantidadCafe = cantidadCafe;
    }

     // METODO PARA VERIFICAR SI HAY CAFE SUFICIENTE
     public  boolean hasCafe(int cafeSuficiente){
        return cantidadCafe >= cafeSuficiente;
    }

    // METODO PARA DISPENSAR EL CAFE
    public  void giveCafe(int cafeEntregado){
        if(hasCafe(cafeEntregado)){
            cantidadCafe -= cafeEntregado;
        } else{System.out.println("No hay cafe suficiente");}
    }

     // SETTERS y GETTERS
     public int getCantidadCafe(){
        return cantidadCafe;
     }

     public void setCantidadCafe(int cantidadCafe){
        this.cantidadCafe = cantidadCafe;
     }
}
