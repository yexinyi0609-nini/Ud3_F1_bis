public class Ejercicio13 {
    public static void main(String[] args) {

        //Un precio inicial(sin IVA)
        double baseImponible = 100.0;

        //Calcular el inporte del IVA(21%)
        double iva = baseImponible * 0.21;

        //Precio final con IVA
        double precioFinal = baseImponible + iva;

        //Mostar en pantalla los precios
        System.out.println("Base imponible:" + baseImponible + " euro");
        System.out.println("IVA (21%)" + iva + " euro");
        System.out.println("---------------------");
        System.out.println("Total factura:" + precioFinal + " euro");

    }

}
