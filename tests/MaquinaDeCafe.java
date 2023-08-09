package tests;

public class MaquinaDeCafe {
    Cafetera cafe;
    Vaso vasosPequenos;
    Vaso vasosMedianos;
    Vaso vasosGrandes;
    Azucarero azucar;

    public MaquinaDeCafe(Cafetera cafe, Vaso vasosPequenos, Vaso vasosMedianos, Vaso vasosGrandes, Azucarero azucar) {
        this.cafe = cafe;
        this.vasosPequenos = vasosPequenos;
        this.vasosMedianos = vasosMedianos;
        this.vasosGrandes = vasosGrandes;
        this.azucar = azucar;
    }

    public String getTipoVaso(String tipoVaso) {
        return tipoVaso; // Simplemente devuelve el tipo de vaso ingresado
    }

    public String getVasoDeCafe(String tipoVaso, int cantidadVasos, int cantidadAzucar) {
        Vaso vasoSeleccionado;

        switch (tipoVaso.toLowerCase()) {
            case "pequeno":
                vasoSeleccionado = vasosPequenos;
                break;
            case "mediano":
                vasoSeleccionado = vasosMedianos;
                break;
            case "grande":
                vasoSeleccionado = vasosGrandes;
                break;
            default:                           
            
            return tipoVaso;
        }

        if (vasoSeleccionado.hasVasos(cantidadVasos) &&
            cafe.hasCafe(cantidadVasos * vasoSeleccionado.getContenido()) &&
            azucar.hasAzucar(cantidadAzucar)) {

            vasoSeleccionado.giveVasos(cantidadVasos);
            cafe.giveCafe(cantidadVasos * vasoSeleccionado.getContenido());
            azucar.giveAzucar(cantidadAzucar);            
        } 
        return tipoVaso;
    }
}

