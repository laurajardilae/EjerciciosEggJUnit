public class Calculator {
    //private double precio;
    //private double descuento;

    public double productoEnDescuento(double precio, double descuento){
        double precioFinal= precio-(precio*descuento/100);
        return precioFinal;
    }


}
