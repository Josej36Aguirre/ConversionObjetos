
package test;

import domain.Empleado;
import domain.Escritor;
import domain.TipoEscritura;


public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado = new Escritor(TipoEscritura.CLASICO, "JOse", 5000);
//        System.out.println("empleado = " + empleado);
        System.out.println(empleado.obtenerDetalles());
        
        //downCasting
        ((Escritor) empleado).getTipoEscritura();
        Escritor escritor = (Escritor)empleado;
        escritor.getTipoEscritura();
        
        //Upcasting
        Empleado empleado1 = escritor;
        System.out.println(empleado1.obtenerDetalles());

    }
}
