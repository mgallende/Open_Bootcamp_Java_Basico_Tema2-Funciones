package com.mgallende;

public class FuncionesMain {
    // función que calcula el precio con el IVA
    static double precioConIva(double precio) {
        return (precio + precio * 0.21);
    }

    public static void main(String[] args) {
        double precio = 134; //variable con el precio para pasárla como argumento a la función
        double iva = precio * 0.21; // valor del IVA sólo para mostrarlo por consola

        double resultadoConIVA = precioConIva(precio); //llamada a la función que calcula el precio con IVA
        System.out.println("EL precio del producto es de :" + precio + "\nEl IVA correspondiente es de :" + iva + "\n" +
                "El precio, con IVA incluido es de: " + resultadoConIVA);
    }

}

